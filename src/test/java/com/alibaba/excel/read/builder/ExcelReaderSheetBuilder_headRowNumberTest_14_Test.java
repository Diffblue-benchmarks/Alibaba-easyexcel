package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_headRowNumberTest_14_Test {
  @Test
  public void headRowNumberTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    Integer headRowNumber = new Integer(1);

    // Act
    ExcelReaderSheetBuilder actual = excelReaderSheetBuilder.headRowNumber(headRowNumber);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
