package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatBooleanConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatBooleanConverter_convertToExcelDataTest_5_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    FloatBooleanConverter floatBooleanConverter = new FloatBooleanConverter();
    Float value = new Float(1.0);
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = floatBooleanConverter.convertToExcelData(value, contentProperty, globalConfiguration);

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
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(null, actual.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("true", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(Boolean.valueOf(true), booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
