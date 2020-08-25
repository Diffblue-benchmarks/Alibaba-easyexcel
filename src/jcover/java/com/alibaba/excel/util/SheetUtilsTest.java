package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
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
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        customReadListenerList.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        customConverterList.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet1.setHead(head);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
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
        assertThat(result.getCustomReadListenerList(), empty());
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test
    void match2() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        customReadListenerList.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        customConverterList.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList);
        readSheet1.setHead(new ArrayList<List<String>>());
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
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
        assertThat(result.getCustomReadListenerList(), empty());
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test
    void match3() {

        // arrange
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        customReadListenerList.add(new ModelBuildEventListener());
        readSheet1.setCustomReadListenerList(customReadListenerList);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        customConverterList.add(new AutoConverter());
        readSheet1.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet1.setHead(head);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(null);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
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
        assertThat(result.getCustomReadListenerList(), empty());
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
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
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = new ModelBuildEventListener();
        customReadListenerList.add(readListener);
        readSheet1.setCustomReadListenerList(customReadListenerList);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        readSheet1.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readSheet1.setHead(head);
        readSheet1.setUse1904windowing(false);
        ArrayList<ReadSheet> parameterReadSheetList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
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
        assertThat(result.getCustomReadListenerList().get(0), sameInstance(readListener));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getAutoTrim(), is(false));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        assertThat(result.getCustomConverterList().size(), is(1));
        assertThat(result.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list));
        assertThat(result.getUse1904windowing(), is(false));
        assertThat(readSheet1, sameInstance(result));
    }
}
