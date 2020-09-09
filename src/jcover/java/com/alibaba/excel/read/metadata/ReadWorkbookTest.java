package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
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
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(new Ehcache(1));
        readWorkbook.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        readWorkbook.setUseDefaultListener(false);
        readWorkbook.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = new ModelBuildEventListener();
        customReadListenerList.add(readListener);
        readWorkbook.setCustomReadListenerList(customReadListenerList);
        readWorkbook.setHeadRowNumber(1);
        readWorkbook.setAutoTrim(false);
        readWorkbook.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        readWorkbook.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
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
        assertThat(readWorkbook.getExtraReadSet(), empty());
        assertThat(readWorkbook.getFile(), is(nullValue()));
        assertThat(readWorkbook.getIgnoreEmptyRow(), is(false));
        assertThat(readWorkbook.getMandatoryUseInputStream(), is(false));
        assertThat(readWorkbook.getPassword(), is("secret"));
        assertThat(readWorkbook.getUseDefaultListener(), is(false));
        assertThat(readWorkbook.getXlsxSAXParserFactoryName(), is("Acme"));
        assertThat(readWorkbook.getCustomReadListenerList().size(), is(1));
        assertThat(readWorkbook.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readWorkbook.getHeadRowNumber(), is(1));
        assertThat(readWorkbook.getAutoTrim(), is(false));
        assertThat((Class<String>) readWorkbook.getClazz(), equalTo((Class) String.class));
        assertThat(readWorkbook.getCustomConverterList().size(), is(1));
        assertThat(readWorkbook.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(readWorkbook.getHead().size(), is(1));
        assertThat(readWorkbook.getHead().get(0), sameInstance(list));
        assertThat(readWorkbook.getLocale(), sameInstance(locale));
        assertThat(readWorkbook.getUse1904windowing(), is(false));
        assertThat(readWorkbook.getUseScientificFormat(), is(false));
    }
}
