package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerBooleanConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IntegerBooleanConverter_convertToJavaDataTest_5_Test {
  @Test
  public void convertToJavaDataTest() throws Exception {
    // Arrange
    IntegerBooleanConverter integerBooleanConverter = new IntegerBooleanConverter();
    CellData cellData = new CellData(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10});
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    integerBooleanConverter.convertToJavaData(cellData, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
