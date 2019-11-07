package com.alibaba.excel.write.builder;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_registerConverterTest_7_Test {
  @Test
  public void registerConverterTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
    AutoConverter converter = new AutoConverter();

    // Act
    ExcelWriterTableBuilder actual = excelWriterTableBuilder.registerConverter(converter);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
