package com.alibaba.excel.write.builder;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_registerConverterTest_10_Test {
  @Test
  public void registerConverterTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    AutoConverter converter = new AutoConverter();

    // Act
    ExcelWriterSheetBuilder actual = excelWriterSheetBuilder.registerConverter(converter);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
