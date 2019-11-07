package com.alibaba.excel.metadata.property;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_getConverterTest_4_Test {
  @Test
  public void getConverterTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    Converter actual = excelContentProperty.getConverter();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
