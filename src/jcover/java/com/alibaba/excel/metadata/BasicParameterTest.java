package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;

import java.util.ArrayList;
import java.util.List;

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
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        basicParameter.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("data");
        head.add(list);
        basicParameter.setHead(head);
        basicParameter.setUse1904windowing(false);
        assertThat(basicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) basicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(basicParameter.getCustomConverterList().size(), is(1));
        assertThat(basicParameter.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(basicParameter.getHead().size(), is(1));
        assertThat(basicParameter.getHead().get(0), sameInstance(list));
        assertThat(basicParameter.getUse1904windowing(), is(false));
    }
}
