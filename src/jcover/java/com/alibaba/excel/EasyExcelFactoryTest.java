package com.alibaba.excel;

import static org.mockito.Mockito.mock;

import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.EasyExcelFactory
 *
 * @author Diffblue Cover
 */

class EasyExcelFactoryTest {

    @Test
    void getWriter() {
        // pojo ExcelWriter EasyExcelFactory.getWriter(new ByteArrayOutputStream())
        // pojo ExcelWriter EasyExcelFactory.getWriter(new ByteArrayOutputStream(), ExcelTypeEnum.XLS, false)
    }

    @Test
    void write() {
        // pojo com.alibaba.excel.write.builder.ExcelWriterBuilder EasyExcelFactory.write()
        // pojo com.alibaba.excel.write.builder.ExcelWriterBuilder EasyExcelFactory.write(new ByteArrayOutputStream())
        // pojo com.alibaba.excel.write.builder.ExcelWriterBuilder EasyExcelFactory.write("data.txt")
        // pojo com.alibaba.excel.write.builder.ExcelWriterBuilder EasyExcelFactory.write(new ByteArrayOutputStream(), String.class)
        // pojo com.alibaba.excel.write.builder.ExcelWriterBuilder EasyExcelFactory.write("data.txt", String.class)
    }

    @Test
    void writerSheet() {
        // pojo com.alibaba.excel.write.builder.ExcelWriterSheetBuilder EasyExcelFactory.writerSheet()
        // pojo com.alibaba.excel.write.builder.ExcelWriterSheetBuilder EasyExcelFactory.writerSheet("Acme")
        // pojo com.alibaba.excel.write.builder.ExcelWriterSheetBuilder EasyExcelFactory.writerSheet(1)
    }

    @Test
    void writerTable() {
        // pojo com.alibaba.excel.write.builder.ExcelWriterTableBuilder EasyExcelFactory.writerTable()
        // pojo com.alibaba.excel.write.builder.ExcelWriterTableBuilder EasyExcelFactory.writerTable(1)
    }

    @Test
    void read3() {
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read()
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read(new StringBufferInputStream("foo"))
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read("data.txt")
    }

    @Test
    void read2() {
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read("data.txt", readListener)
    }

    @Test
    void readHeadIsString2() {
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read("data.txt", String.class, readListener)
    }

    @Test
    void read1() {
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read(new StringBufferInputStream("foo"), readListener)
    }

    @Test
    void readHeadIsString1() {
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        // pojo com.alibaba.excel.read.builder.ExcelReaderBuilder EasyExcelFactory.read(new StringBufferInputStream("foo"), String.class, readListener)
    }

    @Test
    void readSheet() {
        // pojo com.alibaba.excel.read.builder.ExcelReaderSheetBuilder EasyExcelFactory.readSheet()
        // pojo com.alibaba.excel.read.builder.ExcelReaderSheetBuilder EasyExcelFactory.readSheet("Acme")
        // pojo com.alibaba.excel.read.builder.ExcelReaderSheetBuilder EasyExcelFactory.readSheet(1)
    }
}
