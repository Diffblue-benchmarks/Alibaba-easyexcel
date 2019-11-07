package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatStringConverter_convertToExcelDataTest_1_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    FloatStringConverter floatStringConverter = new FloatStringConverter();
    Float value = new Float(1.0);
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = floatStringConverter.convertToExcelData(value, contentProperty, globalConfiguration);

    // Assert
    String stringValue = actual.getStringValue();
    Boolean booleanValue = actual.getBooleanValue();
    String dataFormatString = actual.getDataFormatString();
    String toStringResult = actual.toString();
    String formulaValue = actual.getFormulaValue();
    Integer dataFormat = actual.getDataFormat();
    CellDataTypeEnum type = actual.getType();
    BigDecimal numberValue = actual.getNumberValue();
    Boolean formula = actual.getFormula();
    Assert.assertEquals("1.0", stringValue);
    Assert.assertEquals(null, actual.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.STRING, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("1.0", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
