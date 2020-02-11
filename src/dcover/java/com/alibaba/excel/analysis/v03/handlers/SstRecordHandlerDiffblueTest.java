package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SstRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SstRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SstRecordHandler actualSstRecordHandler = new SstRecordHandler();

    // Assert
    int actualRow = actualSstRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualSstRecordHandler.getColumn());
  }
}

