package com.alibaba.excel.write.builder;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_registerConverterTest_19_Test {
  @Test
  public void registerConverterTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    AutoConverter converter = new AutoConverter();

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.registerConverter(converter);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
