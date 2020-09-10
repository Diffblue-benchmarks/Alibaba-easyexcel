package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
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
 * Unit tests for com.alibaba.excel.read.metadata.ReadSheet
 *
 * @author Diffblue Cover
 */

class ReadSheetTest {

    @Test
    void factory1() throws Exception {
        ReadSheet readSheet = new ReadSheet();
        readSheet.setSheetName("Acme");
        readSheet.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readSheet.setCustomReadListenerList(customReadListenerList);
        readSheet.setHeadRowNumber(1);
        readSheet.setAutoTrim(false);
        readSheet.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = mock(Converter.class);
        customConverterList.add(converter);
        readSheet.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet.setHead(head);
        Locale locale = new Locale("en");
        readSheet.setLocale(locale);
        readSheet.setUse1904windowing(false);
        readSheet.setUseScientificFormat(false);
        assertThat(readSheet.getSheetName(), is("Acme"));
        assertThat(readSheet.getSheetNo(), is(1));
        assertThat(readSheet.getCustomReadListenerList().size(), is(1));
        assertThat(readSheet.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readSheet.getHeadRowNumber(), is(1));
        assertThat(readSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) readSheet.getClazz(), equalTo((Class) String.class));
        assertThat(readSheet.getCustomConverterList().size(), is(1));
        assertThat(readSheet.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(readSheet.getHead().size(), is(1));
        assertThat(readSheet.getHead().get(0), sameInstance(list));
        assertThat(readSheet.getLocale(), sameInstance(locale));
        assertThat(readSheet.getUse1904windowing(), is(false));
        assertThat(readSheet.getUseScientificFormat(), is(false));
    }

    @Test
    void factory2() throws Exception {
        ReadSheet readSheet = new ReadSheet(1);
        readSheet.setSheetName("Acme");
        readSheet.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readSheet.setCustomReadListenerList(customReadListenerList);
        readSheet.setHeadRowNumber(1);
        readSheet.setAutoTrim(false);
        readSheet.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = mock(Converter.class);
        customConverterList.add(converter);
        readSheet.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet.setHead(head);
        Locale locale = new Locale("en");
        readSheet.setLocale(locale);
        readSheet.setUse1904windowing(false);
        readSheet.setUseScientificFormat(false);
        assertThat(readSheet.getSheetName(), is("Acme"));
        assertThat(readSheet.getSheetNo(), is(1));
        assertThat(readSheet.getCustomReadListenerList().size(), is(1));
        assertThat(readSheet.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readSheet.getHeadRowNumber(), is(1));
        assertThat(readSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) readSheet.getClazz(), equalTo((Class) String.class));
        assertThat(readSheet.getCustomConverterList().size(), is(1));
        assertThat(readSheet.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(readSheet.getHead().size(), is(1));
        assertThat(readSheet.getHead().get(0), sameInstance(list));
        assertThat(readSheet.getLocale(), sameInstance(locale));
        assertThat(readSheet.getUse1904windowing(), is(false));
        assertThat(readSheet.getUseScientificFormat(), is(false));
    }

    @Test
    void factory3() throws Exception {
        ReadSheet readSheet = new ReadSheet(1, "Acme");
        readSheet.setSheetName("Acme");
        readSheet.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readSheet.setCustomReadListenerList(customReadListenerList);
        readSheet.setHeadRowNumber(1);
        readSheet.setAutoTrim(false);
        readSheet.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = mock(Converter.class);
        customConverterList.add(converter);
        readSheet.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet.setHead(head);
        Locale locale = new Locale("en");
        readSheet.setLocale(locale);
        readSheet.setUse1904windowing(false);
        readSheet.setUseScientificFormat(false);
        assertThat(readSheet.getSheetName(), is("Acme"));
        assertThat(readSheet.getSheetNo(), is(1));
        assertThat(readSheet.getCustomReadListenerList().size(), is(1));
        assertThat(readSheet.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readSheet.getHeadRowNumber(), is(1));
        assertThat(readSheet.getAutoTrim(), is(false));
        assertThat((Class<String>) readSheet.getClazz(), equalTo((Class) String.class));
        assertThat(readSheet.getCustomConverterList().size(), is(1));
        assertThat(readSheet.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(readSheet.getHead().size(), is(1));
        assertThat(readSheet.getHead().get(0), sameInstance(list));
        assertThat(readSheet.getLocale(), sameInstance(locale));
        assertThat(readSheet.getUse1904windowing(), is(false));
        assertThat(readSheet.getUseScientificFormat(), is(false));
    }

    @Test
    void copyBasicParameter() throws Exception {

        // arrange
        ReadSheet readSheet = new ReadSheet();
        ReadSheet other = new ReadSheet();
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        ReadListener readListener = mock(ReadListener.class);
        customReadListenerList2.add(readListener);
        other.setCustomReadListenerList(customReadListenerList2);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        Converter converter2 = mock(Converter.class);
        customConverterList2.add(converter2);
        other.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<String>();
        head2.add(list2);
        other.setHead(head2);

        // act
        readSheet.copyBasicParameter(other);

        // assert
        assertThat(readSheet.getCustomReadListenerList().size(), is(1));
        assertThat(readSheet.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(readSheet.getCustomConverterList().get(0), sameInstance(converter2));
        assertThat(readSheet.getHead().get(0), sameInstance(list2));
    }

    @Test
    void copyBasicParameterOtherIsNull() {
        new ReadSheet().copyBasicParameter(null);
    }
}
