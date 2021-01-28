package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder
 *
 * @author Diffblue Cover
 */

class ReadWorkbookHolderTest {

    @Test
    void factory1() {
        ReadWorkbook readWorkbook1 = new ReadWorkbook();
        readWorkbook1.setAutoCloseStream(false);
        readWorkbook1.setConvertAllFiled(false);
        readWorkbook1.setCustomObject(new Object());
        readWorkbook1.setDefaultReturnMap(false);
        readWorkbook1.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook1.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook1.setIgnoreEmptyRow(false);
        readWorkbook1.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook1.setMandatoryUseInputStream(false);
        readWorkbook1.setPassword("secret");
        readWorkbook1.setReadCache(null);
        ReadCacheSelector readCacheSelector1 = mock(ReadCacheSelector.class);
        readWorkbook1.setReadCacheSelector(readCacheSelector1);
        readWorkbook1.setUseDefaultListener(false);
        readWorkbook1.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener1 = mock(ReadListener.class);
        customReadListenerList1.add(readListener1);
        readWorkbook1.setCustomReadListenerList(customReadListenerList1);
        readWorkbook1.setHeadRowNumber(1);
        readWorkbook1.setAutoTrim(false);
        readWorkbook1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter1 = mock(Converter.class);
        when(converter1.supportExcelTypeKey())
            .thenReturn(CellDataTypeEnum.STRING);
        when(converter1.supportJavaTypeKey())
            .thenReturn(String.class);
        customConverterList1.add(converter1);
        readWorkbook1.setCustomConverterList(customConverterList1);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        ArrayList<String> stringList1 = new ArrayList<String>();
        stringList1.add("foo");
        head1.add(stringList1);
        readWorkbook1.setHead(head1);
        readWorkbook1.setLocale(new Locale("en"));
        readWorkbook1.setUse1904windowing(false);
        readWorkbook1.setUseScientificFormat(false);
        ReadWorkbookHolder readWorkbookHolder =
             new ReadWorkbookHolder(readWorkbook1);
        ArrayList<ReadSheet> actualSheetDataList = new ArrayList<ReadSheet>();
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener2 = mock(ReadListener.class);
        customReadListenerList2.add(readListener2);
        readSheet1.setCustomReadListenerList(customReadListenerList2);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter2 = mock(Converter.class);
        customConverterList2.add(converter2);
        readSheet1.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        ArrayList<String> stringList2 = new ArrayList<String>();
        stringList2.add("foo");
        head2.add(stringList2);
        readSheet1.setHead(head2);
        readSheet1.setLocale(new Locale("en"));
        readSheet1.setUse1904windowing(false);
        readSheet1.setUseScientificFormat(false);
        actualSheetDataList.add(readSheet1);
        readWorkbookHolder.setActualSheetDataList(actualSheetDataList);
        readWorkbookHolder.setAutoCloseStream(false);
        readWorkbookHolder.setConvertAllFiled(false);
        Object customObject2 = new Object();
        readWorkbookHolder.setCustomObject(customObject2);
        readWorkbookHolder.setDefaultReturnMap(false);
        readWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);
        readWorkbookHolder.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbookHolder.setHasReadSheet(new HashSet<Integer>());
        readWorkbookHolder.setIgnoreEmptyRow(false);
        readWorkbookHolder.setInputStream(new StringBufferInputStream("foo"));
        readWorkbookHolder.setMandatoryUseInputStream(false);
        ArrayList<ReadSheet> parameterSheetDataList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList3 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener3 = mock(ReadListener.class);
        customReadListenerList3.add(readListener3);
        readSheet2.setCustomReadListenerList(customReadListenerList3);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList3 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter3 = mock(Converter.class);
        customConverterList3.add(converter3);
        readSheet2.setCustomConverterList(customConverterList3);
        ArrayList<List<String>> head3 = new ArrayList<List<String>>();
        ArrayList<String> stringList3 = new ArrayList<String>();
        stringList3.add("foo");
        head3.add(stringList3);
        readSheet2.setHead(head3);
        readSheet2.setLocale(new Locale("en"));
        readSheet2.setUse1904windowing(false);
        readSheet2.setUseScientificFormat(false);
        parameterSheetDataList.add(readSheet2);
        readWorkbookHolder.setParameterSheetDataList(parameterSheetDataList);
        readWorkbookHolder.setPassword("secret");
        readWorkbookHolder.setReadAll(false);
        ReadCache readCache2 = mock(ReadCache.class);
        readWorkbookHolder.setReadCache(readCache2);
        ReadCacheSelector readCacheSelector2 = mock(ReadCacheSelector.class);
        readWorkbookHolder.setReadCacheSelector(readCacheSelector2);
        ReadWorkbook readWorkbook2 = new ReadWorkbook();
        readWorkbook2.setAutoCloseStream(false);
        readWorkbook2.setConvertAllFiled(false);
        readWorkbook2.setCustomObject(new Object());
        readWorkbook2.setDefaultReturnMap(false);
        readWorkbook2.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook2.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook2.setIgnoreEmptyRow(false);
        readWorkbook2.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook2.setMandatoryUseInputStream(false);
        readWorkbook2.setPassword("secret");
        ReadCache readCache3 = mock(ReadCache.class);
        readWorkbook2.setReadCache(readCache3);
        ReadCacheSelector readCacheSelector3 = mock(ReadCacheSelector.class);
        readWorkbook2.setReadCacheSelector(readCacheSelector3);
        readWorkbook2.setUseDefaultListener(false);
        readWorkbook2.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList4 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener4 = mock(ReadListener.class);
        customReadListenerList4.add(readListener4);
        readWorkbook2.setCustomReadListenerList(customReadListenerList4);
        readWorkbook2.setHeadRowNumber(1);
        readWorkbook2.setAutoTrim(false);
        readWorkbook2.setClazz(String.class);
        ArrayList<Converter> customConverterList4 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter4 = mock(Converter.class);
        customConverterList4.add(converter4);
        readWorkbook2.setCustomConverterList(customConverterList4);
        ArrayList<List<String>> head4 = new ArrayList<List<String>>();
        ArrayList<String> stringList4 = new ArrayList<String>();
        stringList4.add("foo");
        head4.add(stringList4);
        readWorkbook2.setHead(head4);
        readWorkbook2.setLocale(new Locale("en"));
        readWorkbook2.setUse1904windowing(false);
        readWorkbook2.setUseScientificFormat(false);
        readWorkbookHolder.setReadWorkbook(readWorkbook2);
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head5 = new ArrayList<List<String>>();
        ArrayList<String> stringList5 = new ArrayList<String>();
        stringList5.add("foo");
        head5.add(stringList5);
        ExcelReadHeadProperty excelReadHeadProperty =
             new ExcelReadHeadProperty(holder, String.class, head5, false);
        excelReadHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelReadHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelReadHeadProperty.setHeadClazz(String.class);
        excelReadHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelReadHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelReadHeadProperty.setHeadRowNumber(1);
        excelReadHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        readWorkbookHolder.setExcelReadHeadProperty(excelReadHeadProperty);
        readWorkbookHolder.setHeadRowNumber(1);
        ArrayList<ReadListener> readListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener5 = mock(ReadListener.class);
        readListenerList.add(readListener5);
        readWorkbookHolder.setReadListenerList(readListenerList);
        readWorkbookHolder.setClazz(String.class);
        readWorkbookHolder.setConverterMap(new HashMap<String, Converter>());
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        readWorkbookHolder.setGlobalConfiguration(globalConfiguration);
        ArrayList<List<String>> head6 = new ArrayList<List<String>>();
        ArrayList<String> stringList6 = new ArrayList<String>();
        stringList6.add("foo");
        head6.add(stringList6);
        readWorkbookHolder.setHead(head6);
        readWorkbookHolder.setNewInitialization(false);
        assertThat(readWorkbookHolder.getActualSheetDataList(), hasSize(1));
        assertThat(readWorkbookHolder.getActualSheetDataList().get(0), sameInstance(readSheet1));
        assertThat(readWorkbookHolder.getAutoCloseStream(), is(false));
        assertThat(readWorkbookHolder.getConvertAllFiled(), is(false));
        assertThat(readWorkbookHolder.getCustomObject(), sameInstance(customObject2));
        assertThat(readWorkbookHolder.getDefaultReturnMap(), is(false));
        assertThat(readWorkbookHolder.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(readWorkbookHolder.getExtraReadSet(), empty());
        assertThat(readWorkbookHolder.getFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getHasReadSheet(), empty());
        assertThat(readWorkbookHolder.getIgnoreEmptyRow(), is(false));
        assertThat(readWorkbookHolder.getMandatoryUseInputStream(), is(false));
        assertThat(readWorkbookHolder.getParameterSheetDataList(), hasSize(1));
        assertThat(readWorkbookHolder.getParameterSheetDataList().get(0), sameInstance(readSheet2));
        assertThat(readWorkbookHolder.getPassword(), is("secret"));
        assertThat(readWorkbookHolder.getReadAll(), is(false));
        assertThat(readWorkbookHolder.getReadCache(), sameInstance(readCache2));
        assertThat(readWorkbookHolder.getReadCacheSelector(), sameInstance(readCacheSelector2));
        assertThat(readWorkbookHolder.getReadWorkbook(), sameInstance(readWorkbook2));
        assertThat(readWorkbookHolder.getTempFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty(), sameInstance(excelReadHeadProperty));
        assertThat(readWorkbookHolder.getHeadRowNumber(), is(1));
        assertThat(readWorkbookHolder.getReadListenerList(), hasSize(1));
        assertThat(readWorkbookHolder.getReadListenerList().get(0), is(notNullValue()));
        assertThat((Class<String>) readWorkbookHolder.getClazz(), equalTo((Class) String.class));
        assertThat(readWorkbookHolder.getConverterMap(), anEmptyMap());
        assertThat(readWorkbookHolder.getGlobalConfiguration(), sameInstance(globalConfiguration));
        assertThat(readWorkbookHolder.getHead(), hasSize(1));
        assertThat(readWorkbookHolder.getHead().get(0), equalTo(Arrays.asList("foo")));
        assertThat(readWorkbookHolder.getNewInitialization(), is(false));
    }

