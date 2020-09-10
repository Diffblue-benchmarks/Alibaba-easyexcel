package com.alibaba.excel.read.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.builder.ExcelReaderBuilder
 *
 * @author Diffblue Cover
 */

class ExcelReaderBuilderTest {

    @Test
    void headRowNumberHeadRowNumberIsOne() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.headRowNumber(1), sameInstance(excelReaderBuilder));
    }

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
        ReadCache readCache = mock(ReadCache.class);
        assertThat(excelReaderBuilder.readCache(readCache), sameInstance(excelReaderBuilder));
    }

    @Test
    void readCacheSelector() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        ReadCacheSelector readCacheSelector = mock(ReadCacheSelector.class);
        assertThat(excelReaderBuilder.readCacheSelector(readCacheSelector), sameInstance(excelReaderBuilder));
    }

    @Test
    void passwordPasswordIsSecret() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.password("secret"), sameInstance(excelReaderBuilder));
    }

    @Test
    void xlsxSAXParserFactoryNameXlsxSAXParserFactoryNameIsAcme() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.xlsxSAXParserFactoryName("Acme"), sameInstance(excelReaderBuilder));
    }

    @Test
    void extraReadExtraTypeIsComment() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.extraRead(CellExtraTypeEnum.COMMENT), sameInstance(excelReaderBuilder));
    }

    @Test
    void useDefaultListenerUseDefaultListenerIsFalse() {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        assertThat(excelReaderBuilder.useDefaultListener(false), sameInstance(excelReaderBuilder));
    }
}
