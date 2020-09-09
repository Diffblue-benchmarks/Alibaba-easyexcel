package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
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
        ReadListener readListener = new ModelBuildEventListener();
        customReadListenerList.add(readListener);
        readBasicParameter.setCustomReadListenerList(customReadListenerList);
        readBasicParameter.setHeadRowNumber(1);
        readBasicParameter.setAutoTrim(false);
        readBasicParameter.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        readBasicParameter.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("data");
        head.add(list);
        readBasicParameter.setHead(head);
        Locale locale = new Locale("en");
        readBasicParameter.setLocale(locale);
        readBasicParameter.setUse1904windowing(false);
        readBasicParameter.setUseScientificFormat(false);
        assertThat(readBasicParameter.getCustomReadListenerList().size(), is(1));
        assertThat(readBasicParameter.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readBasicParameter.getHeadRowNumber(), is(1));
        assertThat(readBasicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) readBasicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(readBasicParameter.getCustomConverterList().size(), is(1));
        assertThat(readBasicParameter.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(readBasicParameter.getHead().size(), is(1));
        assertThat(readBasicParameter.getHead().get(0), sameInstance(list));
        assertThat(readBasicParameter.getLocale(), sameInstance(locale));
        assertThat(readBasicParameter.getUse1904windowing(), is(false));
        assertThat(readBasicParameter.getUseScientificFormat(), is(false));
    }
}
