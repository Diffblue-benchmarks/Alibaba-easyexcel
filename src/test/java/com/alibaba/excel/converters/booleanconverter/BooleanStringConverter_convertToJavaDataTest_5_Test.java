package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanStringConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanStringConverter_convertToJavaDataTest_5_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    BooleanStringConverter booleanStringConverter = new BooleanStringConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    Boolean actual = booleanStringConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);

    // Assert
    Assert.assertEquals(Boolean.valueOf(false), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
