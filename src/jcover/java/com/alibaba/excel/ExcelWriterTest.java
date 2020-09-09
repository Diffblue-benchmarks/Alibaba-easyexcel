package com.alibaba.excel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

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
    void factory() {
        // pojo ExcelWriter
    }

    @Test
    void write1() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
    }

    @Test
    void write2() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write(new ArrayList(), new Sheet(1), new Table(1)), sameInstance(excelWriter));
    }

    @Test
    void write3() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write0(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
    }

    @Test
    void write4() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write0(new ArrayList(), new Sheet(1), new Table(1)), sameInstance(excelWriter));
    }

    @Test
    void write5() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write1(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
    }

    @Test
    void write6() {
        ExcelWriter excelWriter =
             new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write1(new ArrayList(), new Sheet(1), new Table(1)), sameInstance(excelWriter));
    }

    @Test
    void finish() {
        new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream())).finish();
    }

    @Test
    void testFinalize() {
        new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream())).finalize();
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
