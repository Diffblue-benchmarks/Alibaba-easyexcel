package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.handler.WriteHandler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteBasicParameter
 *
 * @author Diffblue Cover
 */

class WriteBasicParameterTest {

    @Test
    void factory() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        writeBasicParameter.setAutomaticMergeHead(false);
        writeBasicParameter.setCustomWriteHandlerList(new ArrayList<WriteHandler>());
        writeBasicParameter.setExcludeColumnFiledNames(new LinkedList<String>());
        writeBasicParameter.setExcludeColumnIndexes(new LinkedList<Integer>());
        writeBasicParameter.setIncludeColumnFiledNames(new LinkedList<String>());
        writeBasicParameter.setIncludeColumnIndexes(new LinkedList<Integer>());
        writeBasicParameter.setNeedHead(false);
        writeBasicParameter.setRelativeHeadRowIndex(1);
        writeBasicParameter.setUseDefaultStyle(false);
        writeBasicParameter.setAutoTrim(false);
        writeBasicParameter.setClazz(String.class);
        writeBasicParameter.setCustomConverterList(new ArrayList<Converter>());
        writeBasicParameter.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        writeBasicParameter.setLocale(locale);
        writeBasicParameter.setUse1904windowing(false);
        writeBasicParameter.setUseScientificFormat(false);
        assertThat(writeBasicParameter.getAutomaticMergeHead(), is(false));
        assertThat(writeBasicParameter.getCustomWriteHandlerList(), empty());
        assertThat(writeBasicParameter.getExcludeColumnFiledNames(), empty());
        assertThat(writeBasicParameter.getExcludeColumnIndexes(), empty());
        assertThat(writeBasicParameter.getIncludeColumnFiledNames(), empty());
        assertThat(writeBasicParameter.getIncludeColumnIndexes(), empty());
        assertThat(writeBasicParameter.getNeedHead(), is(false));
        assertThat(writeBasicParameter.getRelativeHeadRowIndex(), is(1));
        assertThat(writeBasicParameter.getUseDefaultStyle(), is(false));
        assertThat(writeBasicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) writeBasicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(writeBasicParameter.getCustomConverterList(), empty());
        assertThat(writeBasicParameter.getHead(), empty());
        assertThat(writeBasicParameter.getLocale(), sameInstance(locale));
        assertThat(writeBasicParameter.getUse1904windowing(), is(false));
        assertThat(writeBasicParameter.getUseScientificFormat(), is(false));
    }
}
