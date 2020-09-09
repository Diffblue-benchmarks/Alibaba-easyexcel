package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteWorkbook
 *
 * @author Diffblue Cover
 */

class WriteWorkbookTest {

    @Test
    void factory() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setAutoCloseStream(false);
        writeWorkbook.setConvertAllFiled(false);
        writeWorkbook.setExcelType(ExcelTypeEnum.XLS);
        writeWorkbook.setInMemory(false);
        writeWorkbook.setMandatoryUseInputStream(false);
        writeWorkbook.setOutputStream(new ByteArrayOutputStream());
        writeWorkbook.setPassword("secret");
        writeWorkbook.setTemplateInputStream(new StringBufferInputStream("foo"));
        writeWorkbook.setWriteExcelOnException(false);
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        writeWorkbook.setWriteHandler(writeHandler1);
        writeWorkbook.setAutomaticMergeHead(false);
        writeWorkbook.setCustomWriteHandlerList(new ArrayList<com.alibaba.excel.write.handler.WriteHandler>());
        writeWorkbook.setExcludeColumnFiledNames(new LinkedList<String>());
        writeWorkbook.setExcludeColumnIndexes(new LinkedList<Integer>());
        writeWorkbook.setIncludeColumnFiledNames(new LinkedList<String>());
        writeWorkbook.setIncludeColumnIndexes(new LinkedList<Integer>());
        writeWorkbook.setNeedHead(false);
        writeWorkbook.setRelativeHeadRowIndex(1);
        writeWorkbook.setUseDefaultStyle(false);
        writeWorkbook.setAutoTrim(false);
        writeWorkbook.setClazz(String.class);
        writeWorkbook.setCustomConverterList(new ArrayList<Converter>());
        writeWorkbook.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        writeWorkbook.setLocale(locale);
        writeWorkbook.setUse1904windowing(false);
        writeWorkbook.setUseScientificFormat(false);
        assertThat(writeWorkbook.getAutoCloseStream(), is(false));
        assertThat(writeWorkbook.getConvertAllFiled(), is(false));
        assertThat(writeWorkbook.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(writeWorkbook.getFile(), is(nullValue()));
        assertThat(writeWorkbook.getInMemory(), is(false));
        assertThat(writeWorkbook.getMandatoryUseInputStream(), is(false));
        assertThat(writeWorkbook.getPassword(), is("secret"));
        assertThat(writeWorkbook.getTemplateFile(), is(nullValue()));
        assertThat(writeWorkbook.getWriteExcelOnException(), is(false));
        assertThat(writeWorkbook.getWriteHandler(), sameInstance(writeHandler1));
        assertThat(writeWorkbook.getAutomaticMergeHead(), is(false));
        assertThat(writeWorkbook.getCustomWriteHandlerList(), empty());
        assertThat(writeWorkbook.getExcludeColumnFiledNames(), empty());
        assertThat(writeWorkbook.getExcludeColumnIndexes(), empty());
        assertThat(writeWorkbook.getIncludeColumnFiledNames(), empty());
        assertThat(writeWorkbook.getIncludeColumnIndexes(), empty());
        assertThat(writeWorkbook.getNeedHead(), is(false));
        assertThat(writeWorkbook.getRelativeHeadRowIndex(), is(1));
        assertThat(writeWorkbook.getUseDefaultStyle(), is(false));
        assertThat(writeWorkbook.getAutoTrim(), is(false));
        assertThat((Class<String>) writeWorkbook.getClazz(), equalTo((Class) String.class));
        assertThat(writeWorkbook.getCustomConverterList(), empty());
        assertThat(writeWorkbook.getHead(), empty());
        assertThat(writeWorkbook.getLocale(), sameInstance(locale));
        assertThat(writeWorkbook.getUse1904windowing(), is(false));
        assertThat(writeWorkbook.getUseScientificFormat(), is(false));
    }
}
