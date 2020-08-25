package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderSheetBuilder
 *
 * @author Diffblue Cover
 */

class ExcelReaderSheetBuilderTest {

    @Test
    void sheetNoSheetNoIsOne() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.sheetNo(1), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void sheetNameSheetNameIsAcme() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.sheetName("Acme"), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.headRowNumber(1), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void headHeadIsEmpty() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.head(new ArrayList<List<String>>()), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void headClazzIsString() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.head(String.class), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void registerConverter() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.registerConverter(new AutoConverter()), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void registerReadListener() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.registerReadListener(new ModelBuildEventListener()), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void use1904windowingUse1904windowingIsFalse() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.use1904windowing(false), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void autoTrimAutoTrimIsFalse() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.autoTrim(false), sameInstance(excelReaderSheetBuilder));
    }

    @Test
    void build() {
        ReadSheet result = new ExcelReaderSheetBuilder().build();
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
        assertThat(result.getCustomReadListenerList(), empty());
        assertThat(result.getHeadRowNumber(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
    }
}
