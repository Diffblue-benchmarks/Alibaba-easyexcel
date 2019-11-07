package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongNumberConverter_supportExcelTypeKeyTest_1_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    LongNumberConverter longNumberConverter = new LongNumberConverter();

    // Act
    CellDataTypeEnum actual = longNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
