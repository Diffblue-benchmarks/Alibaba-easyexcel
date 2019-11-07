package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_headTest_1_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    Class clazz = (Class) null;

    // Act
    ExcelReaderSheetBuilder actual = excelReaderSheetBuilder.head(clazz);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
