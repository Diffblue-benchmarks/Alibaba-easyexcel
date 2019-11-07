package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringStringConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    StringStringConverter stringStringConverter = new StringStringConverter();

    // Act
    CellDataTypeEnum actual = stringStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
