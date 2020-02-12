package com.alibaba.excel.converters.floatconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class FloatNumberConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    FloatNumberConverter floatNumberConverter = new FloatNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = floatNumberConverter.convertToExcelData(Float.valueOf(10.0f),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualToStringResult = actualConvertToExcelDataResult.toString();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.NUMBER, actualType);
    assertEquals("10.0", actualToStringResult);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new FloatNumberConverter()).supportExcelTypeKey());
  }
}

