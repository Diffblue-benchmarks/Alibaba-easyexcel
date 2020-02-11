package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RkRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RkRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    RkRecordHandler actualRkRecordHandler = new RkRecordHandler();

    // Assert
    int actualRow = actualRkRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualRkRecordHandler.getColumn());
  }
}

