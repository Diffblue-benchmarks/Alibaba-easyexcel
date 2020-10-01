package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
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

/**
 * Unit tests for com.alibaba.excel.util.ConverterUtils
 *
 * @author Diffblue Cover
 */

class ConverterUtilsTest {

    @Test
    void convertToStringMapReturnsNullNull() {

        // arrange
        HashMap<Integer, CellData> cellDataMap =
             new HashMap<Integer, CellData>();
        CellData x202 = new CellData();
        x202.setType(CellDataTypeEnum.EMPTY);
        cellDataMap.put(1, x202);
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
