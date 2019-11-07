package com.alibaba.excel.util;

import com.alibaba.excel.util.PositionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PositionUtils_getColTest_1_Test {
  @Test
  public void getColTest() throws Exception {
    // Arrange
    String currentCellIndex = "aaaaa";

    // Act
    int actual = PositionUtils.getCol(currentCellIndex);

    // Assert
    Assert.assertEquals(15683414, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
