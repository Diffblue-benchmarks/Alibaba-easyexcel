package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringImageConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    StringImageConverter stringImageConverter = new StringImageConverter();

    // Act
    CellDataTypeEnum actual = stringImageConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
