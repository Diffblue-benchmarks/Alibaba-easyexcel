package com.alibaba.excel.converters.booleanconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class BooleanNumberConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToExcelDataTest2() {
    // Arrange
    BooleanNumberConverter booleanNumberConverter = new BooleanNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = booleanNumberConverter.convertToExcelData(Boolean.valueOf(true),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualToStringResult = actualConvertToExcelDataResult.toString();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.NUMBER, actualType);
    assertEquals("1", actualToStringResult);
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    BooleanNumberConverter booleanNumberConverter = new BooleanNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = booleanNumberConverter.convertToExcelData(Boolean.valueOf(false),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualToStringResult = actualConvertToExcelDataResult.toString();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.NUMBER, actualType);
    assertEquals("0", actualToStringResult);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new BooleanNumberConverter()).supportExcelTypeKey());
  }
}

