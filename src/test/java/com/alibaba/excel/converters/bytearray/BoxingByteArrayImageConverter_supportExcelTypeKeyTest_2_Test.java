package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BoxingByteArrayImageConverter_supportExcelTypeKeyTest_2_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    BoxingByteArrayImageConverter boxingByteArrayImageConverter = new BoxingByteArrayImageConverter();

    // Act
    CellDataTypeEnum actual = boxingByteArrayImageConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
