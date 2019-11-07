package com.alibaba.excel.read.builder;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_registerConverterTest_9_Test {
  @Test
  public void registerConverterTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    AutoConverter converter = new AutoConverter();

    // Act
    ExcelReaderSheetBuilder actual = excelReaderSheetBuilder.registerConverter(converter);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
