package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Test;

public class WorkBookUtilDiffblueTest {
  @Test(timeout=10000)
  public void createWorkBookTest() throws IOException {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    WorkBookUtil.createWorkBook(writeWorkbookHolder);

    // Assert
    Workbook actualWorkbook = writeWorkbookHolder.getWorkbook();
    Workbook cachedWorkbook = writeWorkbookHolder.getCachedWorkbook();
    assertTrue(cachedWorkbook instanceof SXSSFWorkbook);
    short actualNumberOfFonts = cachedWorkbook.getNumberOfFonts();
    Row.MissingCellPolicy actualMissingCellPolicy = cachedWorkbook.getMissingCellPolicy();
    boolean actualForceFormulaRecalculation = cachedWorkbook.getForceFormulaRecalculation();
    int actualRandomAccessWindowSize = ((SXSSFWorkbook) cachedWorkbook).getRandomAccessWindowSize();
    int actualFirstVisibleTab = cachedWorkbook.getFirstVisibleTab();
    int actualNumberOfSheets = cachedWorkbook.getNumberOfSheets();
    int actualNumberOfNames = cachedWorkbook.getNumberOfNames();
    int actualActiveSheetIndex = cachedWorkbook.getActiveSheetIndex();
    boolean actualIsCompressTempFilesResult = ((SXSSFWorkbook) cachedWorkbook).isCompressTempFiles();
    assertSame(cachedWorkbook, actualWorkbook);
    assertEquals(1, cachedWorkbook.getNumCellStyles());
    assertEquals((short) 1, actualNumberOfFonts);
    assertEquals(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK, actualMissingCellPolicy);
    assertEquals(500, actualRandomAccessWindowSize);
    assertEquals(0, actualFirstVisibleTab);
    assertFalse(actualIsCompressTempFilesResult);
    assertEquals(0, actualActiveSheetIndex);
    assertFalse(actualForceFormulaRecalculation);
    assertEquals(0, actualNumberOfNames);
    assertEquals(0, actualNumberOfSheets);
  }
}

