package com.alibaba.excel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Row;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.ExcelWriter
 *
 * @author Diffblue Cover
 */

class ExcelWriterTest {

    @Test
    void finish1() {
        new ExcelWriter(new ByteArrayOutputStream(), ExcelTypeEnum.XLS).finish();
    }

    @Test
    void finish2() {
        new ExcelWriter(null, new ByteArrayOutputStream(), ExcelTypeEnum.XLS, false).finish();
    }

    @Test
    void testFinalize1() {
        new ExcelWriter(new ByteArrayOutputStream(), ExcelTypeEnum.XLS).finalize();
    }

    @Test
    void testFinalize2() {
        new ExcelWriter(null, ExcelTypeEnum.XLS).finalize();
    }

    @Test
    void writeContext() {

        // arrange
        GenerateParam generateParam =
             new GenerateParam("name", String.class, new ByteArrayOutputStream());
        generateParam.setType(ExcelTypeEnum.XLS);

        // act
        WriteContext result = new ExcelWriter(generateParam).writeContext();

        // assert
        assertThat(result.getWorkbook().getActiveSheetIndex(), is(0));
        assertThat(result.getWorkbook().getAllNames(), empty());
        assertThat(result.getWorkbook().getAllPictures(), empty());
        assertThat(result.getWorkbook().getFirstVisibleTab(), is(0));
        assertThat(result.getWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(result.getWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(result.getWorkbook().getNumCellStyles(), is(22));
        assertThat(result.getWorkbook().getNumberOfFonts(), is((short) 5));
        assertThat(result.getWorkbook().getNumberOfNames(), is(0));
        assertThat(result.getWorkbook().getNumberOfSheets(), is(0));
        assertThat(result.getWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL97));
        assertThat(result.getWorkbook().isHidden(), is(false));
    }
}
