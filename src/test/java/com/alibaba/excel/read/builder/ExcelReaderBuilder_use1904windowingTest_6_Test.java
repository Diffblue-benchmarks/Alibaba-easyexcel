package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_use1904windowingTest_6_Test {
  @Test
  public void use1904windowingTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Boolean use1904windowing = new Boolean(true);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.use1904windowing(use1904windowing);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
