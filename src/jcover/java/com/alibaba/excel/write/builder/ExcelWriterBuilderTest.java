package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterBuilderTest {

    @Test
    void autoCloseStreamAutoCloseStreamIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.autoCloseStream(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void passwordPasswordIsSecret() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.password("secret"), sameInstance(excelWriterBuilder));
    }

    @Test
    void inMemoryInMemoryIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.inMemory(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void writeExcelOnExceptionWriteExcelOnExceptionIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.writeExcelOnException(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void automaticMergeHeadAutomaticMergeHeadIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.automaticMergeHead(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void convertAllFiledConvertAllFiledIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.convertAllFiled(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void excelTypeExcelTypeIsXLS() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excelType(ExcelTypeEnum.XLS), sameInstance(excelWriterBuilder));
    }

    @Test
    void file1() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.file(new ByteArrayOutputStream()), sameInstance(excelWriterBuilder));
    }

    @Test
    void file2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.file("data.txt"), sameInstance(excelWriterBuilder));
    }

    @Test
    void withTemplate1() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.withTemplate(new StringBufferInputStream("foo")), sameInstance(excelWriterBuilder));
    }

    @Test
    void withTemplate2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.withTemplate("data.txt"), sameInstance(excelWriterBuilder));
    }

    @Test
    void registerWriteHandler() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        WriteHandler writeHandler = mock(WriteHandler.class);
        assertThat(excelWriterBuilder.registerWriteHandler(writeHandler), sameInstance(excelWriterBuilder));
    }

    @Test
    void build() {
        // pojo com.alibaba.excel.ExcelWriter
    }

    @Test
    void sheet() {
        // pojo ExcelWriterSheetBuilder
        // pojo ExcelWriterSheetBuilder
        // pojo ExcelWriterSheetBuilder
    }
}
