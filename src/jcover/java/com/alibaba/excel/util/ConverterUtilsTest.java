package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.holder.ReadHolder;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.ConverterUtils
 *
 * @author Diffblue JCover
 */

public class ConverterUtilsTest {

    @Test(timeout=10000)
    public void convertToStringMapCellDataMapIsEmptyReturnsEmpty() {
        ReadHolder readHolder = mock(ReadHolder.class);
        assertThat(ConverterUtils.convertToStringMap(new HashMap<Integer, com.alibaba.excel.metadata.CellData>(), readHolder).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void convertToStringMapReturnsNull() {
        Map<Integer, CellData> cellDataMap = new HashMap<Integer, CellData>();
        ((HashMap<Integer, CellData>)cellDataMap).put(1, new CellData(CellDataTypeEnum.EMPTY));
        ReadHolder readHolder = mock(ReadHolder.class);
        assertThat(ConverterUtils.convertToStringMap(cellDataMap, readHolder).get(1), is(nullValue()));
    }
}
