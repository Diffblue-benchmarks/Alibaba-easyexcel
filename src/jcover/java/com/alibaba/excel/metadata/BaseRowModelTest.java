package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.BaseRowModel
 *
 * @author Diffblue JCover
 */

public class BaseRowModelTest {

    @Test(timeout=10000)
    public void addStyleRowIsOne() {
        BaseRowModel baseRowModel = new BaseRowModel();
        CellStyle cellStyle = mock(CellStyle.class);
        baseRowModel.addStyle(1, cellStyle);
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(cellStyle));
    }

    @Test(timeout=10000)
    public void getCellStyleMapReturnsEmpty() {
        BaseRowModel baseRowModel = new BaseRowModel();
        Map<Integer, CellStyle> result = baseRowModel.getCellStyleMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(baseRowModel.getCellStyleMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getStyleRowIsOneReturnsNull() {
        assertThat(new BaseRowModel().getStyle(1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCellStyleMapToEmpty() {
        BaseRowModel baseRowModel = new BaseRowModel();
        Map<Integer, CellStyle> cellStyleMap = new HashMap<Integer, CellStyle>();
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getCellStyleMap(), sameInstance(cellStyleMap));
    }
}
