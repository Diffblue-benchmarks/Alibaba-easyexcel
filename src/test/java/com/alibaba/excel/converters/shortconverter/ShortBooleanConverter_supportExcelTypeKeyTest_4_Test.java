package com.alibaba.excel.converters.shortconverter;

import com.alibaba.excel.converters.shortconverter.ShortBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShortBooleanConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ShortBooleanConverter shortBooleanConverter = new ShortBooleanConverter();

    // Act
    CellDataTypeEnum actual = shortBooleanConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
