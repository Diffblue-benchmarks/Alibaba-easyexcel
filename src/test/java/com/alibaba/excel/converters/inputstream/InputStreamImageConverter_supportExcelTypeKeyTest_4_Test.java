package com.alibaba.excel.converters.inputstream;

import com.alibaba.excel.converters.inputstream.InputStreamImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InputStreamImageConverter_supportExcelTypeKeyTest_4_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    InputStreamImageConverter inputStreamImageConverter = new InputStreamImageConverter();

    // Act
    CellDataTypeEnum actual = inputStreamImageConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
