package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.metadata.BaseRowModel
 *
 * @author Diffblue Cover
 */

class BaseRowModelTest {

    @Test
    void factory() {
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap = new HashMap<Integer, CellStyle>();
        CellStyle x4 = mock(CellStyle.class);
        cellStyleMap.put(1, x4);
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(x4));
    }

    @Test
    void addStyle() throws java.io.IOException {

        // arrange
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap = new HashMap<Integer, CellStyle>();
        CellStyle x4 = mock(CellStyle.class);
        cellStyleMap.put(0, x4);
        baseRowModel.setCellStyleMap(cellStyleMap);
        CellStyle cellStyle1 = mock(CellStyle.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createCellStyle())
            .thenReturn(cellStyle1);
        CellStyle cellStyle2 = com.alibaba.excel.util.StyleUtil.buildDefaultCellStyle(workbook);

        // act
        baseRowModel.addStyle(1, cellStyle2);

        // assert
        assertThat(baseRowModel.getCellStyleMap().get(1), sameInstance(cellStyle2));
        Mockito.verify(cellStyle1).setAlignment(ArgumentMatchers.<HorizontalAlignment>any());
        Mockito.verify(cellStyle1).setBorderBottom(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle1).setBorderLeft(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle1).setBorderRight(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle1).setBorderTop(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle1).setFillForegroundColor((short) 22);
        Mockito.verify(cellStyle1).setFillPattern(ArgumentMatchers.<FillPatternType>any());
        Mockito.verify(cellStyle1).setLocked(true);
        Mockito.verify(cellStyle1).setVerticalAlignment(ArgumentMatchers.<VerticalAlignment>any());
        Mockito.verify(cellStyle1).setWrapText(true);
    }

    @Test
    void getStyleRowIsOne() {
        BaseRowModel baseRowModel = new BaseRowModel();
        HashMap<Integer, CellStyle> cellStyleMap = new HashMap<Integer, CellStyle>();
        CellStyle x4 = mock(CellStyle.class);
        cellStyleMap.put(1, x4);
        baseRowModel.setCellStyleMap(cellStyleMap);
        assertThat(baseRowModel.getStyle(1), sameInstance(x4));
    }
}
