package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RkRecordHandler_RkRecordHandlerTest_1_Test {
  @Test
  public void RkRecordHandlerTest() throws Exception {
    // Arrange and Act
    RkRecordHandler rkRecordHandler = new RkRecordHandler();

    // Assert
    String toStringResult = rkRecordHandler.toString();
    int column = rkRecordHandler.getColumn();
    int order = rkRecordHandler.getOrder();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, rkRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
