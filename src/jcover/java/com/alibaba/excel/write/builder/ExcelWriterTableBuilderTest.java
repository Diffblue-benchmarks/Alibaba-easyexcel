package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.write.metadata.WriteTable;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterTableBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterTableBuilderTest {

    @Test
    void tableNoTableNoIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.tableNo(1), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void build() {
        WriteTable result = new ExcelWriterTableBuilder().build();
        assertThat(result.getTableNo(), is(nullValue()));
        assertThat(result.getTableStyle(), is(nullValue()));
        assertThat(result.getAutomaticMergeHead(), is(nullValue()));
        assertThat(result.getCustomWriteHandlerList(), empty());
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
        assertThat(result.getLocale(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(result.getUseScientificFormat(), is(nullValue()));
    }

    @Test
    void doWriteDataIsEmpty() {
        new ExcelWriterTableBuilder(new com.alibaba.excel.ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new java.io.ByteArrayOutputStream())), new com.alibaba.excel.write.metadata.WriteSheet()).doWrite(new ArrayList());
    }

    @Test
    void automaticMergeHeadAutomaticMergeHeadIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.automaticMergeHead(false), sameInstance(excelWriterTableBuilder));
    }
}
