package com.alibaba.excel.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CellDataTypeEnumDiffblueTest {
  @Test(timeout=10000)
  public void buildFromCellTypeTest() {
    // Arrange
    CellDataTypeEnum actualBuildFromCellTypeResult = CellDataTypeEnum.buildFromCellType("foo");

    // Act and Assert
    assertNull(actualBuildFromCellTypeResult);
    assertEquals(CellDataTypeEnum.EMPTY, CellDataTypeEnum.buildFromCellType(""));
  }
}

