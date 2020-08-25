package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.merge.LoopMergeStrategy;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterBuilderTest {

    @Test
    void relativeHeadRowIndexRelativeHeadRowIndexIsOne() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.relativeHeadRowIndex(1), sameInstance(excelWriterBuilder));
    }

    @Test
    void headHeadIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.head(new ArrayList<List<String>>()), sameInstance(excelWriterBuilder));
    }

    @Test
    void headClazzIsString() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.head(String.class), sameInstance(excelWriterBuilder));
    }

    @Test
    void needHeadNeedHeadIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.needHead(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void autoCloseStreamAutoCloseStreamIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.autoCloseStream(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void useDefaultStyleUseDefaultStyleIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.useDefaultStyle(false), sameInstance(excelWriterBuilder));
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
    void excludeColumnIndexesExcludeColumnIndexesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excludeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterBuilder));
    }

    @Test
    void excludeColumnFiledNamesExcludeColumnFiledNamesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.excludeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterBuilder));
    }

    @Test
    void includeColumnIndexesIncludeColumnIndexesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.includeColumnIndexes(new LinkedList<Integer>()), sameInstance(excelWriterBuilder));
    }

    @Test
    void includeColumnFiledNamesIncludeColumnFiledNamesIsEmpty() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.includeColumnFiledNames(new LinkedList<String>()), sameInstance(excelWriterBuilder));
    }

    @Test
    void convertAllFiledConvertAllFiledIsFalse() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.convertAllFiled(false), sameInstance(excelWriterBuilder));
    }

    @Test
    void registerConverter() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.registerConverter(new AutoConverter()), sameInstance(excelWriterBuilder));
    }

    @Test
    void registerWriteHandler2() {
        ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
        assertThat(excelWriterBuilder.registerWriteHandler(new LoopMergeStrategy(1, 0)), sameInstance(excelWriterBuilder));
    }

    @Test
    void excelTypeExcelTypeIsXls() {
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
    void registerWriteHandler1() {
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
