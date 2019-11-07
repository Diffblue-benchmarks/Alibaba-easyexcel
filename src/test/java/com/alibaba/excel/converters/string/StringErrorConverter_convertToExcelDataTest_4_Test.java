package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringErrorConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringErrorConverter_convertToExcelDataTest_4_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    StringErrorConverter stringErrorConverter = new StringErrorConverter();
    String value = "aaaaa";
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = stringErrorConverter.convertToExcelData(value, contentProperty, globalConfiguration);

    // Assert
    Boolean booleanValue = actual.getBooleanValue();
    String dataFormatString = actual.getDataFormatString();
    String toStringResult = actual.toString();
    String formulaValue = actual.getFormulaValue();
    Integer dataFormat = actual.getDataFormat();
    CellDataTypeEnum type = actual.getType();
    BigDecimal numberValue = actual.getNumberValue();
    Boolean formula = actual.getFormula();
    Assert.assertEquals(null, booleanValue);
    Assert.assertEquals(null, actual.getImageValue());
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.ERROR, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals(null, dataFormatString);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
