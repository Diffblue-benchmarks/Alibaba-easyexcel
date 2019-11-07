package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerStringConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    IntegerStringConverter integerStringConverter = new IntegerStringConverter();

    // Act
    CellDataTypeEnum actual = integerStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
