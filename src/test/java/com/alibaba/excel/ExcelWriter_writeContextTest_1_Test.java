package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.context.WriteContextImpl;
import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.model.CalculationChain;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.streaming.SXSSFCreationHelper;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFMap;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;

public class ExcelWriter_writeContextTest_1_Test {
//failed_compile   @Test
//  public void writeContextTest() throws Exception {
//    // Arrange
//    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("aaaaa", null, new ByteArrayOutputStream()));
//
//    // Act
//    WriteContext actual = excelWriter.writeContext();
//
//    // Assert
//    Assert.assertTrue(actual instanceof WriteContextImpl);
//    String toStringResult = ((WriteContextImpl) actual).toString();
//    Workbook workbook = actual.getWorkbook();
//    OutputStream outputStream = actual.getOutputStream();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertTrue(outputStream instanceof ByteArrayOutputStream);
//    Assert.assertTrue(workbook instanceof SXSSFWorkbook);
//    String toStringResult1 = outputStream.toString();
//    int sizeResult = ((ByteArrayOutputStream) outputStream).size();
//    short numberOfFonts = workbook.getNumberOfFonts();
//    Row.MissingCellPolicy missingCellPolicy = workbook.getMissingCellPolicy();
//    String toStringResult2 = ((SXSSFWorkbook) workbook).toString();
//    boolean forceFormulaRecalculation = workbook.getForceFormulaRecalculation();
//    int randomAccessWindowSize = ((SXSSFWorkbook) workbook).getRandomAccessWindowSize();
//    int firstVisibleTab = workbook.getFirstVisibleTab();
//    int numberOfSheets = workbook.getNumberOfSheets();
//    List<PictureData> allPictures = workbook.getAllPictures();
//    int numberOfNames = workbook.getNumberOfNames();
//    XSSFWorkbook xSSFWorkbook = ((SXSSFWorkbook) workbook).getXSSFWorkbook();
//    int activeSheetIndex = workbook.getActiveSheetIndex();
//    CreationHelper creationHelper = workbook.getCreationHelper();
//    boolean isCompressTempFilesResult = ((SXSSFWorkbook) workbook).isCompressTempFiles();
//    int numCellStyles = workbook.getNumCellStyles();
//    Assert.assertEquals(0, sizeResult);
//    Assert.assertEquals(SpreadsheetVersion.EXCEL2007, workbook.getSpreadsheetVersion());
//    Assert.assertEquals(1, numCellStyles);
//    Assert.assertFalse(isCompressTempFilesResult);
//    Assert.assertTrue(creationHelper instanceof SXSSFCreationHelper);
//    Assert.assertEquals(0, activeSheetIndex);
//    String toStringResult3 = ((SXSSFCreationHelper) creationHelper).toString();
//    Row.MissingCellPolicy missingCellPolicy1 = xSSFWorkbook.getMissingCellPolicy();
//    Collection<XSSFMap> customXMLMappings = xSSFWorkbook.getCustomXMLMappings();
//    List<PackagePart> allEmbedds = xSSFWorkbook.getAllEmbedds();
//    boolean forceFormulaRecalculation1 = xSSFWorkbook.getForceFormulaRecalculation();
//    POIXMLDocumentPart parent = xSSFWorkbook.getParent();
//    XSSFWorkbookType workbookType = xSSFWorkbook.getWorkbookType();
//    boolean isDate1904Result = xSSFWorkbook.isDate1904();
//    int numCellStyles1 = xSSFWorkbook.getNumCellStyles();
//    boolean isMacroEnabledResult = xSSFWorkbook.isMacroEnabled();
//    CTWorkbook cTWorkbook = xSSFWorkbook.getCTWorkbook();
//    PackagePart packagePart = xSSFWorkbook.getPackagePart();
//    short numberOfFonts1 = xSSFWorkbook.getNumberOfFonts();
//    CalculationChain calculationChain = xSSFWorkbook.getCalculationChain();
//    String toStringResult4 = xSSFWorkbook.toString();
//    int firstVisibleTab1 = xSSFWorkbook.getFirstVisibleTab();
//    int numberOfSheets1 = xSSFWorkbook.getNumberOfSheets();
//    ThemesTable theme = xSSFWorkbook.getTheme();
//    Assert.assertEquals("", toStringResult1);
//    Assert.assertEquals(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK, missingCellPolicy);
//    Assert.assertEquals(0, firstVisibleTab);
//    Assert.assertEquals(0, numberOfSheets);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertTrue(allPictures instanceof java.util.ArrayList);
//    Assert.assertEquals(0, numberOfNames);
//    Assert.assertEquals((short) 1, numberOfFonts);
//    Assert.assertFalse(forceFormulaRecalculation);
//    Assert.assertEquals(500, randomAccessWindowSize);
//    Assert.assertTrue(cTWorkbook instanceof org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTWorkbookImpl);
//    Assert.assertFalse(isMacroEnabledResult);
//    Assert.assertEquals(1, numCellStyles1);
//    Assert.assertFalse(isDate1904Result);
//    Assert.assertEquals(XSSFWorkbookType.XLSX, workbookType);
//    Assert.assertEquals(null, parent);
//    Assert.assertFalse(forceFormulaRecalculation1);
//    Assert.assertTrue(allEmbedds instanceof java.util.LinkedList);
//    Assert.assertTrue(customXMLMappings instanceof java.util.ArrayList);
//    Assert.assertEquals(null, calculationChain);
//    Assert.assertEquals(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK, missingCellPolicy1);
//    Assert.assertEquals(0, numberOfSheets1);
//    Assert.assertTrue(xSSFWorkbook.getPackage() instanceof org.apache.poi.openxml4j.opc.ZipPackage);
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertEquals((short) 1, numberOfFonts1);
//    Assert.assertEquals(0, firstVisibleTab1);
//    Assert.assertEquals(null, theme);
//    Assert.assertTrue(packagePart instanceof org.apache.poi.openxml4j.opc.internal.MemoryPackagePart);
//    Assert.assertEquals(
//        "Name: /xl/workbook.xml - Content Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml",
//        toStringResult4);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
