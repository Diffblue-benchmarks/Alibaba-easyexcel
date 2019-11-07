package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanStringConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BooleanStringConverter booleanStringConverter = new BooleanStringConverter();

    // Act
    CellDataTypeEnum actual = booleanStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
