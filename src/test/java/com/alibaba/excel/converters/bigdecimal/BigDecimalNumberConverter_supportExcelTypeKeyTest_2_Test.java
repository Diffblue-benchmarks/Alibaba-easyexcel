package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BigDecimalNumberConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BigDecimalNumberConverter bigDecimalNumberConverter = new BigDecimalNumberConverter();

    // Act
    CellDataTypeEnum actual = bigDecimalNumberConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
