package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringStringConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringStringConverter_convertToJavaDataTest_2_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    StringStringConverter stringStringConverter = new StringStringConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    String actual = stringStringConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
