package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderSheetBuilder
 *
 * @author Diffblue Cover
 */

class ExcelReaderSheetBuilderTest {

    @Test
    void factory() {
        ExcelReader excelReader = mock(ExcelReader.class);
        // pojo ExcelReaderSheetBuilder
    }

    @Test
    void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder =
             new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.headRowNumber(1), sameInstance(excelReaderSheetBuilder));
    }

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
        assertThat(result.getLocale(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(result.getUseScientificFormat(), is(nullValue()));
    }
}
