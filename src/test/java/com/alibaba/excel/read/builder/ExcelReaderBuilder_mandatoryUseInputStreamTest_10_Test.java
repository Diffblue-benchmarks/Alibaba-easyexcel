package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_mandatoryUseInputStreamTest_10_Test {
  @Test
  public void mandatoryUseInputStreamTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Boolean mandatoryUseInputStream = new Boolean(true);

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.mandatoryUseInputStream(mandatoryUseInputStream);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
