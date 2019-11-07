package com.alibaba.excel.converters.doubleconverter;

import com.alibaba.excel.converters.doubleconverter.DoubleNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleNumberConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    DoubleNumberConverter doubleNumberConverter = new DoubleNumberConverter();

    // Act
    CellDataTypeEnum actual = doubleNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
