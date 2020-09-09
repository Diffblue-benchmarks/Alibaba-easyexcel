package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
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
        readWorkbook1.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook1.setMandatoryUseInputStream(false);
        readWorkbook1.setPassword("secret");
        readWorkbook1.setReadCache(null);
        readWorkbook1.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        readWorkbook1.setUseDefaultListener(false);
        readWorkbook1.setXlsxSAXParserFactoryName("Acme");
        readWorkbook1.setCustomReadListenerList(new ArrayList<ReadListener>());
        readWorkbook1.setHeadRowNumber(1);
        readWorkbook1.setAutoTrim(false);
        readWorkbook1.setClazz(String.class);
        readWorkbook1.setCustomConverterList(new ArrayList<Converter>());
        readWorkbook1.setHead(new ArrayList<List<String>>());
        readWorkbook1.setLocale(new Locale("en"));
        readWorkbook1.setUse1904windowing(false);
        readWorkbook1.setUseScientificFormat(false);
        ReadWorkbookHolder readWorkbookHolder =
             new ReadWorkbookHolder(readWorkbook1);
        readWorkbookHolder.setActualSheetDataList(new ArrayList<ReadSheet>());
        readWorkbookHolder.setAutoCloseStream(false);
        readWorkbookHolder.setConvertAllFiled(false);
        Object customObject2 = new Object();
        readWorkbookHolder.setCustomObject(customObject2);
        readWorkbookHolder.setDefaultReturnMap(false);
        readWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);
        readWorkbookHolder.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbookHolder.setHasReadSheet(new HashSet<Integer>());
        readWorkbookHolder.setIgnoreEmptyRow(false);
        readWorkbookHolder.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbookHolder.setMandatoryUseInputStream(false);
        readWorkbookHolder.setParameterSheetDataList(new ArrayList<ReadSheet>());
        readWorkbookHolder.setPassword("secret");
        readWorkbookHolder.setReadAll(false);
        readWorkbookHolder.setReadCache(new Ehcache(1));
        readWorkbookHolder.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        ReadWorkbook readWorkbook2 = new ReadWorkbook();
        readWorkbook2.setAutoCloseStream(false);
        readWorkbook2.setConvertAllFiled(false);
        readWorkbook2.setCustomObject(new Object());
        readWorkbook2.setDefaultReturnMap(false);
        readWorkbook2.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook2.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook2.setIgnoreEmptyRow(false);
        readWorkbook2.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook2.setMandatoryUseInputStream(false);
        readWorkbook2.setPassword("secret");
        readWorkbook2.setReadCache(new Ehcache(1));
        readWorkbook2.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        readWorkbook2.setUseDefaultListener(false);
        readWorkbook2.setXlsxSAXParserFactoryName("Acme");
        readWorkbook2.setCustomReadListenerList(new ArrayList<ReadListener>());
        readWorkbook2.setHeadRowNumber(1);
        readWorkbook2.setAutoTrim(false);
        readWorkbook2.setClazz(String.class);
        readWorkbook2.setCustomConverterList(new ArrayList<Converter>());
        readWorkbook2.setHead(new ArrayList<List<String>>());
        readWorkbook2.setLocale(new Locale("en"));
        readWorkbook2.setUse1904windowing(false);
        readWorkbook2.setUseScientificFormat(false);
        readWorkbookHolder.setReadWorkbook(readWorkbook2);
        readWorkbookHolder.setHeadRowNumber(1);
        readWorkbookHolder.setReadListenerList(new ArrayList<ReadListener>());
        readWorkbookHolder.setClazz(String.class);
        HashMap<String, Converter> converterMap =
             new HashMap<String, Converter>();
        converterMap.put("foo", new AutoConverter());
        readWorkbookHolder.setConverterMap(converterMap);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        readWorkbookHolder.setGlobalConfiguration(globalConfiguration);
        readWorkbookHolder.setHead(new ArrayList<List<String>>());
        readWorkbookHolder.setNewInitialization(false);
        assertThat(readWorkbookHolder.getActualSheetDataList(), empty());
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
        assertThat(readWorkbookHolder.getParameterSheetDataList(), empty());
        assertThat(readWorkbookHolder.getPassword(), is("secret"));
        assertThat(readWorkbookHolder.getReadAll(), is(false));
        assertThat(readWorkbookHolder.getReadWorkbook(), sameInstance(readWorkbook2));
        assertThat(readWorkbookHolder.getTempFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getContentPropertyMap().isEmpty(), is(true));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat((Class<String>) readWorkbookHolder.getExcelReadHeadProperty().getHeadClazz(), equalTo((Class) String.class));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadKind(), is(HeadKindEnum.CLASS));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadMap().isEmpty(), is(true));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadRowNumber(), is(0));
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        assertThat(readWorkbookHolder.getHeadRowNumber(), is(1));
        assertThat(readWorkbookHolder.getReadListenerList(), empty());
        assertThat((Class<String>) readWorkbookHolder.getClazz(), equalTo((Class) String.class));
        // pojo Converter
        assertThat(readWorkbookHolder.getGlobalConfiguration(), sameInstance(globalConfiguration));
        assertThat(readWorkbookHolder.getHead(), empty());
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
        readWorkbook1.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook1.setMandatoryUseInputStream(false);
        readWorkbook1.setPassword("secret");
        readWorkbook1.setReadCache(new Ehcache(1));
        readWorkbook1.setReadCacheSelector(null);
        readWorkbook1.setUseDefaultListener(false);
        readWorkbook1.setXlsxSAXParserFactoryName("Acme");
        readWorkbook1.setCustomReadListenerList(new ArrayList<ReadListener>());
        readWorkbook1.setHeadRowNumber(1);
        readWorkbook1.setAutoTrim(false);
        readWorkbook1.setClazz(String.class);
        readWorkbook1.setCustomConverterList(new ArrayList<Converter>());
        readWorkbook1.setHead(new ArrayList<List<String>>());
        readWorkbook1.setLocale(new Locale("en"));
        readWorkbook1.setUse1904windowing(false);
        readWorkbook1.setUseScientificFormat(false);
        ReadWorkbookHolder readWorkbookHolder =
             new ReadWorkbookHolder(readWorkbook1);
        readWorkbookHolder.setActualSheetDataList(new ArrayList<ReadSheet>());
        readWorkbookHolder.setAutoCloseStream(false);
        readWorkbookHolder.setConvertAllFiled(false);
        Object customObject2 = new Object();
        readWorkbookHolder.setCustomObject(customObject2);
        readWorkbookHolder.setDefaultReturnMap(false);
        readWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);
        readWorkbookHolder.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbookHolder.setHasReadSheet(new HashSet<Integer>());
        readWorkbookHolder.setIgnoreEmptyRow(false);
        readWorkbookHolder.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbookHolder.setMandatoryUseInputStream(false);
        readWorkbookHolder.setParameterSheetDataList(new ArrayList<ReadSheet>());
        readWorkbookHolder.setPassword("secret");
        readWorkbookHolder.setReadAll(false);
        readWorkbookHolder.setReadCache(new Ehcache(1));
        readWorkbookHolder.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        ReadWorkbook readWorkbook2 = new ReadWorkbook();
        readWorkbook2.setAutoCloseStream(false);
        readWorkbook2.setConvertAllFiled(false);
        readWorkbook2.setCustomObject(new Object());
        readWorkbook2.setDefaultReturnMap(false);
        readWorkbook2.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook2.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook2.setIgnoreEmptyRow(false);
        readWorkbook2.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook2.setMandatoryUseInputStream(false);
        readWorkbook2.setPassword("secret");
        readWorkbook2.setReadCache(new Ehcache(1));
        readWorkbook2.setReadCacheSelector(new EternalReadCacheSelector(new Ehcache(1)));
        readWorkbook2.setUseDefaultListener(false);
        readWorkbook2.setXlsxSAXParserFactoryName("Acme");
        readWorkbook2.setCustomReadListenerList(new ArrayList<ReadListener>());
        readWorkbook2.setHeadRowNumber(1);
        readWorkbook2.setAutoTrim(false);
        readWorkbook2.setClazz(String.class);
        readWorkbook2.setCustomConverterList(new ArrayList<Converter>());
        readWorkbook2.setHead(new ArrayList<List<String>>());
        readWorkbook2.setLocale(new Locale("en"));
        readWorkbook2.setUse1904windowing(false);
        readWorkbook2.setUseScientificFormat(false);
        readWorkbookHolder.setReadWorkbook(readWorkbook2);
        readWorkbookHolder.setHeadRowNumber(1);
        readWorkbookHolder.setReadListenerList(new ArrayList<ReadListener>());
        readWorkbookHolder.setClazz(String.class);
        HashMap<String, Converter> converterMap =
             new HashMap<String, Converter>();
        converterMap.put("foo", new AutoConverter());
        readWorkbookHolder.setConverterMap(converterMap);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        readWorkbookHolder.setGlobalConfiguration(globalConfiguration);
        readWorkbookHolder.setHead(new ArrayList<List<String>>());
        readWorkbookHolder.setNewInitialization(false);
        assertThat(readWorkbookHolder.getActualSheetDataList(), empty());
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
        assertThat(readWorkbookHolder.getParameterSheetDataList(), empty());
        assertThat(readWorkbookHolder.getPassword(), is("secret"));
        assertThat(readWorkbookHolder.getReadAll(), is(false));
        assertThat(readWorkbookHolder.getReadWorkbook(), sameInstance(readWorkbook2));
        assertThat(readWorkbookHolder.getTempFile(), is(nullValue()));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getContentPropertyMap().isEmpty(), is(true));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat((Class<String>) readWorkbookHolder.getExcelReadHeadProperty().getHeadClazz(), equalTo((Class) String.class));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadKind(), is(HeadKindEnum.CLASS));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadMap().isEmpty(), is(true));
        assertThat(readWorkbookHolder.getExcelReadHeadProperty().getHeadRowNumber(), is(0));
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        assertThat(readWorkbookHolder.getHeadRowNumber(), is(1));
        assertThat(readWorkbookHolder.getReadListenerList(), empty());
        assertThat((Class<String>) readWorkbookHolder.getClazz(), equalTo((Class) String.class));
        // pojo Converter
        assertThat(readWorkbookHolder.getGlobalConfiguration(), sameInstance(globalConfiguration));
        assertThat(readWorkbookHolder.getHead(), empty());
        assertThat(readWorkbookHolder.getNewInitialization(), is(false));
    }
}
