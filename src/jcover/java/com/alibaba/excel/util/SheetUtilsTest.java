package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.SheetUtils
 *
 * @author Diffblue Cover
 */

class SheetUtilsTest {

    @Test
    void match1() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(0);
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        customReadListenerList1.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList1);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        customConverterList1.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList1);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("foo");
        head1.add(list1);
        readSheet1.setHead(head1);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        ReadListener readListener2 = new ModelBuildEventListener();
        customReadListenerList2.add(readListener2);
        readSheet2.setCustomReadListenerList(customReadListenerList2);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        Converter converter2 = new AutoConverter();
        customConverterList2.add(converter2);
        readSheet2.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<String>();
        list2.add("foo");
        head2.add(list2);
        readSheet2.setHead(head2);
        readSheet2.setUse1904windowing(false);
        parameterReadSheetList.add(readSheet2);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);

        // act
        ReadSheet result =
             SheetUtils.match(readSheet1, parameterReadSheetList, false, globalConfiguration);

        // assert
        assertThat(result.getSheetName(), is("Acme"));
        assertThat(result.getSheetNo(), is(0));
        assertThat(result.getCustomReadListenerList().size(), is(1));
        assertThat(result.getCustomReadListenerList().get(0), sameInstance(readListener2));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList().size(), is(1));
        assertThat(result.getCustomConverterList().get(0), sameInstance(converter2));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list2));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test
    void match2() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        customReadListenerList1.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList1);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        customConverterList1.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList1);
        readSheet1.setHead(new ArrayList<List<String>>());
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        ReadListener readListener2 = new ModelBuildEventListener();
        customReadListenerList2.add(readListener2);
        readSheet2.setCustomReadListenerList(customReadListenerList2);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        Converter converter2 = new AutoConverter();
        customConverterList2.add(converter2);
        readSheet2.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head2.add(list);
        readSheet2.setHead(head2);
        readSheet2.setUse1904windowing(false);
        parameterReadSheetList.add(readSheet2);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);

        // act
        ReadSheet result =
             SheetUtils.match(readSheet1, parameterReadSheetList, false, globalConfiguration);

        // assert
        assertThat(result.getSheetName(), is("Acme"));
        assertThat(result.getSheetNo(), is(1));
        assertThat(result.getCustomReadListenerList().size(), is(1));
        assertThat(result.getCustomReadListenerList().get(0), sameInstance(readListener2));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList().size(), is(1));
        assertThat(result.getCustomConverterList().get(0), sameInstance(converter2));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test
    void match3() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        customReadListenerList1.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList1);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        customConverterList1.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList1);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("foo");
        head1.add(list1);
        readSheet1.setHead(head1);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(null);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        ReadListener readListener2 = new ModelBuildEventListener();
        customReadListenerList2.add(readListener2);
        readSheet2.setCustomReadListenerList(customReadListenerList2);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        Converter converter2 = new AutoConverter();
        customConverterList2.add(converter2);
        readSheet2.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<String>();
        list2.add("foo");
        head2.add(list2);
        readSheet2.setHead(head2);
        readSheet2.setUse1904windowing(false);
        parameterReadSheetList.add(readSheet2);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);

        // act
        ReadSheet result =
             SheetUtils.match(readSheet1, parameterReadSheetList, false, globalConfiguration);

        // assert
        assertThat(result.getSheetName(), is("Acme"));
        assertThat(result.getSheetNo(), is(1));
        assertThat(result.getCustomReadListenerList().size(), is(1));
        assertThat(result.getCustomReadListenerList().get(0), sameInstance(readListener2));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList().size(), is(1));
        assertThat(result.getCustomConverterList().get(0), sameInstance(converter2));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list2));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test
    void matchParameterReadSheetListIsEmptyReturnsNull() {
        assertThat(SheetUtils.match(new ReadSheet(), new ArrayList<ReadSheet>(), false, new GlobalConfiguration()), is(nullValue()));
    }

    @Test
    void matchReadAllIsTrue() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        ReadListener readListener1 = new ModelBuildEventListener();
        customReadListenerList1.add(readListener1);
        readSheet1.setCustomReadListenerList(customReadListenerList1);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        Converter converter1 = new AutoConverter();
        customConverterList1.add(converter1);
        readSheet1.setCustomConverterList(customConverterList1);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("foo");
        head1.add(list1);
        readSheet1.setHead(head1);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        customReadListenerList2.add(new ModelBuildEventListener());
        readSheet2.setCustomReadListenerList(customReadListenerList2);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        customConverterList2.add(new AutoConverter());
        readSheet2.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<String>();
        list2.add("foo");
        head2.add(list2);
        readSheet2.setHead(head2);
        readSheet2.setUse1904windowing(false);
        parameterReadSheetList.add(readSheet2);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setUse1904windowing(false);

        // act
        ReadSheet result =
             SheetUtils.match(readSheet1, parameterReadSheetList, true, globalConfiguration);

        // assert
        assertThat(result.getSheetName(), is("Acme"));
        assertThat(result.getSheetNo(), is(1));
        assertThat(result.getCustomReadListenerList().size(), is(1));
        assertThat(result.getCustomReadListenerList().get(0), sameInstance(readListener1));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList().size(), is(1));
        assertThat(result.getCustomConverterList().get(0), sameInstance(converter1));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list1));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }
}
