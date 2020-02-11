package com.alibaba.excel.enums;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CellDataTypeEnumDiffblueTest {
  @Test(timeout=10000)
  public void buildFromCellTypeTest() {
    // Arrange, Act and Assert
    assertNull(CellDataTypeEnum.buildFromCellType("foo"));
  }
}

