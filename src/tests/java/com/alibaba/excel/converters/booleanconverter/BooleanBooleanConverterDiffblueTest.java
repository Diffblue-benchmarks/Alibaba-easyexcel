package com.alibaba.excel.converters.booleanconverter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class BooleanBooleanConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    BooleanBooleanConverter booleanBooleanConverter = new BooleanBooleanConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = booleanBooleanConverter.convertToExcelData(Boolean.valueOf(true),
        contentProperty, new GlobalConfiguration());

    // Assert
    Boolean actualBooleanValue = actualConvertToExcelDataResult.getBooleanValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(true), actualBooleanValue);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.BOOLEAN, (new BooleanBooleanConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    BooleanBooleanConverter booleanBooleanConverter = new BooleanBooleanConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    assertNull(booleanBooleanConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration()));
  }
}

