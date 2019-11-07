package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_ignoreEmptyRowTest_8_Test {
  @Test
  public void ignoreEmptyRowTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Boolean ignoreEmptyRow = new Boolean(true);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.ignoreEmptyRow(ignoreEmptyRow);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
