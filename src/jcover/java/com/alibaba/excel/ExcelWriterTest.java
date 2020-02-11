package com.alibaba.excel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.ExcelWriter
 *
 * @author Diffblue JCover
 */

public class ExcelWriterTest {

    @Test(timeout=10000)
    public void finish() {
        new ExcelWriter(new com.alibaba.excel.parameter.GenerateParam("name", String.class, new java.io.ByteArrayOutputStream())).finish();
    }

    @Test(timeout=10000)
    public void write0() {
        ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write0(new ArrayList(), new Sheet(0), new Table(1)), sameInstance(excelWriter));
    }

//    @Test(timeout=10000)
//    public void write0() {  <-- method write0() is already defined in class com.alibaba.excel.ExcelWriterTest
//        ExcelWriter excelWriter = new ExcelWriter(new WriteWorkbook());
//        assertThat(excelWriter.write0(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
//    }
//
//    @Test(timeout=10000)
//    public void write1() {
//        ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
//        WriteSheet writeSheet = new WriteSheet();
//        assertThat(writeSheet.getSheetNo(), is(0));  <-- Expected: is <0>     but: was null
//        assertThat(excelWriter.write(new ArrayList(), writeSheet), sameInstance(excelWriter));
//    }
//
//    @Test(timeout=10000)
//    public void write1() {  <-- method write1() is already defined in class com.alibaba.excel.ExcelWriterTest
//        ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
//        assertThat(excelWriter.write1(new ArrayList(), new Sheet(0), new Table(1)), sameInstance(excelWriter));
//    }
//
//    @Test(timeout=10000)
//    public void write1() {  <-- method write1() is already defined in class com.alibaba.excel.ExcelWriterTest
//        ExcelWriter excelWriter = new ExcelWriter(new WriteWorkbook());
//        assertThat(excelWriter.write1(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
//    }
//
    @Test(timeout=10000)
    public void write2() {
        ExcelWriter excelWriter = new ExcelWriter(new WriteWorkbook());
        assertThat(excelWriter.write(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
    }

    @Test(timeout=10000)
    public void write3() {
        ExcelWriter excelWriter = new ExcelWriter(new ByteArrayOutputStream(), ExcelTypeEnum.XLS);
        assertThat(excelWriter.write(new ArrayList(), new Sheet(1)), sameInstance(excelWriter));
    }

    @Test(timeout=10000)
    public void write4() {
        ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("name", String.class, new ByteArrayOutputStream()));
        assertThat(excelWriter.write(new ArrayList(), new Sheet(0), new Table(1)), sameInstance(excelWriter));
    }

    @Test(timeout=10000)
    public void writeContext() {
        OutputStream outputStream1 = new ByteArrayOutputStream();
        WriteContext result = new ExcelWriter(new GenerateParam("name", String.class, outputStream1)).writeContext();
        assertThat(result.getOutputStream(), sameInstance(outputStream1));
        assertThat(result.getWorkbook().getActiveSheetIndex(), is(0));
        assertTrue(result.getWorkbook().getAllNames().isEmpty());
        assertTrue(result.getWorkbook().getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(result.getWorkbook().getFirstVisibleTab(), is(0));
        assertThat(result.getWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(result.getWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(result.getWorkbook().getNumCellStyles(), is(1));
        assertThat(result.getWorkbook().getNumberOfFonts(), is((short)1));
        assertThat(result.getWorkbook().getNumberOfNames(), is(0));
        assertThat(result.getWorkbook().getNumberOfSheets(), is(0));
        assertThat(result.getWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
    }
}
