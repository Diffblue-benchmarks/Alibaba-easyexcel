package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.ReadWorkbook
 *
 * @author Diffblue Cover
 */

class ReadWorkbookTest {

    @Test
    void factory() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(false);
        readWorkbook.setConvertAllFiled(false);
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        ReadCache readCache = mock(ReadCache.class);
        readWorkbook.setReadCache(readCache);
        ReadCacheSelector readCacheSelector = mock(ReadCacheSelector.class);
        readWorkbook.setReadCacheSelector(readCacheSelector);
        readWorkbook.setUseDefaultListener(false);
        readWorkbook.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readWorkbook.setCustomReadListenerList(customReadListenerList);
        readWorkbook.setHeadRowNumber(1);
        readWorkbook.setAutoTrim(false);
        readWorkbook.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        customConverterList.add(converter);
        readWorkbook.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        readWorkbook.setHead(head);
        Locale locale = new Locale("en");
        readWorkbook.setLocale(locale);
        readWorkbook.setUse1904windowing(false);
        readWorkbook.setUseScientificFormat(false);
        assertThat(readWorkbook.getAutoCloseStream(), is(false));
        assertThat(readWorkbook.getConvertAllFiled(), is(false));
        assertThat(readWorkbook.getCustomObject(), sameInstance(customObject));
        assertThat(readWorkbook.getDefaultReturnMap(), is(false));
        assertThat(readWorkbook.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(readWorkbook.getExtraReadSet(), is(notNullValue()));
        assertThat(readWorkbook.getFile(), is(nullValue()));
        assertThat(readWorkbook.getIgnoreEmptyRow(), is(false));
        assertThat(readWorkbook.getMandatoryUseInputStream(), is(false));
        assertThat(readWorkbook.getPassword(), is("secret"));
        assertThat(readWorkbook.getReadCache(), sameInstance(readCache));
        assertThat(readWorkbook.getReadCacheSelector(), sameInstance(readCacheSelector));
        assertThat(readWorkbook.getUseDefaultListener(), is(false));
        assertThat(readWorkbook.getXlsxSAXParserFactoryName(), is("Acme"));
        assertThat(readWorkbook.getCustomReadListenerList().size(), is(1));
        assertThat(readWorkbook.getCustomReadListenerList().get(0), is(notNullValue()));
        assertThat(readWorkbook.getHeadRowNumber(), is(1));
        assertThat(readWorkbook.getAutoTrim(), is(false));
        assertThat((Class<String>) readWorkbook.getClazz(), equalTo((Class) String.class));
        assertThat(readWorkbook.getCustomConverterList().size(), is(1));
        assertThat(readWorkbook.getCustomConverterList().get(0), is(notNullValue()));
        assertThat(readWorkbook.getHead().size(), is(1));
        assertThat(readWorkbook.getHead().get(0), hasSize(1));
        assertThat(readWorkbook.getHead().get(0).get(0), is("Smith"));
        assertThat(readWorkbook.getLocale(), sameInstance(locale));
        assertThat(readWorkbook.getUse1904windowing(), is(false));
        assertThat(readWorkbook.getUseScientificFormat(), is(false));
    }
}
