package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MissingCellDummyRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new MissingCellDummyRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    MissingCellDummyRecordHandler actualMissingCellDummyRecordHandler = new MissingCellDummyRecordHandler();

    // Assert
    int actualRow = actualMissingCellDummyRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualMissingCellDummyRecordHandler.getColumn());
  }
}

