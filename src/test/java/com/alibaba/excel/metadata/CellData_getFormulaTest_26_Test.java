package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellData_getFormulaTest_26_Test {
  @Test
  public void getFormulaTest() throws Exception {
    // Arrange
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    Boolean actual = cellData.getFormula();

    // Assert
    Assert.assertEquals(Boolean.valueOf(false), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
