package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerBooleanConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    IntegerBooleanConverter integerBooleanConverter = new IntegerBooleanConverter();

    // Act
    CellDataTypeEnum actual = integerBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
