package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringBooleanConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    StringBooleanConverter stringBooleanConverter = new StringBooleanConverter();

    // Act
    CellDataTypeEnum actual = stringBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
