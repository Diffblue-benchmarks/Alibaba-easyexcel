package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatStringConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    FloatStringConverter floatStringConverter = new FloatStringConverter();

    // Act
    CellDataTypeEnum actual = floatStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
