package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BlankOrErrorRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BlankOrErrorRecordHandler_getOrderTest_2_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    BlankOrErrorRecordHandler blankOrErrorRecordHandler = new BlankOrErrorRecordHandler();

    // Act
    int actual = blankOrErrorRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
