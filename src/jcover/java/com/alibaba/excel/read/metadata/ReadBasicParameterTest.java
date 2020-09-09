package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

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
        readBasicParameter.setCustomReadListenerList(new ArrayList<ReadListener>());
        readBasicParameter.setHeadRowNumber(1);
        readBasicParameter.setAutoTrim(false);
        readBasicParameter.setClazz(String.class);
        readBasicParameter.setCustomConverterList(new ArrayList<Converter>());
        readBasicParameter.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        readBasicParameter.setLocale(locale);
        readBasicParameter.setUse1904windowing(false);
        readBasicParameter.setUseScientificFormat(false);
        assertThat(readBasicParameter.getCustomReadListenerList(), empty());
        assertThat(readBasicParameter.getHeadRowNumber(), is(1));
        assertThat(readBasicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) readBasicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(readBasicParameter.getCustomConverterList(), empty());
        assertThat(readBasicParameter.getHead(), empty());
        assertThat(readBasicParameter.getLocale(), sameInstance(locale));
        assertThat(readBasicParameter.getUse1904windowing(), is(false));
        assertThat(readBasicParameter.getUseScientificFormat(), is(false));
    }
}
