package com.alibaba.excel.context;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.context.AnalysisContextImpl
 *
 * @author Diffblue Cover
 */

class AnalysisContextImplTest {

    @Test
    void readWorkbookHolder() {

        // arrange
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(false);
        readWorkbook.setConvertAllFiled(false);
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("foo"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(null);
        ReadCacheSelector readCacheSelector = mock(ReadCacheSelector.class);
        readWorkbook.setReadCacheSelector(readCacheSelector);
        readWorkbook.setUseDefaultListener(false);
        readWorkbook.setXlsxSAXParserFactoryName("Acme");
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        customReadListenerList.add(readListener);
        readWorkbook.setCustomReadListenerList(customReadListenerList);
        readWorkbook.setHeadRowNumber(1);
        readWorkbook.setAutoTrim(false);
        readWorkbook.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        when(converter.supportExcelTypeKey())
            .thenReturn(CellDataTypeEnum.STRING);
        when(converter.supportJavaTypeKey())
            .thenReturn(String.class);
        customConverterList.add(converter);
        readWorkbook.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        readWorkbook.setHead(head);
        Locale locale = new Locale("en");
        readWorkbook.setLocale(locale);
        readWorkbook.setUse1904windowing(false);
        readWorkbook.setUseScientificFormat(false);

        // act
        ReadWorkbookHolder result =
             new AnalysisContextImpl(readWorkbook, ExcelTypeEnum.XLS).readWorkbookHolder();

        // assert
        assertThat(result.getActualSheetDataList(), is(nullValue()));
        assertThat(result.getAutoCloseStream(), is(false));
        assertThat(result.getConvertAllFiled(), is(nullValue()));
        assertThat(result.getCustomObject(), sameInstance(customObject));
        assertThat(result.getDefaultReturnMap(), is(false));
        assertThat(result.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(result.getExtraReadSet(), empty());
        assertThat(result.getFile(), is(nullValue()));
        assertThat(result.getHasReadSheet(), empty());
        assertThat(result.getIgnoreEmptyRow(), is(false));
        assertThat(result.getMandatoryUseInputStream(), is(false));
        assertThat(result.getParameterSheetDataList(), is(nullValue()));
        assertThat(result.getPassword(), is("secret"));
        assertThat(result.getReadAll(), is(nullValue()));
        assertThat(result.getReadCache(), is(nullValue()));
        assertThat(result.getReadCacheSelector(), sameInstance(readCacheSelector));
        assertThat(result.getReadWorkbook(), sameInstance(readWorkbook));
        assertThat(result.getTempFile(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getContentPropertyMap().get(0), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat((Class<String>) result.getExcelReadHeadProperty().getHeadClazz(), equalTo((Class) String.class));
        assertThat(result.getExcelReadHeadProperty().getHeadKind(), is(HeadKindEnum.CLASS));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnIndex(), is(0));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnWidthProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getContentFontProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getContentStyleProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getFieldName(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceIndex(), is(false));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceName(), is(true));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadFontProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadStyleProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getLoopMergeProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadRowNumber(), is(1));
        // pojo Class<?> result.getExcelReadHeadProperty().getIgnoreMap().get("CASE_INSENSITIVE_ORDER").getDeclaringClass()
        // pojo String result.getExcelReadHeadProperty().getIgnoreMap().get("CASE_INSENSITIVE_ORDER").getName()
        // pojo Class<?> result.getExcelReadHeadProperty().getIgnoreMap().get("hash").getDeclaringClass()
        // pojo String result.getExcelReadHeadProperty().getIgnoreMap().get("hash").getName()
        // pojo Class<?> result.getExcelReadHeadProperty().getIgnoreMap().get("serialPersistentFields").getDeclaringClass()
        // pojo String result.getExcelReadHeadProperty().getIgnoreMap().get("serialPersistentFields").getName()
        // pojo Class<?> result.getExcelReadHeadProperty().getIgnoreMap().get("serialVersionUID").getDeclaringClass()
        // pojo String result.getExcelReadHeadProperty().getIgnoreMap().get("serialVersionUID").getName()
        // pojo Class<?> result.getExcelReadHeadProperty().getIgnoreMap().get("value").getDeclaringClass()
        // pojo String result.getExcelReadHeadProperty().getIgnoreMap().get("value").getName()
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getReadListenerList().size(), is(1));
        assertThat(result.getReadListenerList().get(0), is(notNullValue()));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        // pojo Converter result.getConverterMap().get("java.lang.Boolean-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Boolean-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Boolean-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Byte-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Byte-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Byte-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Double-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Double-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Double-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Float-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Float-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Float-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Integer-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Integer-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Integer-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Long-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Long-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Long-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Object-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.Short-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.Short-NUMBER")
        // pojo Converter result.getConverterMap().get("java.lang.Short-STRING")
        // pojo Converter result.getConverterMap().get("java.lang.String-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.lang.String-DIRECT_STRING")
        // pojo Converter result.getConverterMap().get("java.lang.String-EMPTY")
        // pojo Converter result.getConverterMap().get("java.lang.String-ERROR")
        // pojo Converter result.getConverterMap().get("java.lang.String-IMAGE")
        // pojo Converter result.getConverterMap().get("java.lang.String-NUMBER")
        assertThat(result.getConverterMap().get("java.lang.String-STRING"), is(notNullValue()));
        // pojo Converter result.getConverterMap().get("java.math.BigDecimal-BOOLEAN")
        // pojo Converter result.getConverterMap().get("java.math.BigDecimal-NUMBER")
        // pojo Converter result.getConverterMap().get("java.math.BigDecimal-STRING")
        // pojo Converter result.getConverterMap().get("java.util.Date-NUMBER")
        // pojo Converter result.getConverterMap().get("java.util.Date-STRING")
        assertThat(result.getGlobalConfiguration().getAutoTrim(), is(false));
        assertThat(result.getGlobalConfiguration().getLocale(), sameInstance(locale));
        assertThat(result.getGlobalConfiguration().getUse1904windowing(), is(false));
        assertThat(result.getGlobalConfiguration().getUseScientificFormat(), is(false));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), hasSize(1));
        assertThat(result.getHead().get(0).get(0), is("Smith"));
        assertThat(result.getNewInitialization(), is(true));
    }

    @Test
    void readSheetHolderReturnsNull() {
        assertThat(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).readSheetHolder(), is(nullValue()));
    }

    @Test
    void readRowHolderReturnsNull() {
        assertThat(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).readRowHolder(), is(nullValue()));
    }

    @Test
    void readRowHolder() {
        new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).readRowHolder(new ReadRowHolder(1, RowTypeEnum.DATA, new GlobalConfiguration(), new HashMap<Integer, Cell>()));
    }

    @Test
    void currentReadHolder() {
        // pojo com.alibaba.excel.read.metadata.holder.ReadHolder new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).currentReadHolder()
    }

    @Test
    void getCustom() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        assertThat(new AnalysisContextImpl(readWorkbook, ExcelTypeEnum.XLS).getCustom(), sameInstance(customObject));
    }

    @Test
    void analysisEventProcessor() {
        // pojo com.alibaba.excel.read.processor.AnalysisEventProcessor new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).analysisEventProcessor()
    }

    @Test
    void readSheetListReturnsNull() {
        assertThat(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).readSheetList(), is(nullValue()));
    }

    @Test
    void readSheetListReadSheetListIsEmpty() {
        new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).readSheetList(new ArrayList<ReadSheet>());
    }

    @Test
    void getExcelTypeReturnsXls() {
        assertThat(new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS).getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test
    void getInputStream() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        StringBufferInputStream inputStream =
             new StringBufferInputStream("foo");
        readWorkbook.setInputStream(inputStream);
        assertThat(new AnalysisContextImpl(readWorkbook, ExcelTypeEnum.XLS).getInputStream(), instanceOf(StringBufferInputStream.class));
        assertThat((StringBufferInputStream) new AnalysisContextImpl(readWorkbook, ExcelTypeEnum.XLS).getInputStream(), sameInstance(inputStream));
    }
}
