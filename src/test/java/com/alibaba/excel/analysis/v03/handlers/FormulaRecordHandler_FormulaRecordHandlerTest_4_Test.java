package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.FormulaRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormulaRecordHandler_FormulaRecordHandlerTest_4_Test {
  @Test
  public void FormulaRecordHandlerTest() throws Exception {
    // Arrange
    HSSFWorkbook stubWorkbook = new HSSFWorkbook();
    FormatTrackingHSSFListener formatListener = new FormatTrackingHSSFListener(
        new XlsListSheetListener(null, new POIFSFileSystem()));

    // Act
    FormulaRecordHandler formulaRecordHandler = new FormulaRecordHandler(stubWorkbook, formatListener);

    // Assert
    int row = formulaRecordHandler.getRow();
    String toStringResult = formulaRecordHandler.toString();
    int column = formulaRecordHandler.getColumn();
    int order = formulaRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, formulaRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
