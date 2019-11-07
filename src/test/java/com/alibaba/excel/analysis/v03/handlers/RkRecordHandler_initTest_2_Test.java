package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RkRecordHandler_initTest_2_Test {
  @Test
  public void initTest() throws Exception {
    // Arrange
    RkRecordHandler rkRecordHandler = new RkRecordHandler();

    // Act
    rkRecordHandler.init();

    // Assert
    int row = rkRecordHandler.getRow();
    String toStringResult = rkRecordHandler.toString();
    int column = rkRecordHandler.getColumn();
    int order = rkRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, rkRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
