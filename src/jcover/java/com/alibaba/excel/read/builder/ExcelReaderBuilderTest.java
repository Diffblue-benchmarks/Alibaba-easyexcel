package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderBuilder
 *
 * @author Diffblue Cover
 */

class ExcelReaderBuilderTest {

    @Test
    void excelTypeExcelTypeIsXls() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.excelType(ExcelTypeEnum.XLS), sameInstance(excelReaderBuilder));
    }

    @Test
    void file1() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.file(new StringBufferInputStream("/bin/bash")), sameInstance(excelReaderBuilder));
    }

    @Test
    void file2() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.file("data.txt"), sameInstance(excelReaderBuilder));
    }

    @Test
    void mandatoryUseInputStreamMandatoryUseInputStreamIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.mandatoryUseInputStream(false), sameInstance(excelReaderBuilder));
    }

    @Test
    void autoCloseStreamAutoCloseStreamIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.autoCloseStream(false), sameInstance(excelReaderBuilder));
    }

    @Test
    void ignoreEmptyRowIgnoreEmptyRowIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.ignoreEmptyRow(false), sameInstance(excelReaderBuilder));
    }

    @Test
    void customObject() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.customObject(new Object()), sameInstance(excelReaderBuilder));
    }

    @Test
    void readCache() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.readCache(new Ehcache(1)), sameInstance(excelReaderBuilder));
    }

    @Test
    void readCacheSelector() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.readCacheSelector(new EternalReadCacheSelector(new Ehcache(1))), sameInstance(excelReaderBuilder));
    }

    @Test
    void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.headRowNumber(1), sameInstance(excelReaderBuilder));
    }

    @Test
    void headHeadIsEmpty() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.head(new ArrayList<List<String>>()), sameInstance(excelReaderBuilder));
    }

    @Test
    void headClazzIsString() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.head(String.class), sameInstance(excelReaderBuilder));
    }

    @Test
    void registerConverter() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.registerConverter(new AutoConverter()), sameInstance(excelReaderBuilder));
    }

    @Test
    void registerReadListener() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.registerReadListener(new ModelBuildEventListener()), sameInstance(excelReaderBuilder));
    }

    @Test
    void use1904windowingUse1904windowingIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.use1904windowing(false), sameInstance(excelReaderBuilder));
    }

    @Test
    void autoTrimAutoTrimIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.autoTrim(false), sameInstance(excelReaderBuilder));
    }

    @Test
    void passwordPasswordIsSecret() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.password("secret"), sameInstance(excelReaderBuilder));
    }
}
