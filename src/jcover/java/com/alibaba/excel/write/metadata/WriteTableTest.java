package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

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
        writeTable.setAutomaticMergeHead(false);
        ArrayList<WriteHandler> customWriteHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
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
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        customConverterList.add(converter);
        writeTable.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("foo");
        head.add(stringList);
        writeTable.setHead(head);
        Locale locale = new Locale("en");
        writeTable.setLocale(locale);
        writeTable.setUse1904windowing(false);
        writeTable.setUseScientificFormat(false);
        assertThat(writeTable.getTableNo(), is(1));
        assertThat(writeTable.getTableStyle(), sameInstance(tableStyle));
        assertThat(writeTable.getAutomaticMergeHead(), is(false));
        assertThat(writeTable.getCustomWriteHandlerList(), hasSize(1));
        assertThat(writeTable.getCustomWriteHandlerList().get(0), sameInstance(writeHandler));
        assertThat(writeTable.getExcludeColumnFiledNames(), hasSize(1));
        assertThat(writeTable.getExcludeColumnFiledNames().contains("data.txt"), is(true));
        assertThat(writeTable.getExcludeColumnIndexes(), hasSize(1));
        assertThat(writeTable.getExcludeColumnIndexes().contains(1), is(true));
        assertThat(writeTable.getIncludeColumnFiledNames(), hasSize(1));
        assertThat(writeTable.getIncludeColumnFiledNames().contains("data.txt"), is(true));
        assertThat(writeTable.getIncludeColumnIndexes(), hasSize(1));
        assertThat(writeTable.getIncludeColumnIndexes().contains(1), is(true));
        assertThat(writeTable.getNeedHead(), is(false));
        assertThat(writeTable.getRelativeHeadRowIndex(), is(1));
        assertThat(writeTable.getUseDefaultStyle(), is(false));
        assertThat(writeTable.getAutoTrim(), is(false));
        assertThat((Class<String>) writeTable.getClazz(), equalTo((Class) String.class));
        assertThat(writeTable.getCustomConverterList(), hasSize(1));
        assertThat(writeTable.getCustomConverterList().get(0), is(notNullValue()));
        assertThat(writeTable.getHead(), hasSize(1));
        assertThat(writeTable.getHead().get(0), equalTo(Arrays.asList("foo")));
        assertThat(writeTable.getLocale(), sameInstance(locale));
        assertThat(writeTable.getUse1904windowing(), is(false));
        assertThat(writeTable.getUseScientificFormat(), is(false));
    }
}
