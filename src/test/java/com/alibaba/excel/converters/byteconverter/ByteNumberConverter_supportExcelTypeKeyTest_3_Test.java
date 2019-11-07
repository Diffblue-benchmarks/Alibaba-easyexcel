package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteNumberConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ByteNumberConverter byteNumberConverter = new ByteNumberConverter();

    // Act
    CellDataTypeEnum actual = byteNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
