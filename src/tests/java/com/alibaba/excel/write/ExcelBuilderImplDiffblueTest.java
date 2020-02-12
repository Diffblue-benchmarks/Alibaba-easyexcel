package com.alibaba.excel.write;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.fill.FillConfig;

import java.util.ArrayList;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.ExcelBuilderImpl
 *
 * @author Diffblue JCover
 */

public class ExcelBuilderImplDiffblueTest {

    @Test(timeout=10000)
    public void addContentDataIsEmpty() {
        WriteSheet writeSheet = new WriteSheet();
        new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).addContent(new ArrayList(), writeSheet);
        assertThat(writeSheet.getSheetNo(), is(0));
    }

    @Test(timeout=10000)
    public void addContentDataIsEmptyAndPasswordIsFoo() {
        WriteSheet writeSheet = new WriteSheet();
        WriteTable writeTable = new WriteTable();
        new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).addContent(new ArrayList(), writeSheet, writeTable, "foo");
        assertThat(writeSheet.getSheetNo(), is(0));
        assertThat(writeTable.getTableNo(), is(0));
    }

    @Test(timeout=10000)
    public void addContentDataIsNull() {
        new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).addContent(null, new WriteSheet());
    }

    @Test(timeout=10000)
    public void addContentDataIsNullAndPasswordIsFoo() {
        new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).addContent(null, new WriteSheet(), new WriteTable(), "foo");
    }

    @Test(timeout=10000)
    public void fillDataIsNull() {
        new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).fill(null, new FillConfig(), new WriteSheet());
    }

    @Test(timeout=10000)
    public void writeContext() {
        WriteContext result = new ExcelBuilderImpl(new com.alibaba.excel.write.metadata.WriteWorkbook()).writeContext();
        assertThat(result.getOutputStream(), is(nullValue()));
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
