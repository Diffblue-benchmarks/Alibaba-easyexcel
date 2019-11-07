package com.alibaba.excel.converters.shortconverter;

import com.alibaba.excel.converters.shortconverter.ShortStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShortStringConverter_supportExcelTypeKeyTest_5_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ShortStringConverter shortStringConverter = new ShortStringConverter();

    // Act
    CellDataTypeEnum actual = shortStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
