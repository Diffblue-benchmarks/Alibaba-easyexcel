package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.NumberRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberRecordHandler_initTest_2_Test {
  @Test
  public void initTest() throws Exception {
    // Arrange
    NumberRecordHandler numberRecordHandler = new NumberRecordHandler(
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));

    // Act
    numberRecordHandler.init();

    // Assert
    int row = numberRecordHandler.getRow();
    String toStringResult = numberRecordHandler.toString();
    int column = numberRecordHandler.getColumn();
    int order = numberRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, numberRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
