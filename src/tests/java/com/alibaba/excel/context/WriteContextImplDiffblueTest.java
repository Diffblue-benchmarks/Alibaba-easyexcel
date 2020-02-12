package com.alibaba.excel.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.enums.WriteTypeEnum;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.PaneInformation;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WriteContextImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void currentWriteHolderTest() {
    // Arrange, Act and Assert
    assertTrue((new WriteContextImpl(new WriteWorkbook()))
        .currentWriteHolder() instanceof com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder);
  }

  @Test(timeout=10000)
  public void finishTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelGenerateException.class);
    (new WriteContextImpl(new WriteWorkbook())).finish();
  }

  @Test(timeout=10000)
  public void currentSheetTest() throws IOException {
    // Arrange
    WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
    WriteSheet writeSheet = new WriteSheet();

    // Act
    writeContextImpl.currentSheet(writeSheet, WriteTypeEnum.ADD);

    // Assert
    assertEquals(Integer.valueOf(0), writeSheet.getSheetNo());
    Workbook workbook = writeContextImpl.getWorkbook();
    Sheet currentSheet = writeContextImpl.getCurrentSheet();
    short actualNumberOfFonts = workbook.getNumberOfFonts();
    int actualNumberOfSheets = workbook.getNumberOfSheets();
    int actualNumCellStyles = workbook.getNumCellStyles();
    assertTrue(currentSheet instanceof SXSSFSheet);
    boolean actualIsSelectedResult = currentSheet.isSelected();
    short actualLeftCol = currentSheet.getLeftCol();
    Drawing<?> actualDrawingPatriarch = currentSheet.getDrawingPatriarch();
    InputStream worksheetXMLInputStream = ((SXSSFSheet) currentSheet).getWorksheetXMLInputStream();
    PaneInformation actualPaneInformation = currentSheet.getPaneInformation();
    boolean actualIsDisplayFormulasResult = currentSheet.isDisplayFormulas();
    assertEquals(1, actualNumberOfSheets);
    assertNull(currentSheet.getRepeatingRows());
    assertFalse(actualIsDisplayFormulasResult);
    assertNull(actualPaneInformation);
    assertTrue(worksheetXMLInputStream instanceof java.io.FileInputStream);
    assertNull(actualDrawingPatriarch);
    assertEquals((short) 0, actualLeftCol);
    assertTrue(actualIsSelectedResult);
    assertEquals(2, actualNumCellStyles);
    assertEquals((short) 2, actualNumberOfFonts);
  }
}

