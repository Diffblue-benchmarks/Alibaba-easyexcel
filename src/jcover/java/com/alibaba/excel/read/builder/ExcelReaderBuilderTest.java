package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderBuilder
 *
 * @author Diffblue JCover
 */

public class ExcelReaderBuilderTest {

    @Test(timeout=10000)
    public void autoCloseStreamAutoCloseStreamIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.autoCloseStream(false), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void autoTrimAutoTrimIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.autoTrim(false), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void customObject() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.customObject(new Object()), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void excelTypeExcelTypeIsXLS() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.excelType(ExcelTypeEnum.XLS), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void file1() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.file(new StringBufferInputStream("Broadway")), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void file2() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.file("/bin/bash"), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void headClazzIsString() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.head(String.class), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void headHeadIsEmpty() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.head(new ArrayList<java.util.List<String>>()), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.headRowNumber(1), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void ignoreEmptyRowIgnoreEmptyRowIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.ignoreEmptyRow(false), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void mandatoryUseInputStreamMandatoryUseInputStreamIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.mandatoryUseInputStream(false), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void passwordPasswordIsFoo() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.password("foo"), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void readCache() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        ReadCache readCache = mock(ReadCache.class);
        assertThat(excelReaderBuilder.readCache(readCache), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void readCacheSelector() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        ReadCacheSelector readCacheSelector = mock(ReadCacheSelector.class);
        assertThat(excelReaderBuilder.readCacheSelector(readCacheSelector), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        Converter converter = mock(Converter.class);
        assertThat(excelReaderBuilder.registerConverter(converter), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void registerReadListener() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        ReadListener readListener = mock(ReadListener.class);
        assertThat(excelReaderBuilder.registerReadListener(readListener), sameInstance(excelReaderBuilder));
    }

    @Test(timeout=10000)
    public void use1904windowingUse1904windowingIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.use1904windowing(false), sameInstance(excelReaderBuilder));
    }
}
