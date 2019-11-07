package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BigDecimalStringConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BigDecimalStringConverter bigDecimalStringConverter = new BigDecimalStringConverter();

    // Act
    CellDataTypeEnum actual = bigDecimalStringConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
