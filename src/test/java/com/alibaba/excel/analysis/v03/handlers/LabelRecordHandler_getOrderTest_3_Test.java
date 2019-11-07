package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.LabelRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LabelRecordHandler_getOrderTest_3_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    LabelRecordHandler labelRecordHandler = new LabelRecordHandler();

    // Act
    int actual = labelRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
