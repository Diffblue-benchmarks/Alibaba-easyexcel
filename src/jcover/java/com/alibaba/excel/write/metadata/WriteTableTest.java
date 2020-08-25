package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteTable
 *
 * @author Diffblue Cover
 */

class WriteTableTest {

    @Test
    void factory() {
        WriteTable writeTable = new WriteTable();
        writeTable.setTableNo(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        Font tableContentFont = new Font();
        tableContentFont.setBold(false);
        tableContentFont.setFontHeightInPoints((short) 1);
        tableContentFont.setFontName("Acme");
        tableStyle.setTableContentFont(tableContentFont);
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        Font tableHeadFont = new Font();
        tableHeadFont.setBold(false);
        tableHeadFont.setFontHeightInPoints((short) 1);
        tableHeadFont.setFontName("Acme");
        tableStyle.setTableHeadFont(tableHeadFont);
        writeTable.setTableStyle(tableStyle);
        ArrayList<WriteHandler> customWriteHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = new LoopMergeStrategy(1, 1);
        customWriteHandlerList.add(writeHandler);
        writeTable.setCustomWriteHandlerList(customWriteHandlerList);
        LinkedList<String> excludeColumnFiledNames = new LinkedList<String>();
        excludeColumnFiledNames.add("data.txt");
        writeTable.setExcludeColumnFiledNames(excludeColumnFiledNames);
        LinkedList<Integer> excludeColumnIndexes = new LinkedList<Integer>();
        excludeColumnIndexes.add(1);
        writeTable.setExcludeColumnIndexes(excludeColumnIndexes);
        LinkedList<String> includeColumnFiledNames = new LinkedList<String>();
        includeColumnFiledNames.add("data.txt");
        writeTable.setIncludeColumnFiledNames(includeColumnFiledNames);
        LinkedList<Integer> includeColumnIndexes = new LinkedList<Integer>();
        includeColumnIndexes.add(1);
        writeTable.setIncludeColumnIndexes(includeColumnIndexes);
        writeTable.setNeedHead(false);
        writeTable.setRelativeHeadRowIndex(1);
        writeTable.setUseDefaultStyle(false);
        writeTable.setAutoTrim(false);
        writeTable.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        writeTable.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        writeTable.setHead(head);
        writeTable.setUse1904windowing(false);
        assertThat(writeTable.getTableNo(), is(1));
        assertThat(writeTable.getTableStyle(), sameInstance(tableStyle));
        assertThat(writeTable.getCustomWriteHandlerList().size(), is(1));
        assertThat(writeTable.getCustomWriteHandlerList().get(0), sameInstance(writeHandler));
        assertThat(writeTable.getExcludeColumnFiledNames(), hasSize(1));
        assertTrue(writeTable.getExcludeColumnFiledNames().contains("data.txt"));
        assertThat(writeTable.getExcludeColumnIndexes(), hasSize(1));
        assertTrue(writeTable.getExcludeColumnIndexes().contains(1));
        assertThat(writeTable.getIncludeColumnFiledNames(), hasSize(1));
        assertTrue(writeTable.getIncludeColumnFiledNames().contains("data.txt"));
        assertThat(writeTable.getIncludeColumnIndexes(), hasSize(1));
        assertTrue(writeTable.getIncludeColumnIndexes().contains(1));
        assertThat(writeTable.getNeedHead(), is(false));
        assertThat(writeTable.getRelativeHeadRowIndex(), is(1));
        assertThat(writeTable.getUseDefaultStyle(), is(false));
        assertThat(writeTable.getAutoTrim(), is(false));
        assertThat((Class<String>) writeTable.getClazz(), equalTo((Class) String.class));
        assertThat(writeTable.getCustomConverterList().size(), is(1));
        assertThat(writeTable.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(writeTable.getHead().size(), is(1));
        assertThat(writeTable.getHead().get(0), sameInstance(list));
        assertThat(writeTable.getUse1904windowing(), is(false));
    }
}
