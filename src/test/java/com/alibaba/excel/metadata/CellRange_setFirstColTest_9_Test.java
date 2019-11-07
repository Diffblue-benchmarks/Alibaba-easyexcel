package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_setFirstColTest_9_Test {
  @Test
  public void setFirstColTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);
    int firstCol = 1;

    // Act
    cellRange.setFirstCol(firstCol);

    // Assert
    int lastCol = cellRange.getLastCol();
    String toStringResult = cellRange.toString();
    int lastRow = cellRange.getLastRow();
    Assert.assertEquals(1, lastCol);
    Assert.assertEquals(1, cellRange.getFirstCol());
    Assert.assertEquals(1, lastRow);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
