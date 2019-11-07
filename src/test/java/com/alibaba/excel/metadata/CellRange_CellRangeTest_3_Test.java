package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellRange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellRange_CellRangeTest_3_Test {
  @Test
  public void CellRangeTest() throws Exception {
    // Arrange
    int firstRow = 1;
    int lastRow = 1;
    int firstCol = 1;
    int lastCol = 1;

    // Act
    CellRange cellRange = new CellRange(firstRow, lastRow, firstCol, lastCol);

    // Assert
    int firstRow1 = cellRange.getFirstRow();
    int lastCol1 = cellRange.getLastCol();
    String toStringResult = cellRange.toString();
    int lastRow1 = cellRange.getLastRow();
    Assert.assertEquals(1, firstRow1);
    Assert.assertEquals(1, cellRange.getFirstCol());
    Assert.assertEquals(1, lastRow1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, lastCol1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
