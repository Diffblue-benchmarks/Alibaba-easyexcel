package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteBooleanConverter_supportExcelTypeKeyTest_5_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ByteBooleanConverter byteBooleanConverter = new ByteBooleanConverter();

    // Act
    CellDataTypeEnum actual = byteBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
