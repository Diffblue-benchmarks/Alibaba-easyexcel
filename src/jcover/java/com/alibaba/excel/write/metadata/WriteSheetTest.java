package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteSheet
 *
 * @author Diffblue Cover
 */

class WriteSheetTest {

    @Test
    void factory() throws Exception {
        WriteSheet writeSheet = new WriteSheet();
        HashMap<Integer, Integer> columnWidthMap =
             new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        writeSheet.setColumnWidthMap(columnWidthMap);
        writeSheet.setSheetName("Acme");
        writeSheet.setSheetNo(1);
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
        writeSheet.setTableStyle(tableStyle);
        writeSheet.setAutomaticMergeHead(false);
        ArrayList<WriteHandler> customWriteHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = mock(WriteHandler.class);
        customWriteHandlerList.add(writeHandler);
        writeSheet.setCustomWriteHandlerList(customWriteHandlerList);
        LinkedList<String> excludeColumnFiledNames = new LinkedList<String>();
        excludeColumnFiledNames.add("data.txt");
        writeSheet.setExcludeColumnFiledNames(excludeColumnFiledNames);
        LinkedList<Integer> excludeColumnIndexes = new LinkedList<Integer>();
        excludeColumnIndexes.add(1);
        writeSheet.setExcludeColumnIndexes(excludeColumnIndexes);
        LinkedList<String> includeColumnFiledNames = new LinkedList<String>();
        includeColumnFiledNames.add("data.txt");
        writeSheet.setIncludeColumnFiledNames(includeColumnFiledNames);
        LinkedList<Integer> includeColumnIndexes = new LinkedList<Integer>();
        includeColumnIndexes.add(1);
        writeSheet.setIncludeColumnIndexes(includeColumnIndexes);
        writeSheet.setNeedHead(false);
        writeSheet.setRelativeHeadRowIndex(1);
        writeSheet.setUseDefaultStyle(false);
        writeSheet.setAutoTrim(false);
        writeSheet.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = mock(Converter.class);
        customConverterList.add(converter);
        writeSheet.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        writeSheet.setHead(head);
        Locale locale = new Locale("en");
        writeSheet.setLocale(locale);
        writeSheet.setUse1904windowing(false);
        writeSheet.setUseScientificFormat(false);
        assertThat(writeSheet.getColumnWidthMap().get(1), is(1));
        assertThat(writeSheet.getSheetName(), is("Acme"));
        assertThat(writeSheet.getSheetNo(), is(1));
        assertThat(writeSheet.getTableStyle(), sameInstance(tableStyle));
        assertThat(writeSheet.getAutomaticMergeHead(), is(false));
        assertThat(writeSheet.getCustomWriteHandlerList().size(), is(1));
        assertThat(writeSheet.getCustomWriteHandlerList().get(0), sameInstance(writeHandler));
        assertThat(writeSheet.getExcludeColumnFiledNames(), hasSize(1));
        assertTrue(writeSheet.getExcludeColumnFiledNames().contains("data.txt"));
        assertThat(writeSheet.getExcludeColumnIndexes(), hasSize(1));
        assertTrue(writeSheet.getExcludeColumnIndexes().contains(1));
        assertThat(writeSheet.getIncludeColumnFiledNames(), hasSize(1));
        assertTrue(writeSheet.getIncludeColumnFiledNames().contains("data.txt"));
        assertThat(writeSheet.getIncludeColumnIndexes(), hasSize(1));
        assertTrue(writeSheet.getIncludeColumnIndexes().contains(1));
        assertThat(writeSheet.getNeedHead(), is(false));
        assertThat(writeSheet.getRelativeHeadRowIndex(), is(1));
        assertThat(writeSheet.getUseDefaultStyle(), is(false));
        assertThat(writeSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) writeSheet.getClazz(), equalTo((Class) String.class));
        assertThat(writeSheet.getCustomConverterList().size(), is(1));
        assertThat(writeSheet.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(writeSheet.getHead().size(), is(1));
        assertThat(writeSheet.getHead().get(0), sameInstance(list));
        assertThat(writeSheet.getLocale(), sameInstance(locale));
        assertThat(writeSheet.getUse1904windowing(), is(false));
        assertThat(writeSheet.getUseScientificFormat(), is(false));
    }
}
