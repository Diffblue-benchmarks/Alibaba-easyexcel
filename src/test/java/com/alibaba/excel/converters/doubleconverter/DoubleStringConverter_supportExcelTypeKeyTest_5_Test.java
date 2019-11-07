package com.alibaba.excel.converters.doubleconverter;

import com.alibaba.excel.converters.doubleconverter.DoubleStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleStringConverter_supportExcelTypeKeyTest_5_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    DoubleStringConverter doubleStringConverter = new DoubleStringConverter();

    // Act
    CellDataTypeEnum actual = doubleStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
