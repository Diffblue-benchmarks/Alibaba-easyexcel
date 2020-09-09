package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.ArrayList;
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
        BasicParameter basicParameter = new ReadSheet();
        basicParameter.setAutoTrim(false);
        basicParameter.setClazz(String.class);
        basicParameter.setCustomConverterList(new ArrayList<Converter>());
        basicParameter.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        basicParameter.setLocale(locale);
        basicParameter.setUse1904windowing(false);
        basicParameter.setUseScientificFormat(false);
        assertThat(basicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) basicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(basicParameter.getCustomConverterList(), empty());
        assertThat(basicParameter.getHead(), empty());
        assertThat(basicParameter.getLocale(), sameInstance(locale));
        assertThat(basicParameter.getUse1904windowing(), is(false));
        assertThat(basicParameter.getUseScientificFormat(), is(false));
    }
}
