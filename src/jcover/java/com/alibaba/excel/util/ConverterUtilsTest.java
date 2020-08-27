package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.holder.AbstractReadHolder;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.ConverterUtils
 *
 * @author Diffblue Cover
 */

class ConverterUtilsTest {

    @Test
    void convertToStringMapReturnsNull() {
        HashMap<Integer, CellData> cellDataMap =
             new HashMap<Integer, CellData>();
        CellData x122 = new CellData();
        x122.setType(CellDataTypeEnum.EMPTY);
        cellDataMap.put(1, x122);
        AbstractReadHolder readHolder = mock(AbstractReadHolder.class);
        assertThat(ConverterUtils.convertToStringMap(cellDataMap, readHolder).get(1), is(nullValue()));
    }
}
