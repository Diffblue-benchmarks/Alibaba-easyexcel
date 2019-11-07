package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_autoCloseStreamTest_20_Test {
  @Test
  public void autoCloseStreamTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Boolean autoCloseStream = new Boolean(true);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.autoCloseStream(autoCloseStream);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
