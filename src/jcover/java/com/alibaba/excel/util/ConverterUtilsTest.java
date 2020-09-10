package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

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
    void convertToStringMapReturnsNullFoo() {

        // arrange
        HashMap<Integer, CellData> cellDataMap =
             new HashMap<Integer, CellData>();
        CellData x202 = new CellData();
        x202.setStringValue("foo");
        x202.setType(CellDataTypeEnum.STRING);
        cellDataMap.put(1, x202);

        // act
        Map<Integer, String> result =
             ConverterUtils.convertToStringMap(cellDataMap, new AnalysisContextImpl(new ReadWorkbook(), ExcelTypeEnum.XLS));

        // assert
        assertThat(result.get(0), is(nullValue()));
        assertThat(result.get(1), is("foo"));
    }
}
