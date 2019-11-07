package com.alibaba.excel.util;

import com.alibaba.excel.util.WorkBookUtil;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PaneInformation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WorkBookUtil_createSheetTest_5_Test {
//failed_compile   @Test
//  public void createSheetTest() throws Exception {
//    // Arrange
//    HSSFWorkbook workbook = new HSSFWorkbook();
//    String sheetName = "aaaaa";
//
//    // Act
//    Sheet actual = WorkBookUtil.createSheet(workbook, sheetName);
//
//    // Assert
//    Assert.assertTrue(actual instanceof HSSFSheet);
//    Map<CellAddress, HSSFComment> cellComments = actual.getCellComments();
//    boolean isSelectedResult = actual.isSelected();
//    short topRow = actual.getTopRow();
//    boolean alternateExpression = ((HSSFSheet) actual).getAlternateExpression();
//    short leftCol = actual.getLeftCol();
//    CellRangeAddress repeatingColumns = actual.getRepeatingColumns();
//    boolean isGridsPrintedResult = ((HSSFSheet) actual).isGridsPrinted();
//    PaneInformation paneInformation = actual.getPaneInformation();
//    boolean isDisplayFormulasResult = actual.isDisplayFormulas();
//    CellRangeAddress repeatingRows = actual.getRepeatingRows();
//    boolean isDisplayRowColHeadingsResult = actual.isDisplayRowColHeadings();
//    EscherAggregate drawingEscherAggregate = ((HSSFSheet) actual).getDrawingEscherAggregate();
//    boolean protect = actual.getProtect();
//    boolean isDisplayZerosResult = actual.isDisplayZeros();
//    String toStringResult = ((HSSFSheet) actual).toString();
//    boolean horizontallyCenter = actual.getHorizontallyCenter();
//    boolean displayGuts = actual.getDisplayGuts();
//    DataValidationHelper dataValidationHelper = actual.getDataValidationHelper();
//    boolean scenarioProtect = actual.getScenarioProtect();
//    List<HSSFHyperlink> hyperlinkList = actual.getHyperlinkList();
//    boolean alternateFormula = ((HSSFSheet) actual).getAlternateFormula();
//    float defaultRowHeightInPoints = actual.getDefaultRowHeightInPoints();
//    boolean isDisplayGridlinesResult = actual.isDisplayGridlines();
//    int[] rowBreaks = actual.getRowBreaks();
//    boolean autobreaks = actual.getAutobreaks();
//    boolean isPrintGridlinesResult = actual.isPrintGridlines();
//    boolean rowSumsBelow = actual.getRowSumsBelow();
//    boolean forceFormulaRecalculation = actual.getForceFormulaRecalculation();
//    String sheetName1 = actual.getSheetName();
//    boolean verticallyCenter = actual.getVerticallyCenter();
//    boolean dialog = ((HSSFSheet) actual).getDialog();
//    List<CellRangeAddress> mergedRegions = actual.getMergedRegions();
//    int defaultColumnWidth = actual.getDefaultColumnWidth();
//    boolean isRightToLeftResult = actual.isRightToLeft();
//    boolean isActiveResult = ((HSSFSheet) actual).isActive();
//    short password = ((HSSFSheet) actual).getPassword();
//    boolean isPrintRowAndColumnHeadingsResult = actual.isPrintRowAndColumnHeadings();
//    int firstRowNum = actual.getFirstRowNum();
//    boolean fitToPage = actual.getFitToPage();
//    boolean rowSumsRight = actual.getRowSumsRight();
//    Assert.assertTrue(cellComments instanceof java.util.TreeMap);
//    Assert.assertFalse(((HSSFSheet) actual).getObjectProtect());
//    Assert.assertFalse(rowSumsRight);
//    Assert.assertTrue(fitToPage);
//    Assert.assertEquals(0, firstRowNum);
//    Assert.assertFalse(isPrintRowAndColumnHeadingsResult);
//    Assert.assertEquals((short) 0, password);
//    Assert.assertTrue(isActiveResult);
//    Assert.assertFalse(isRightToLeftResult);
//    Assert.assertEquals(8, defaultColumnWidth);
//    Assert.assertTrue(mergedRegions instanceof java.util.ArrayList);
//    Assert.assertFalse(dialog);
//    Assert.assertFalse(verticallyCenter);
//    Assert.assertEquals("aaaaa", sheetName1);
//    Assert.assertFalse(forceFormulaRecalculation);
//    Assert.assertFalse(rowSumsBelow);
//    Assert.assertFalse(isPrintGridlinesResult);
//    Assert.assertFalse(autobreaks);
//    Assert.assertEquals(0, rowBreaks.length);
//    Assert.assertArrayEquals(new int[]{}, rowBreaks);
//    Assert.assertTrue(isDisplayGridlinesResult);
//    Assert.assertEquals(12.75f, defaultRowHeightInPoints);
//    Assert.assertTrue(alternateFormula);
//    Assert.assertTrue(hyperlinkList instanceof java.util.ArrayList);
//    Assert.assertFalse(scenarioProtect);
//    Assert.assertTrue(dataValidationHelper instanceof org.apache.poi.hssf.usermodel.HSSFDataValidationHelper);
//    Assert.assertFalse(displayGuts);
//    Assert.assertFalse(horizontallyCenter);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertTrue(isDisplayZerosResult);
//    Assert.assertFalse(protect);
//    Assert.assertEquals(null, drawingEscherAggregate);
//    Assert.assertTrue(isDisplayRowColHeadingsResult);
//    Assert.assertEquals(null, repeatingRows);
//    Assert.assertFalse(isDisplayFormulasResult);
//    Assert.assertEquals(null, paneInformation);
//    Assert.assertFalse(isGridsPrintedResult);
//    Assert.assertEquals(null, repeatingColumns);
//    Assert.assertEquals((short) 0, leftCol);
//    Assert.assertTrue(alternateExpression);
//    Assert.assertEquals((short) 0, topRow);
//    Assert.assertTrue(isSelectedResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
