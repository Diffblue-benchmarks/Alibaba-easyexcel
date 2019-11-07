package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_setLastColTest_4_Test {
  @Test
  public void setLastColTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);
    int lastCol = 1;

    // Act
    cellRange.setLastCol(lastCol);

    // Assert
    int firstRow = cellRange.getFirstRow();
    int lastCol1 = cellRange.getLastCol();
    String toStringResult = cellRange.toString();
    int lastRow = cellRange.getLastRow();
    Assert.assertEquals(1, firstRow);
    Assert.assertEquals(1, cellRange.getFirstCol());
    Assert.assertEquals(1, lastRow);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, lastCol1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
