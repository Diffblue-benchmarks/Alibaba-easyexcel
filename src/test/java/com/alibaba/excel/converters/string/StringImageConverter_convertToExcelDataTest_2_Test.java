package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringImageConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.io.FileNotFoundException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringImageConverter_convertToExcelDataTest_2_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    StringImageConverter stringImageConverter = new StringImageConverter();
    String value = "Cannot convert images to string";
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(FileNotFoundException.class);
    stringImageConverter.convertToExcelData(value, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
