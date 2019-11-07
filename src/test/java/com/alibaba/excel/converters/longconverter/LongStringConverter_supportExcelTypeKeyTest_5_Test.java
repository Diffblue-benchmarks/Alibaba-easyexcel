package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongStringConverter_supportExcelTypeKeyTest_5_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    LongStringConverter longStringConverter = new LongStringConverter();

    // Act
    CellDataTypeEnum actual = longStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
