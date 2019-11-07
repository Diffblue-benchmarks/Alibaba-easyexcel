package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.SstRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SstRecordHandler_getOrderTest_4_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    SstRecordHandler sstRecordHandler = new SstRecordHandler();

    // Act
    int actual = sstRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
