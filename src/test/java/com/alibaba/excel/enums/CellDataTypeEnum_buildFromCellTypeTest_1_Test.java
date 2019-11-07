package com.alibaba.excel.enums;

import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CellDataTypeEnum_buildFromCellTypeTest_1_Test {
  @Test
  public void buildFromCellTypeTest() throws Exception {
    // Arrange
    String cellType = "BOOLEAN";

    // Act
    CellDataTypeEnum actual = CellDataTypeEnum.buildFromCellType(cellType);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
