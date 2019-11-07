package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BoxingByteArrayImageConverter_convertToExcelDataTest_3_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    BoxingByteArrayImageConverter boxingByteArrayImageConverter = new BoxingByteArrayImageConverter();
    Byte resultByte = new Byte((byte) 0);
    Byte resultByte1 = new Byte((byte) 0);
    Byte[] value = new Byte[]{resultByte, resultByte1, new Byte((byte) 0)};
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    CellData actual = boxingByteArrayImageConverter.convertToExcelData(value, contentProperty, globalConfiguration);

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
    Assert.assertEquals(3, imageValue.length);
    Assert.assertArrayEquals(new byte[]{0, 0, 0}, imageValue);
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
