package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_setFirstRowTest_5_Test {
  @Test
  public void setFirstRowTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);
    int firstRow = 1;

    // Act
    cellRange.setFirstRow(firstRow);

    // Assert
    int firstRow1 = cellRange.getFirstRow();
    int lastCol = cellRange.getLastCol();
    String toStringResult = cellRange.toString();
    int lastRow = cellRange.getLastRow();
    Assert.assertEquals(1, firstRow1);
    Assert.assertEquals(1, cellRange.getFirstCol());
    Assert.assertEquals(1, lastRow);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, lastCol);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
