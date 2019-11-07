package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteArrayImageConverter_supportExcelTypeKeyTest_5_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    ByteArrayImageConverter byteArrayImageConverter = new ByteArrayImageConverter();

    // Act
    CellDataTypeEnum actual = byteArrayImageConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
