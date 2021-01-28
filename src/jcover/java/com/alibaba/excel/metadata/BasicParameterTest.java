package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.BasicParameter
 *
 * @author Diffblue Cover
 */

class BasicParameterTest {

    @Test
    void factory() {
        BasicParameter basicParameter = new BasicParameter();
        basicParameter.setAutoTrim(false);
        basicParameter.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        customConverterList.add(converter);
        basicParameter.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("foo");
        head.add(stringList);
        basicParameter.setHead(head);
        Locale locale = new Locale("en");
        basicParameter.setLocale(locale);
        basicParameter.setUse1904windowing(false);
        basicParameter.setUseScientificFormat(false);
        assertThat(basicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) basicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(basicParameter.getCustomConverterList(), hasSize(1));
        assertThat(basicParameter.getCustomConverterList().get(0), is(notNullValue()));
        assertThat(basicParameter.getHead(), hasSize(1));
        assertThat(basicParameter.getHead().get(0), equalTo(Arrays.asList("foo")));
        assertThat(basicParameter.getLocale(), sameInstance(locale));
        assertThat(basicParameter.getUse1904windowing(), is(false));
        assertThat(basicParameter.getUseScientificFormat(), is(false));
    }
}
