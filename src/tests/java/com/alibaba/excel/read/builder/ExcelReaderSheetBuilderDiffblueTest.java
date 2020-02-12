package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderSheetBuilder
 *
 * @author Diffblue JCover
 */

public class ExcelReaderSheetBuilderDiffblueTest {

    @Test(timeout=10000)
    public void autoTrimAutoTrimIsFalse() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.autoTrim(false), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void build() {
        ReadSheet result = new ExcelReaderSheetBuilder().build();
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
        assertTrue(result.getCustomReadListenerList().isEmpty());
        assertThat(result.getHeadRowNumber(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void headClazzIsString() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.head(String.class), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void headHeadIsEmpty() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.head(new ArrayList<java.util.List<String>>()), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.headRowNumber(1), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        Converter converter = mock(Converter.class);
        assertThat(excelReaderSheetBuilder.registerConverter(converter), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void registerReadListener() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        ReadListener readListener = mock(ReadListener.class);
        assertThat(excelReaderSheetBuilder.registerReadListener(readListener), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void sheetName() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.sheetName("/bin/bash"), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void sheetNoSheetNoIsOne() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.sheetNo(1), sameInstance(excelReaderSheetBuilder));
    }

    @Test(timeout=10000)
    public void use1904windowingUse1904windowingIsFalse() {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
        assertThat(excelReaderSheetBuilder.use1904windowing(false), sameInstance(excelReaderSheetBuilder));
    }
}
