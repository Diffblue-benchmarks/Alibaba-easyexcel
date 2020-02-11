package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterBuilder
 *
 * @author Diffblue JCover
 */

public class ExcelWriterBuilderTest {

    @Test(timeout=10000)
    public void autoCloseStreamAutoCloseStreamIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.autoCloseStream(false), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void build() {
        // pojo com.alibaba.excel.ExcelWriter
    }

    @Test(timeout=10000)
    public void convertAllFiledConvertAllFiledIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.convertAllFiled(false), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void excelTypeExcelTypeIsXLS() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excelType(ExcelTypeEnum.XLS), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void file1() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.file(new ByteArrayOutputStream()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void file2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.file("/bin/bash"), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void headClazzIsString() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.head(String.class), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void headHeadIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.head(new ArrayList<java.util.List<String>>()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void includeColumnFiledNamesIncludeColumnFiledNamesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.includeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void inMemoryInMemoryIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.inMemory(false), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void needHeadNeedHeadIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.needHead(false), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void passwordPasswordIsFoo() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.password("foo"), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void registerConverter() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        Converter converter = mock(Converter.class);
        assertThat(excelWriterBuilder.registerConverter(converter), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void registerWriteHandler1() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        WriteHandler writeHandler = mock(WriteHandler.class);
        assertThat(excelWriterBuilder.registerWriteHandler(writeHandler), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void registerWriteHandler2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        com.alibaba.excel.write.handler.WriteHandler writeHandler = mock(com.alibaba.excel.write.handler.WriteHandler.class);
        assertThat(excelWriterBuilder.registerWriteHandler(writeHandler), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void sheet() {
        // pojo ExcelWriterSheetBuilder
        // pojo ExcelWriterSheetBuilder
        // pojo ExcelWriterSheetBuilder
    }

    @Test(timeout=10000)
    public void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.useDefaultStyle(false), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void withTemplate1() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.withTemplate(new StringBufferInputStream("Broadway")), sameInstance(excelWriterBuilder));
    }

    @Test(timeout=10000)
    public void withTemplate2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.withTemplate("/bin/bash"), sameInstance(excelWriterBuilder));
    }
}
