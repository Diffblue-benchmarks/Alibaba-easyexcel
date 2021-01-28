package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadHolder;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.util.ConverterUtils
 *
 * @author Diffblue Cover
 */

class ConverterUtilsTest {

    @Test
    void convertToStringMapReturnsEmpty() {
        ReadHolder readHolder = mock(ReadHolder.class);
        AnalysisContext context = mock(AnalysisContext.class);
        when(context.currentReadHolder())
            .thenReturn(readHolder);
        assertThat(ConverterUtils.convertToStringMap(new HashMap<Integer, CellData>(), context), anEmptyMap());
    }

    @Test
    void convertToStringMapReturnsNullFoo() throws Exception {

        // arrange
        HashMap<Integer, CellData> cellDataMap =
             new HashMap<Integer, CellData>();
        CellData<String> cellData = new CellData<String>();
        cellData.setType(CellDataTypeEnum.STRING);
        cellDataMap.put(1, cellData);
        GlobalConfiguration globalConfiguration1 =
             mock(GlobalConfiguration.class);
        HashMap<String, Converter> converterMap =
             new HashMap<String, Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        when(converter.convertToJavaData(Mockito.<CellData>any(), Mockito.<com.alibaba.excel.metadata.property.ExcelContentProperty>any(), Mockito.<GlobalConfiguration>any()))
            .thenReturn("foo");
        converterMap.put("java.lang.String-STRING", converter);
        ReadHolder readHolder = mock(ReadHolder.class);
        when(readHolder.converterMap())
            .thenReturn(converterMap);
        when(readHolder.globalConfiguration())
            .thenReturn(new GlobalConfiguration());
        AnalysisContext context = mock(AnalysisContext.class);
        when(context.currentReadHolder())
            .thenReturn(readHolder);

        // act
        Map<Integer, String> result =
             ConverterUtils.convertToStringMap(cellDataMap, context);

        // assert
        assertThat(result.get(0), is(nullValue()));
        assertThat(result.get(1), is("foo"));
    }

    @Test
    void convertToStringMapReturnsNullNull() throws Exception {

        // arrange
        HashMap<Integer, CellData> cellDataMap =
             new HashMap<Integer, CellData>();
        CellData<String> cellData = new CellData<String>();
        cellData.setType(CellDataTypeEnum.EMPTY);
        cellDataMap.put(1, cellData);
        HashMap<String, Converter> converterMap =
             new HashMap<String, Converter>();
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        converterMap.put("java.lang.String-STRING", converter);
        ReadHolder readHolder = mock(ReadHolder.class);
        AnalysisContext context = mock(AnalysisContext.class);
        when(context.currentReadHolder())
            .thenReturn(readHolder);

        // act
        Map<Integer, String> result =
             ConverterUtils.convertToStringMap(cellDataMap, context);

        // assert
        assertThat(result.get(0), is(nullValue()));
        assertThat(result.get(1), is(nullValue()));
    }
}
