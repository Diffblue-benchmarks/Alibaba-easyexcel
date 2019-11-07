package com.alibaba.excel.converters;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AutoConverter_convertToExcelDataTest_1_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    AutoConverter autoConverter = new AutoConverter();
    String value = "aaaaa";
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = autoConverter.convertToExcelData(value, contentProperty, globalConfiguration);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
