package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringNumberConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    StringNumberConverter stringNumberConverter = new StringNumberConverter();

    // Act
    CellDataTypeEnum actual = stringNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
