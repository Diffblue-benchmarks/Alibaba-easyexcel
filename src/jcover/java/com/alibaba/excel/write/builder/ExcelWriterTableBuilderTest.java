package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterTableBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterTableBuilderTest {

    @Test
    void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void headHeadIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.head(new ArrayList<List<String>>()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void headClazzIsString() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.head(String.class), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void needHeadNeedHeadIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.needHead(false), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.useDefaultStyle(false), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void registerConverter1() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.registerConverter(new AutoConverter()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void registerConverter2() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder(new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream())), new WriteSheet());
        assertThat(excelWriterTableBuilder.registerConverter(new AutoConverter()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void registerWriteHandler() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.registerWriteHandler(new LoopMergeStrategy(1, 0)), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void tableNoTableNoIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.tableNo(1), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void includeColumnFiledNamesIncludeColumnFiledNamesIsEmpty() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder(new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream())), new WriteSheet());
        assertThat(excelWriterTableBuilder.includeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void build() {
        WriteTable result = new ExcelWriterTableBuilder().build();
        assertThat(result.getTableNo(), is(nullValue()));
        assertThat(result.getTableStyle(), is(nullValue()));
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
        assertThat(result.getUse1904windowing(), is(nullValue()));
    }
}
