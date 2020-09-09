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
        tableStyle.setTableContentFont(new Font());
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        tableStyle.setTableHeadFont(new Font());
        writeTable.setTableStyle(tableStyle);
        writeTable.setAutomaticMergeHead(false);
        writeTable.setCustomWriteHandlerList(new ArrayList<WriteHandler>());
        writeTable.setExcludeColumnFiledNames(new LinkedList<String>());
        writeTable.setExcludeColumnIndexes(new LinkedList<Integer>());
        writeTable.setIncludeColumnFiledNames(new LinkedList<String>());
        writeTable.setIncludeColumnIndexes(new LinkedList<Integer>());
        writeTable.setNeedHead(false);
        writeTable.setRelativeHeadRowIndex(1);
        writeTable.setUseDefaultStyle(false);
        writeTable.setAutoTrim(false);
        writeTable.setClazz(String.class);
        writeTable.setCustomConverterList(new ArrayList<Converter>());
        writeTable.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        writeTable.setLocale(locale);
        writeTable.setUse1904windowing(false);
        writeTable.setUseScientificFormat(false);
        assertThat(writeTable.getTableNo(), is(1));
        assertThat(writeTable.getTableStyle(), sameInstance(tableStyle));
        assertThat(writeTable.getAutomaticMergeHead(), is(false));
        assertThat(writeTable.getCustomWriteHandlerList(), empty());
        assertThat(writeTable.getExcludeColumnFiledNames(), empty());
        assertThat(writeTable.getExcludeColumnIndexes(), empty());
        assertThat(writeTable.getIncludeColumnFiledNames(), empty());
        assertThat(writeTable.getIncludeColumnIndexes(), empty());
        assertThat(writeTable.getNeedHead(), is(false));
        assertThat(writeTable.getRelativeHeadRowIndex(), is(1));
        assertThat(writeTable.getUseDefaultStyle(), is(false));
        assertThat(writeTable.getAutoTrim(), is(false));
        assertThat((Class<String>) writeTable.getClazz(), equalTo((Class) String.class));
        assertThat(writeTable.getCustomConverterList(), empty());
        assertThat(writeTable.getHead(), empty());
        assertThat(writeTable.getLocale(), sameInstance(locale));
        assertThat(writeTable.getUse1904windowing(), is(false));
        assertThat(writeTable.getUseScientificFormat(), is(false));
    }
}
