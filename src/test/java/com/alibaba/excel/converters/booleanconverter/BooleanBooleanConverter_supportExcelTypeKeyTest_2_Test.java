package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanBooleanConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BooleanBooleanConverter booleanBooleanConverter = new BooleanBooleanConverter();

    // Act
    CellDataTypeEnum actual = booleanBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
