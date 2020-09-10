package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
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
        HashMap<Integer, CellStyle> cellStyleMap =
             new HashMap<Integer, CellStyle>();
        CellStyle x14 = mock(CellStyle.class);
        cellStyleMap.put(1, x14);
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(x14));
    }

    @Test
    void addStyleRowIsOne() {

        // arrange
        BaseRowModel baseRowModel = new BaseRowModel();
        CellStyle cellStyle = mock(CellStyle.class);

        // act
        baseRowModel.addStyle(1, cellStyle);

        // assert
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(cellStyle));
    }

    @Test
    void getStyleRowIsOne() {
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap =
             new HashMap<Integer, CellStyle>();
        CellStyle x4 = mock(CellStyle.class);
        cellStyleMap.put(1, x4);
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getStyle(1), sameInstance(x4));
    }
}
