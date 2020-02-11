package com.alibaba.excel.converters.booleanconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class BooleanStringConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    BooleanStringConverter booleanStringConverter = new BooleanStringConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = booleanStringConverter.convertToExcelData(Boolean.valueOf(true),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("true", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new BooleanStringConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    BooleanStringConverter booleanStringConverter = new BooleanStringConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    assertEquals(Boolean.valueOf(false),
        booleanStringConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration()));
  }
}

