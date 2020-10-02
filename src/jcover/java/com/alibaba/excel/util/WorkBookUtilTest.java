package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.util.WorkBookUtil
 *
 * @author Diffblue Cover
 */

class WorkBookUtilTest {

    @Test
    void createSheetSheetNameIsAcme() throws java.io.IOException, Exception {
        Sheet sheet = mock(Sheet.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createSheet(Mockito.<String>any()))
            .thenReturn(sheet);
        assertThat(WorkBookUtil.createSheet(workbook, "Acme"), is(notNullValue()));
    }

    @Test
    void createRowRowNumIsOne() {
        Row row = mock(Row.class);
        Sheet sheet = mock(Sheet.class);
        when(sheet.createRow(anyInt()))
            .thenReturn(row);
        assertThat(WorkBookUtil.createRow(sheet, 1), is(notNullValue()));
    }

    @Test
    void createCellColNumIsOne() throws org.apache.poi.ss.formula.FormulaParseException {
        Cell cell = mock(Cell.class);
        Row row = mock(Row.class);
        when(row.createCell(anyInt()))
            .thenReturn(cell);
        assertThat(WorkBookUtil.createCell(row, 1), is(notNullValue()));
    }

    @Test
    void createCell1() throws org.apache.poi.ss.formula.FormulaParseException {
        Cell cell = mock(Cell.class);
        Row row = mock(Row.class);
        when(row.createCell(anyInt()))
            .thenReturn(cell);
        CellStyle cellStyle = mock(CellStyle.class);
        assertThat(WorkBookUtil.createCell(row, 1, cellStyle), is(notNullValue()));
        Mockito.verify(cell).setCellStyle(ArgumentMatchers.<CellStyle>any());
    }

    @Test
    void createCell2() throws org.apache.poi.ss.formula.FormulaParseException {
        Cell cell = mock(Cell.class);
        Row row = mock(Row.class);
        when(row.createCell(anyInt()))
            .thenReturn(cell);
        CellStyle cellStyle = mock(CellStyle.class);
        assertThat(WorkBookUtil.createCell(row, 1, cellStyle, "value"), is(notNullValue()));
        Mockito.verify(cell).setCellStyle(ArgumentMatchers.<CellStyle>any());
        Mockito.verify(cell).setCellValue(ArgumentMatchers.eq("value"));
    }

    @Test
    void createCell3() throws org.apache.poi.ss.formula.FormulaParseException {
        Cell cell = mock(Cell.class);
        Row row = mock(Row.class);
        when(row.createCell(anyInt()))
            .thenReturn(cell);
        assertThat(WorkBookUtil.createCell(row, 1, "value"), is(notNullValue()));
        Mockito.verify(cell).setCellValue(ArgumentMatchers.eq("value"));
    }
}
