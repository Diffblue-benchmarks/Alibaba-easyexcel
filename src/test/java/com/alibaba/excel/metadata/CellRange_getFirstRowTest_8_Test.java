package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_getFirstRowTest_8_Test {
  @Test
  public void getFirstRowTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    int actual = cellRange.getFirstRow();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
