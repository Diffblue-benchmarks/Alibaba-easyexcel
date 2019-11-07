package com.alibaba.excel.converters;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AutoConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    AutoConverter autoConverter = new AutoConverter();

    // Act
    CellDataTypeEnum actual = autoConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