    @Test
    void factory2() {
        ReadWorkbook readWorkbook1 = new ReadWorkbook();
        readWorkbook1.setAutoCloseStream(false);
        readWorkbook1.setConvertAllFiled(false);
        readWorkbook1.setCustomObject(new Object());
        readWorkbook1.setDefaultReturnMap(false);
        readWorkbook1.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook1.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook1.setIgnoreEmptyRow(false);
        readWorkbook1.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook1.setMandatoryUseInputStream(false);
        readWorkbook1.setPassword("secret");
        ReadCache readCache1 = mock(ReadCache.class);
        readWorkbook1.setReadCache(readCache1);
        readWorkbook1.setReadCacheSelector(null);
        readWorkbook1.setUseDefaultListener(false);
        readWorkbook1.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList1 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener1 = mock(ReadListener.class);
        customReadListenerList1.add(readListener1);
        readWorkbook1.setCustomReadListenerList(customReadListenerList1);
        readWorkbook1.setHeadRowNumber(1);
        readWorkbook1.setAutoTrim(false);
        readWorkbook1.setClazz(String.class);
        ArrayList<Converter> customConverterList1 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter1 = mock(Converter.class);
        when(converter1.supportExcelTypeKey())
            .thenReturn(CellDataTypeEnum.STRING);
        when(converter1.supportJavaTypeKey())
            .thenReturn(String.class);
        customConverterList1.add(converter1);
        readWorkbook1.setCustomConverterList(customConverterList1);
        ArrayList<List<String>> head1 = new ArrayList<List<String>>();
        ArrayList<String> stringList1 = new ArrayList<String>();
        stringList1.add("foo");
        head1.add(stringList1);
        readWorkbook1.setHead(head1);
        readWorkbook1.setLocale(new Locale("en"));
        readWorkbook1.setUse1904windowing(false);
        readWorkbook1.setUseScientificFormat(false);
        ReadWorkbookHolder readWorkbookHolder =
             new ReadWorkbookHolder(readWorkbook1);
        ArrayList<ReadSheet> actualSheetDataList = new ArrayList<ReadSheet>();
        ReadSheet readSheet1 = new ReadSheet();
        readSheet1.setSheetName("Acme");
        readSheet1.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList2 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener2 = mock(ReadListener.class);
        customReadListenerList2.add(readListener2);
        readSheet1.setCustomReadListenerList(customReadListenerList2);
        readSheet1.setHeadRowNumber(1);
        readSheet1.setAutoTrim(false);
        readSheet1.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter2 = mock(Converter.class);
        customConverterList2.add(converter2);
        readSheet1.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        ArrayList<String> stringList2 = new ArrayList<String>();
        stringList2.add("foo");
        head2.add(stringList2);
        readSheet1.setHead(head2);
        readSheet1.setLocale(new Locale("en"));
        readSheet1.setUse1904windowing(false);
        readSheet1.setUseScientificFormat(false);
        actualSheetDataList.add(readSheet1);
        readWorkbookHolder.setActualSheetDataList(actualSheetDataList);
        readWorkbookHolder.setAutoCloseStream(false);
        readWorkbookHolder.setConvertAllFiled(false);
        Object customObject2 = new Object();
        readWorkbookHolder.setCustomObject(customObject2);
        readWorkbookHolder.setDefaultReturnMap(false);
        readWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);
        readWorkbookHolder.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbookHolder.setHasReadSheet(new HashSet<Integer>());
        readWorkbookHolder.setIgnoreEmptyRow(false);
        readWorkbookHolder.setInputStream(new StringBufferInputStream("foo"));
        readWorkbookHolder.setMandatoryUseInputStream(false);
        ArrayList<ReadSheet> parameterSheetDataList =
             new ArrayList<ReadSheet>();
        ReadSheet readSheet2 = new ReadSheet();
        readSheet2.setSheetName("Acme");
        readSheet2.setSheetNo(1);
        ArrayList<ReadListener> customReadListenerList3 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener3 = mock(ReadListener.class);
        customReadListenerList3.add(readListener3);
        readSheet2.setCustomReadListenerList(customReadListenerList3);
        readSheet2.setHeadRowNumber(1);
        readSheet2.setAutoTrim(false);
        readSheet2.setClazz(String.class);
        ArrayList<Converter> customConverterList3 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter3 = mock(Converter.class);
        customConverterList3.add(converter3);
        readSheet2.setCustomConverterList(customConverterList3);
        ArrayList<List<String>> head3 = new ArrayList<List<String>>();
        ArrayList<String> stringList3 = new ArrayList<String>();
        stringList3.add("foo");
        head3.add(stringList3);
        readSheet2.setHead(head3);
        readSheet2.setLocale(new Locale("en"));
        readSheet2.setUse1904windowing(false);
        readSheet2.setUseScientificFormat(false);
        parameterSheetDataList.add(readSheet2);
        readWorkbookHolder.setParameterSheetDataList(parameterSheetDataList);
        readWorkbookHolder.setPassword("secret");
        readWorkbookHolder.setReadAll(false);
        ReadCache readCache2 = mock(ReadCache.class);
        readWorkbookHolder.setReadCache(readCache2);
        ReadCacheSelector readCacheSelector2 = mock(ReadCacheSelector.class);
        readWorkbookHolder.setReadCacheSelector(readCacheSelector2);
        ReadWorkbook readWorkbook2 = new ReadWorkbook();
        readWorkbook2.setAutoCloseStream(false);
        readWorkbook2.setConvertAllFiled(false);
        readWorkbook2.setCustomObject(new Object());
        readWorkbook2.setDefaultReturnMap(false);
        readWorkbook2.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook2.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook2.setIgnoreEmptyRow(false);
        readWorkbook2.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook2.setMandatoryUseInputStream(false);
        readWorkbook2.setPassword("secret");
        ReadCache readCache3 = mock(ReadCache.class);
        readWorkbook2.setReadCache(readCache3);
        ReadCacheSelector readCacheSelector3 = mock(ReadCacheSelector.class);
        readWorkbook2.setReadCacheSelector(readCacheSelector3);
        readWorkbook2.setUseDefaultListener(false);
        readWorkbook2.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList4 =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener4 = mock(ReadListener.class);
        customReadListenerList4.add(readListener4);
        readWorkbook2.setCustomReadListenerList(customReadListenerList4);
        readWorkbook2.setHeadRowNumber(1);
        readWorkbook2.setAutoTrim(false);
        readWorkbook2.setClazz(String.class);
        ArrayList<Converter> customConverterList4 = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter4 = mock(Converter.class);
        customConverterList4.add(converter4);
        readWorkbook2.setCustomConverterList(customConverterList4);
        ArrayList<List<String>> head4 = new ArrayList<List<String>>();
        ArrayList<String> stringList4 = new ArrayList<String>();
        stringList4.add("foo");
        head4.add(stringList4);
        readWorkbook2.setHead(head4);
        readWorkbook2.setLocale(new Locale("en"));
        readWorkbook2.setUse1904windowing(false);
        readWorkbook2.setUseScientificFormat(false);
        readWorkbookHolder.setReadWorkbook(readWorkbook2);
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head5 = new ArrayList<List<String>>();
        ArrayList<String> stringList5 = new ArrayList<String>();
        stringList5.add("foo");
        head5.add(stringList5);
        ExcelReadHeadProperty excelReadHeadProperty =
             new ExcelReadHeadProperty(holder, String.class, head5, false);
        excelReadHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelReadHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelReadHeadProperty.setHeadClazz(String.class);
        excelReadHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelReadHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelReadHeadProperty.setHeadRowNumber(1);
        excelReadHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        readWorkbookHolder.setExcelReadHeadProperty(excelReadHeadProperty);
        readWorkbookHolder.setHeadRowNumber(1);
        ArrayList<ReadListener> readListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener5 = mock(ReadListener.class);
        readListenerList.add(readListener5);
        readWorkbookHolder.setReadListenerList(readListenerList);
        readWorkbookHolder.setClazz(String.class);
        readWorkbookHolder.setConverterMap(new HashMap<String, Converter>());
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        readWorkbookHolder.setGlobalConfiguration(globalConfiguration);
        ArrayList<List<String>> head6 = new ArrayList<List<String>>();
        ArrayList<String> stringList6 = new ArrayList<String>();
        stringList6.add("foo");
        head6.add(stringList6);
        readWorkbookHolder.setHead(head6);
        readWorkbookHolder.setNewInitialization(false);
        assertThat(readWorkbookHolder.getActualSheetDataList(), hasSize(1));
        assertThat(readWorkbookHolder.getActualSheetDataList().get(0), sameInstance(readSheet1));
        assertThat(readWorkbookHolder.getAutoCloseStream(), is(false));
        assertThat(readWorkbookHolder.getConvertAllFiled(), is(false));
        assertThat(readWorkbookHolder.getCustomObject(), sameInstance(customObject2));
        assertThat(readWorkbookHolder.getDefaultReturnMap(), is(false));
        assertThat(readWorkbookHolder.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(readWorkbookHolder.getExtraReadSet(), empty());
        assertThat(readWorkbookHolder.getFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getHasReadSheet(), empty());
        assertThat(readWorkbookHolder.getIgnoreEmptyRow(), is(false));
        assertThat(readWorkbookHolder.getMandatoryUseInputStream(), is(false));
        assertThat(readWorkbookHolder.getParameterSheetDataList(), hasSize(1));
        assertThat(readWorkbookHolder.getParameterSheetDataList().get(0), sameInstance(readSheet2));
        assertThat(readWorkbookHolder.getPassword(), is("secret"));
        assertThat(readWorkbookHolder.getReadAll(), is(false));
        assertThat(readWorkbookHolder.getReadCache(), sameInstance(readCache2));
        assertThat(readWorkbookHolder.getReadCacheSelector(), sameInstance(readCacheSelector2));
        assertThat(readWorkbookHolder.getReadWorkbook(), sameInstance(readWorkbook2));
        assertThat(readWorkbookHolder.getTempFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty(), sameInstance(excelReadHeadProperty));
        assertThat(readWorkbookHolder.getHeadRowNumber(), is(1));
        assertThat(readWorkbookHolder.getReadListenerList(), hasSize(1));
        assertThat(readWorkbookHolder.getReadListenerList().get(0), is(notNullValue()));
        assertThat((Class<String>) readWorkbookHolder.getClazz(), equalTo((Class) String.class));
        assertThat(readWorkbookHolder.getConverterMap(), anEmptyMap());
        assertThat(readWorkbookHolder.getGlobalConfiguration(), sameInstance(globalConfiguration));
        assertThat(readWorkbookHolder.getHead(), hasSize(1));
        assertThat(readWorkbookHolder.getHead().get(0), equalTo(Arrays.asList("foo")));
        assertThat(readWorkbookHolder.getNewInitialization(), is(false));
    }
}
