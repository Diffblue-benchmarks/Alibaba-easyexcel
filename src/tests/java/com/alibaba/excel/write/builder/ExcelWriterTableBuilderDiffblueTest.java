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
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterTableBuilder
 *
 * @author Diffblue JCover
 */

public class ExcelWriterTableBuilderDiffblueTest {

    @Test(timeout=10000)
    public void build() {
        WriteTable result = new ExcelWriterTableBuilder().build();
        assertThat(result.getTableNo(), is(nullValue()));
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
        new ExcelWriterTableBuilder(new com.alibaba.excel.ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new java.io.ByteArrayOutputStream())), new com.alibaba.excel.write.metadata.WriteSheet()).doWrite(new ArrayList());
    }

    @Test(timeout=10000)
    public void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void headClazzIsString() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.head(String.class), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void headHeadIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.head(new ArrayList<java.util.List<String>>()), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void needHeadNeedHeadIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.needHead(false), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter1() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        Converter converter = mock(Converter.class);
        assertThat(excelWriterTableBuilder.registerConverter(converter), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter2() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder(new ExcelWriter(new WriteWorkbook()), new WriteSheet());
        Converter converter = mock(Converter.class);
        assertThat(excelWriterTableBuilder.registerConverter(converter), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void registerWriteHandler() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        WriteHandler writeHandler2 = mock(WriteHandler.class);
        assertThat(excelWriterTableBuilder.registerWriteHandler(writeHandler2), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void tableNoTableNoIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.tableNo(1), sameInstance(excelWriterTableBuilder));
    }

    @Test(timeout=10000)
    public void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.useDefaultStyle(false), sameInstance(excelWriterTableBuilder));
    }
}
