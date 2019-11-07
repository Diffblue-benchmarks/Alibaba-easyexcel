package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanNumberConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BooleanNumberConverter booleanNumberConverter = new BooleanNumberConverter();

    // Act
    CellDataTypeEnum actual = booleanNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
