package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NoteRecordHandler_getOrderTest_1_Test {
  @Test
  public void getOrderTest() throws Exception {
    // Arrange
    NoteRecordHandler noteRecordHandler = new NoteRecordHandler();

    // Act
    int actual = noteRecordHandler.getOrder();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
