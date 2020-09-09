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
 * Unit tests for com.alibaba.excel.read.metadata.ReadSheet
 *
 * @author Diffblue Cover
 */

class ReadSheetTest {

    @Test
    void factory() {
        ReadSheet readSheet = new ReadSheet();
        readSheet.setSheetName("Acme");
        readSheet.setSheetNo(1);
        readSheet.setCustomReadListenerList(new ArrayList<ReadListener>());
        readSheet.setHeadRowNumber(1);
        readSheet.setAutoTrim(false);
        readSheet.setClazz(String.class);
        readSheet.setCustomConverterList(new ArrayList<Converter>());
        readSheet.setHead(new ArrayList<List<String>>());
        Locale locale = new Locale("en");
        readSheet.setLocale(locale);
        readSheet.setUse1904windowing(false);
        readSheet.setUseScientificFormat(false);
        assertThat(readSheet.getSheetName(), is("Acme"));
        assertThat(readSheet.getSheetNo(), is(1));
        assertThat(readSheet.getCustomReadListenerList(), empty());
        assertThat(readSheet.getHeadRowNumber(), is(1));
        assertThat(readSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) readSheet.getClazz(), equalTo((Class) String.class));
        assertThat(readSheet.getCustomConverterList(), empty());
        assertThat(readSheet.getHead(), empty());
        assertThat(readSheet.getLocale(), sameInstance(locale));
        assertThat(readSheet.getUse1904windowing(), is(false));
        assertThat(readSheet.getUseScientificFormat(), is(false));
    }

    @Test
    void copyBasicParameter1() {
        new ReadSheet(1).copyBasicParameter(new ReadSheet());
    }

    @Test
    void copyBasicParameter2() {
        new ReadSheet(1, "Acme").copyBasicParameter(new ReadSheet());
    }

    @Test
    void copyBasicParameter3() {

        // arrange
        ReadSheet readSheet = new ReadSheet();
        ReadSheet other = new ReadSheet();
        other.setAutoTrim(false);

        // act
        readSheet.copyBasicParameter(other);

        // assert
        assertThat(readSheet.getAutoTrim(), is(false));
    }

    @Test
    void copyBasicParameterOtherIsNull() {
        new ReadSheet().copyBasicParameter(null);
    }
}
