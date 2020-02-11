package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.BasicParameter
 *
 * @author Diffblue JCover
 */

public class BasicParameterTest {

    @Test(timeout=10000)
    public void getAutoTrimReturnsNull() {
        assertThat(new BasicParameter().getAutoTrim(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getClazzReturnsNull() {
        assertThat(new BasicParameter().getClazz(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCustomConverterListReturnsNull() {
        assertThat(new BasicParameter().getCustomConverterList(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHeadReturnsNull() {
        assertThat(new BasicParameter().getHead(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUse1904windowingReturnsNull() {
        assertThat(new BasicParameter().getUse1904windowing(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAutoTrimToFalse() {
        BasicParameter basicParameter = new BasicParameter();
        basicParameter.setAutoTrim(false);
        assertThat(basicParameter.getAutoTrim(), is(false));
    }

    @Test(timeout=10000)
    public void setClazzToString() {
        BasicParameter basicParameter = new BasicParameter();
        basicParameter.setClazz(String.class);
        assertThat((Class<String>)basicParameter.getClazz(), equalTo((Class)String.class));
    }

    @Test(timeout=10000)
    public void setCustomConverterListToEmpty() {
        BasicParameter basicParameter = new BasicParameter();
        List<com.alibaba.excel.converters.Converter> customConverterList = new ArrayList<com.alibaba.excel.converters.Converter>();
        basicParameter.setCustomConverterList(customConverterList);
        assertThat(basicParameter.getCustomConverterList(), sameInstance(customConverterList));
    }

    @Test(timeout=10000)
    public void setHeadToEmpty() {
        BasicParameter basicParameter = new BasicParameter();
        List<List<String>> head = new ArrayList<List<String>>();
        basicParameter.setHead(head);
        assertThat(basicParameter.getHead(), sameInstance(head));
    }

    @Test(timeout=10000)
    public void setUse1904windowingToFalse() {
        BasicParameter basicParameter = new BasicParameter();
        basicParameter.setUse1904windowing(false);
        assertThat(basicParameter.getUse1904windowing(), is(false));
    }
}
