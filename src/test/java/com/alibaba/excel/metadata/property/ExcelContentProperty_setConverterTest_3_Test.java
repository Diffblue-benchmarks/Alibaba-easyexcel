package com.alibaba.excel.metadata.property;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_setConverterTest_3_Test {
  @Test
  public void setConverterTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    AutoConverter autoConverter = new AutoConverter();

    // Act
    excelContentProperty.setConverter(autoConverter);

    // Assert
    Assert.assertNotNull(autoConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
