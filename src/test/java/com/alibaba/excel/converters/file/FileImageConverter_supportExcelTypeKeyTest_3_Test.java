package com.alibaba.excel.converters.file;

import com.alibaba.excel.converters.file.FileImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileImageConverter_supportExcelTypeKeyTest_3_Test {
  @Test
  public void supportExcelTypeKeyTest() throws Exception {
    // Arrange
    FileImageConverter fileImageConverter = new FileImageConverter();

    // Act
    CellDataTypeEnum actual = fileImageConverter.supportExcelTypeKey();

    // Assert
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
