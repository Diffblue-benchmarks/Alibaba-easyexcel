package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_fileTest_9_Test {
  @Test
  public void fileTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    String pathName = "aaaaa";

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.file(pathName);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
