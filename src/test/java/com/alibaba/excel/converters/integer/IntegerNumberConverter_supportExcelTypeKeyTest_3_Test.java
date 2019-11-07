package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerNumberConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    IntegerNumberConverter integerNumberConverter = new IntegerNumberConverter();

    // Act
    CellDataTypeEnum actual = integerNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
