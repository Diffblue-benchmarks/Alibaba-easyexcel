package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.FormulaRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormulaRecordHandler_getOrderTest_1_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    FormulaRecordHandler formulaRecordHandler = new FormulaRecordHandler(hSSFWorkbook,
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));

    // Act
    int actual = formulaRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
