package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.NumberRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberRecordHandler_getOrderTest_4_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    NumberRecordHandler numberRecordHandler = new NumberRecordHandler(
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));

    // Act
    int actual = numberRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
