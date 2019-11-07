package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteArrayImageConverter_convertToExcelDataTest_4_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    ByteArrayImageConverter byteArrayImageConverter = new ByteArrayImageConverter();
    byte[] value = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = byteArrayImageConverter.convertToExcelData(value, contentProperty, globalConfiguration);

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
    byte[] imageValue = actual.getImageValue();
    Assert.assertEquals(null, stringValue);
    Assert.assertEquals(24, imageValue.length);
    Assert.assertEquals((byte) 0, imageValue[0]);
    Assert.assertEquals((byte) 0, imageValue[1]);
    Assert.assertEquals((byte) 0, imageValue[2]);
    Assert.assertEquals((byte) 0, imageValue[21]);
    Assert.assertEquals((byte) 0, imageValue[22]);
    Assert.assertEquals((byte) 0, imageValue[23]);
    Assert.assertEquals(Boolean.valueOf(false), formula);
    Assert.assertEquals(null, numberValue);
    Assert.assertEquals(CellDataTypeEnum.IMAGE, type);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, formulaValue);
    Assert.assertEquals("empty", toStringResult);
    Assert.assertEquals(null, dataFormatString);
    Assert.assertEquals(null, booleanValue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
