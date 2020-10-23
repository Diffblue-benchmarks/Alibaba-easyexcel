package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
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
        baseRowModel.setCellStyleMap(new HashMap<Integer, CellStyle>());
        assertThat(baseRowModel.getCellStyleMap().isEmpty(), is(true));
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

        // arrange
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap =
             new HashMap<Integer, CellStyle>();
        CellStyle cellStyle = mock(CellStyle.class);
        cellStyleMap.put(1, cellStyle);
        baseRowModel.setCellStyleMap(cellStyleMap);

        // act
        CellStyle result = baseRowModel.getStyle(1);

        // assert
        assertThat(result, is(notNullValue()));
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(result));
    }
}
