package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringErrorConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringErrorConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    StringErrorConverter stringErrorConverter = new StringErrorConverter();

    // Act
    CellDataTypeEnum actual = stringErrorConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.ERROR, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
