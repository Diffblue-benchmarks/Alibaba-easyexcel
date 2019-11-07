package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_setLastRowTest_7_Test {
  @Test
  public void setLastRowTest() throws Exception {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);
    int lastRow = 1;

    // Act
    cellRange.setLastRow(lastRow);

    // Assert
    int firstRow = cellRange.getFirstRow();
    int lastCol = cellRange.getLastCol();
    String toStringResult = cellRange.toString();
    int lastRow1 = cellRange.getLastRow();
    Assert.assertEquals(1, firstRow);
    Assert.assertEquals(1, cellRange.getFirstCol());
    Assert.assertEquals(1, lastRow1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, lastCol);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
