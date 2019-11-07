package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteNumberConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ByteNumberConverter_convertToJavaDataTest_1_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    ByteNumberConverter byteNumberConverter = new ByteNumberConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    byteNumberConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
