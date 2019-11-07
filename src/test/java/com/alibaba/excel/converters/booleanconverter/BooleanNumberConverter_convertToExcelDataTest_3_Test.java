package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanNumberConverter_convertToExcelDataTest_3_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    BooleanNumberConverter booleanNumberConverter = new BooleanNumberConverter();
    Boolean value = new Boolean(true);
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = booleanNumberConverter.convertToExcelData(value, contentProperty, globalConfiguration);

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
    int scaleResult = numberValue.scale();
    String toStringResult1 = numberValue.toString();
    Assert.assertEquals(CellDataTypeEnum.NUMBER, type);
    Assert.assertEquals(null, booleanValue);
    Assert.assertEquals("1", toStringResult);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals("1", toStringResult1);
    Assert.assertEquals(1, numberValue.signum());
    Assert.assertEquals(0, scaleResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
