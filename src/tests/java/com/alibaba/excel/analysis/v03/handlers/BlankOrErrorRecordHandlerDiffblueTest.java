package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlankOrErrorRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new BlankOrErrorRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BlankOrErrorRecordHandler actualBlankOrErrorRecordHandler = new BlankOrErrorRecordHandler();

    // Assert
    int actualRow = actualBlankOrErrorRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualBlankOrErrorRecordHandler.getColumn());
  }
}

