package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_sheetNameTest_2_Test {
  @Test
  public void sheetNameTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    String sheetName = "Must use 'EasyExcelFactory.read().sheet()' to call this method";

    // Act
    ExcelReaderSheetBuilder actual = excelReaderSheetBuilder.sheetName(sheetName);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
