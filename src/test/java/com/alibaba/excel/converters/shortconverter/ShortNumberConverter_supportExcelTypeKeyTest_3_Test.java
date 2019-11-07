package com.alibaba.excel.converters.shortconverter;

import com.alibaba.excel.converters.shortconverter.ShortNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShortNumberConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ShortNumberConverter shortNumberConverter = new ShortNumberConverter();

    // Act
    CellDataTypeEnum actual = shortNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
