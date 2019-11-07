package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_getLastColTest_6_Test {
  @Test
  public void getLastColTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    int actual = cellRange.getLastCol();

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
