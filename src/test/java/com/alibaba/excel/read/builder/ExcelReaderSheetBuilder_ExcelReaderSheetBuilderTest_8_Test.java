package com.alibaba.excel.read.builder;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_ExcelReaderSheetBuilderTest_8_Test {
  @Test
  public void ExcelReaderSheetBuilderTest() throws Exception {
    // Arrange
    ExcelReader excelReader = (ExcelReader) null;

    // Act
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder(excelReader);

    // Assert
    Assert.assertNotNull(excelReaderSheetBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
