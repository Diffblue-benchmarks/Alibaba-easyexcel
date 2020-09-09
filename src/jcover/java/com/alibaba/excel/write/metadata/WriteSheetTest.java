package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

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
    void factory() {
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
        writeSheet.setCustomWriteHandlerList(new ArrayList<WriteHandler>());
        writeSheet.setExcludeColumnFiledNames(new LinkedList<String>());
        writeSheet.setExcludeColumnIndexes(new LinkedList<Integer>());
        writeSheet.setIncludeColumnFiledNames(new LinkedList<String>());
        writeSheet.setIncludeColumnIndexes(new LinkedList<Integer>());
        writeSheet.setNeedHead(false);
        writeSheet.setRelativeHeadRowIndex(1);
        writeSheet.setUseDefaultStyle(false);
        writeSheet.setAutoTrim(false);
        writeSheet.setClazz(String.class);
        writeSheet.setCustomConverterList(new ArrayList<Converter>());
        writeSheet.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        writeSheet.setLocale(locale);
        writeSheet.setUse1904windowing(false);
        writeSheet.setUseScientificFormat(false);
        assertThat(writeSheet.getColumnWidthMap().get(1), is(1));
        assertThat(writeSheet.getSheetName(), is("Acme"));
        assertThat(writeSheet.getSheetNo(), is(1));
        assertThat(writeSheet.getTableStyle(), sameInstance(tableStyle));
        assertThat(writeSheet.getAutomaticMergeHead(), is(false));
        assertThat(writeSheet.getCustomWriteHandlerList(), empty());
        assertThat(writeSheet.getExcludeColumnFiledNames(), empty());
        assertThat(writeSheet.getExcludeColumnIndexes(), empty());
        assertThat(writeSheet.getIncludeColumnFiledNames(), empty());
        assertThat(writeSheet.getIncludeColumnIndexes(), empty());
        assertThat(writeSheet.getNeedHead(), is(false));
        assertThat(writeSheet.getRelativeHeadRowIndex(), is(1));
        assertThat(writeSheet.getUseDefaultStyle(), is(false));
        assertThat(writeSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) writeSheet.getClazz(), equalTo((Class) String.class));
        assertThat(writeSheet.getCustomConverterList(), empty());
        assertThat(writeSheet.getHead(), empty());
        assertThat(writeSheet.getLocale(), sameInstance(locale));
        assertThat(writeSheet.getUse1904windowing(), is(false));
        assertThat(writeSheet.getUseScientificFormat(), is(false));
    }
}
