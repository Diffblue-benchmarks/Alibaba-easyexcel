package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringErrorConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringErrorConverter_convertToJavaDataTest_3_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    StringErrorConverter stringErrorConverter = new StringErrorConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    String actual = stringErrorConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
