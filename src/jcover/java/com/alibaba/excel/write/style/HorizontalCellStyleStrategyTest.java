package com.alibaba.excel.write.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.HorizontalCellStyleStrategy
 *
 * @author Diffblue JCover
 */

public class HorizontalCellStyleStrategyTest {

    @Test(timeout=10000)
    public void initCellStyle1() {
        Workbook workbook = mock(Workbook.class);
        new HorizontalCellStyleStrategy((com.alibaba.excel.write.metadata.style.WriteCellStyle)null, new java.util.ArrayList<com.alibaba.excel.write.metadata.style.WriteCellStyle>()).initCellStyle(workbook);
    }

    @Test(timeout=10000)
    public void initCellStyle2() {
        Font font = mock(Font.class);
        CellStyle cellStyle = mock(CellStyle.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createCellStyle())
            .thenReturn(cellStyle);
        when(workbook.createFont())
            .thenReturn(font);
        new HorizontalCellStyleStrategy(new com.alibaba.excel.write.metadata.style.WriteCellStyle(), new java.util.ArrayList<com.alibaba.excel.write.metadata.style.WriteCellStyle>()).initCellStyle(workbook);
    }

    @Test(timeout=10000)
    public void initCellStyle3() {
        CellStyle cellStyle1 = mock(CellStyle.class);
        Font font = mock(Font.class);
        CellStyle cellStyle2 = mock(CellStyle.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createCellStyle())
            .thenReturn(cellStyle2)
            .thenReturn(cellStyle1);
        when(workbook.createFont())
            .thenReturn(font);
        new HorizontalCellStyleStrategy(new com.alibaba.excel.write.metadata.style.WriteCellStyle(), new com.alibaba.excel.write.metadata.style.WriteCellStyle()).initCellStyle(workbook);
    }

    @Test(timeout=10000)
    public void initCellStyle4() {
        Font font = mock(Font.class);
        CellStyle cellStyle = mock(CellStyle.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createCellStyle())
            .thenReturn(cellStyle);
        when(workbook.createFont())
            .thenReturn(font);
        new HorizontalCellStyleStrategy(new com.alibaba.excel.write.metadata.style.WriteCellStyle(), (java.util.List<com.alibaba.excel.write.metadata.style.WriteCellStyle>)null).initCellStyle(workbook);
    }

    @Test(timeout=10000)
    public void setContentCellStyleRelativeRowIndexIsOne() {
        Cell cell = mock(Cell.class);
        new HorizontalCellStyleStrategy(new com.alibaba.excel.write.metadata.style.WriteCellStyle(), new com.alibaba.excel.write.metadata.style.WriteCellStyle()).setContentCellStyle(cell, new Head(0, "bar", new ArrayList<String>(), true, false), 1);
    }

    @Test(timeout=10000)
    public void setHeadCellStyleRelativeRowIndexIsOne() {
        Cell cell = mock(Cell.class);
        new HorizontalCellStyleStrategy(new com.alibaba.excel.write.metadata.style.WriteCellStyle(), new com.alibaba.excel.write.metadata.style.WriteCellStyle()).setHeadCellStyle(cell, new Head(1, "bar", new ArrayList<String>(), true, false), 1);
    }

    @Test(timeout=10000)
    public void uniqueValueReturnsCellStyleStrategy() {
        assertThat(new HorizontalCellStyleStrategy(new WriteCellStyle(), new WriteCellStyle()).uniqueValue(), is("CellStyleStrategy"));
    }
}
