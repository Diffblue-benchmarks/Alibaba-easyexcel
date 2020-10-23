package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.BaseRowModel
 *
 * @author Diffblue Cover
 */

class BaseRowModelTest {

    @Test
    void factory() {
        BaseRowModel baseRowModel = new BaseRowModel();
        baseRowModel.setCellStyleMap(new HashMap<Integer, CellStyle>());
        assertThat(baseRowModel.getCellStyleMap(), is(notNullValue()));
    }

    @Test
    void addStyleRowIsOne() {
        CellStyle cellStyle = mock(CellStyle.class);
        new BaseRowModel().addStyle(1, cellStyle);
    }

    @Test
    void getStyleRowIsOne() {
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap =
             new HashMap<Integer, CellStyle>();
        CellStyle cellStyle = mock(CellStyle.class);
        cellStyleMap.put(1, cellStyle);
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getStyle(1), is(notNullValue()));
    }
}
