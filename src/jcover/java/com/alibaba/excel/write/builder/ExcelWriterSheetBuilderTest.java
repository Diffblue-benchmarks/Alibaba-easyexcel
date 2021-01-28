package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterSheetBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterSheetBuilderTest {

    @Test
    void factory() {
        GenerateParam generateParam =
             new GenerateParam("name", String.class, new ByteArrayOutputStream());
        generateParam.setClazz(String.class);
        generateParam.setNeedHead(false);
        generateParam.setOutputStream(new ByteArrayOutputStream());
        generateParam.setSheetName("name");
        generateParam.setType(ExcelTypeEnum.XLS);
        // pojo ExcelWriterSheetBuilder new ExcelWriterSheetBuilder(new ExcelWriter(generateParam))
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
    void build() {
        WriteSheet result = new ExcelWriterSheetBuilder().build();
        assertThat(result.getColumnWidthMap(), anEmptyMap());
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
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
        new ExcelWriterSheetBuilder(new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()))).doWrite(new ArrayList<String>());
    }

    @Test
    void automaticMergeHeadAutomaticMergeHeadIsFalse() {
        ExcelWriterSheetBuilder excelWriterSheetBuilder =
             new ExcelWriterSheetBuilder();
        assertThat(excelWriterSheetBuilder.automaticMergeHead(false), sameInstance(excelWriterSheetBuilder));
    }

    @Test
    void table() {
        // pojo ExcelWriterTableBuilder new ExcelWriterSheetBuilder().table()
        // pojo ExcelWriterTableBuilder new ExcelWriterSheetBuilder().table(1)
    }
}
