package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteStringConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ByteStringConverter byteStringConverter = new ByteStringConverter();

    // Act
    CellDataTypeEnum actual = byteStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
