package com.alibaba.excel.read.builder;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_registerConverterTest_5_Test {
  @Test
  public void registerConverterTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    AutoConverter converter = new AutoConverter();

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.registerConverter(converter);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
