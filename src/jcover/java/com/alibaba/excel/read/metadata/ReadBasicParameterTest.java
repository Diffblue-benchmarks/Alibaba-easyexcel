package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.ReadBasicParameter
 *
 * @author Diffblue Cover
 */

class ReadBasicParameterTest {

    @Test
    void factory() {
        ReadBasicParameter readBasicParameter = new ReadBasicParameter();
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readBasicParameter.setCustomReadListenerList(customReadListenerList);
        readBasicParameter.setHeadRowNumber(1);
        readBasicParameter.setAutoTrim(false);
        readBasicParameter.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        customConverterList.add(converter);
        readBasicParameter.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        readBasicParameter.setHead(head);
        Locale locale = new Locale("en");
        readBasicParameter.setLocale(locale);
        readBasicParameter.setUse1904windowing(false);
        readBasicParameter.setUseScientificFormat(false);
        assertThat(readBasicParameter.getCustomReadListenerList().size(), is(1));
        assertThat(readBasicParameter.getCustomReadListenerList().get(0), is(notNullValue()));
        assertThat(readBasicParameter.getHeadRowNumber(), is(1));
        assertThat(readBasicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) readBasicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(readBasicParameter.getCustomConverterList().size(), is(1));
        assertThat(readBasicParameter.getCustomConverterList().get(0), is(notNullValue()));
        assertThat(readBasicParameter.getHead().size(), is(1));
        assertThat(readBasicParameter.getHead().get(0), hasSize(1));
        assertThat(readBasicParameter.getHead().get(0).get(0), is("Smith"));
        assertThat(readBasicParameter.getLocale(), sameInstance(locale));
        assertThat(readBasicParameter.getUse1904windowing(), is(false));
        assertThat(readBasicParameter.getUseScientificFormat(), is(false));
    }
}
