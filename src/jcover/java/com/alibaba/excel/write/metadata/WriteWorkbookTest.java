package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    void factory() throws Exception {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setAutoCloseStream(false);
        writeWorkbook.setConvertAllFiled(false);
        writeWorkbook.setExcelType(ExcelTypeEnum.XLS);
        writeWorkbook.setInMemory(false);
        writeWorkbook.setMandatoryUseInputStream(false);
        writeWorkbook.setOutputStream(new ByteArrayOutputStream());
        writeWorkbook.setPassword("secret");
        writeWorkbook.setTemplateInputStream(new StringBufferInputStream("Broadway"));
        writeWorkbook.setWriteExcelOnException(false);
        WriteHandler writeHandler1 = mock(WriteHandler.class);
        writeWorkbook.setWriteHandler(writeHandler1);
        writeWorkbook.setAutomaticMergeHead(false);
        ArrayList<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList =
             new ArrayList<com.alibaba.excel.write.handler.WriteHandler>();
        com.alibaba.excel.write.handler.WriteHandler writeHandler2 =
             mock(com.alibaba.excel.write.handler.WriteHandler.class);
        customWriteHandlerList.add(writeHandler2);
        writeWorkbook.setCustomWriteHandlerList(customWriteHandlerList);
        LinkedList<String> excludeColumnFiledNames = new LinkedList<String>();
        excludeColumnFiledNames.add("data.txt");
        writeWorkbook.setExcludeColumnFiledNames(excludeColumnFiledNames);
        LinkedList<Integer> excludeColumnIndexes = new LinkedList<Integer>();
        excludeColumnIndexes.add(1);
        writeWorkbook.setExcludeColumnIndexes(excludeColumnIndexes);
        LinkedList<String> includeColumnFiledNames = new LinkedList<String>();
        includeColumnFiledNames.add("data.txt");
        writeWorkbook.setIncludeColumnFiledNames(includeColumnFiledNames);
        LinkedList<Integer> includeColumnIndexes = new LinkedList<Integer>();
        includeColumnIndexes.add(1);
        writeWorkbook.setIncludeColumnIndexes(includeColumnIndexes);
        writeWorkbook.setNeedHead(false);
        writeWorkbook.setRelativeHeadRowIndex(1);
        writeWorkbook.setUseDefaultStyle(false);
        writeWorkbook.setAutoTrim(false);
        writeWorkbook.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = mock(Converter.class);
        customConverterList.add(converter);
        writeWorkbook.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        writeWorkbook.setHead(head);
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
        assertThat(writeWorkbook.getCustomWriteHandlerList().size(), is(1));
        assertThat(writeWorkbook.getCustomWriteHandlerList().get(0), sameInstance(writeHandler2));
        assertThat(writeWorkbook.getExcludeColumnFiledNames(), hasSize(1));
        assertTrue(writeWorkbook.getExcludeColumnFiledNames().contains("data.txt"));
        assertThat(writeWorkbook.getExcludeColumnIndexes(), hasSize(1));
        assertTrue(writeWorkbook.getExcludeColumnIndexes().contains(1));
        assertThat(writeWorkbook.getIncludeColumnFiledNames(), hasSize(1));
        assertTrue(writeWorkbook.getIncludeColumnFiledNames().contains("data.txt"));
        assertThat(writeWorkbook.getIncludeColumnIndexes(), hasSize(1));
        assertTrue(writeWorkbook.getIncludeColumnIndexes().contains(1));
        assertThat(writeWorkbook.getNeedHead(), is(false));
        assertThat(writeWorkbook.getRelativeHeadRowIndex(), is(1));
        assertThat(writeWorkbook.getUseDefaultStyle(), is(false));
        assertThat(writeWorkbook.getAutoTrim(), is(false));
        assertThat((Class<String>) writeWorkbook.getClazz(), equalTo((Class) String.class));
        assertThat(writeWorkbook.getCustomConverterList().size(), is(1));
        assertThat(writeWorkbook.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(writeWorkbook.getHead().size(), is(1));
        assertThat(writeWorkbook.getHead().get(0), sameInstance(list));
        assertThat(writeWorkbook.getLocale(), sameInstance(locale));
        assertThat(writeWorkbook.getUse1904windowing(), is(false));
        assertThat(writeWorkbook.getUseScientificFormat(), is(false));
    }
}
