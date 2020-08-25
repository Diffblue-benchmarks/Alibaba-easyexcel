package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterSheetBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterSheetBuilderTest {

    @Test
    void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void headHeadIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.head(new ArrayList<List<String>>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void headClazzIsString() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.head(String.class), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void needHeadNeedHeadIsFalse() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.needHead(false), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.useDefaultStyle(false), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void registerConverter1() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.registerConverter(new AutoConverter()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void registerConverter2() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder(new ExcelWriter(new ByteArrayOutputStream(), ExcelTypeEnum.XLS));
        assertThat(excelWriterSheetBuilder.registerConverter(new AutoConverter()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void registerWriteHandler() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.registerWriteHandler(new LoopMergeStrategy(1, 0)), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void sheetNoSheetNoIsOne() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.sheetNo(1), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void sheetNameSheetNameIsAcme() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.sheetName("Acme"), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void includeColumnFiledNamesIncludeColumnFiledNamesIsEmpty() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.includeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void build() {
        WriteSheet result = new ExcelWriterSheetBuilder().build();
        assertThat(result.getColumnWidthMap().isEmpty(), is(true));
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
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

    @Test
    void doWriteDataIsEmpty() {
        new ExcelWriterSheetBuilder(new ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new ByteArrayOutputStream()))).doWrite(new ArrayList());
    }

    @Test
    void doFillDataIsNull() {
        new ExcelWriterSheetBuilder(new ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new ByteArrayOutputStream()))).doFill(null);
    }

    @Test
    void table() {
        // pojo ExcelWriterTableBuilder
        // pojo ExcelWriterTableBuilder
    }
}
