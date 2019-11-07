package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringNumberConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringNumberConverter_convertToExcelDataTest_2_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    StringNumberConverter stringNumberConverter = new StringNumberConverter();
    String value = "aaaaa";
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    stringNumberConverter.convertToExcelData(value, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
