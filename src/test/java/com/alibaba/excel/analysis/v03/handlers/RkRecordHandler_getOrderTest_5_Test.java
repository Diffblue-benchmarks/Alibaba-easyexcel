package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RkRecordHandler_getOrderTest_5_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    RkRecordHandler rkRecordHandler = new RkRecordHandler();

    // Act
    int actual = rkRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
