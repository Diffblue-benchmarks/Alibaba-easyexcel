package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterSheetBuilder
 *
 * @author Diffblue JCover
 */

public class ExcelWriterSheetBuilderDiffblueTest {

    @Test(timeout=10000)
    public void build() {
        WriteSheet result = new ExcelWriterSheetBuilder().build();
        assertThat(result.getColumnWidthMap().isEmpty(), is(true));
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
        assertThat(result.getTableStyle(), is(nullValue()));
        assertTrue(result.getCustomWriteHandlerList().isEmpty());
        assertThat(result.getExcludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getExcludeColumnIndexes(), is(nullValue()));
        assertThat(result.getIncludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getIncludeColumnIndexes(), is(nullValue()));
        assertThat(result.getNeedHead(), is(nullValue()));
        assertThat(result.getRelativeHeadRowIndex(), is(nullValue()));
        assertThat(result.getUseDefaultStyle(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void doWriteDataIsEmpty() {
        new ExcelWriterSheetBuilder(new com.alibaba.excel.ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new java.io.ByteArrayOutputStream()))).doWrite(new ArrayList());
    }

    @Test(timeout=10000)
    public void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void headClazzIsString() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.head(String.class), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void headHeadIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.head(new ArrayList<java.util.List<String>>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void includeColumnFiledNamesIncludeColumnFiledNamesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.includeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void needHeadNeedHeadIsFalse() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.needHead(false), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter1() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        Converter converter = mock(Converter.class);
        assertThat(excelWriterSheetBuilder.registerConverter(converter), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter2() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder(new ExcelWriter(new WriteWorkbook()));
        Converter converter = mock(Converter.class);
        assertThat(excelWriterSheetBuilder.registerConverter(converter), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void registerWriteHandler() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        WriteHandler writeHandler2 = mock(WriteHandler.class);
        assertThat(excelWriterSheetBuilder.registerWriteHandler(writeHandler2), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void sheetName() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.sheetName("/bin/bash"), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void sheetNoSheetNoIsOne() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.sheetNo(1), sameInstance(excelWriterSheetBuilder));
    }

    @Test(timeout=10000)
    public void table() {
        // pojo ExcelWriterTableBuilder
        // pojo ExcelWriterTableBuilder
    }

    @Test(timeout=10000)
    public void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.useDefaultStyle(false), sameInstance(excelWriterSheetBuilder));
    }
}
