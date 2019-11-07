package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MissingCellDummyRecordHandler_getOrderTest_5_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    MissingCellDummyRecordHandler missingCellDummyRecordHandler = new MissingCellDummyRecordHandler();

    // Act
    int actual = missingCellDummyRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
