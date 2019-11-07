package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_getLastRowTest_2_Test {
  @Test
  public void getLastRowTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    int actual = cellRange.getLastRow();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
