package com.alibaba.excel.converters.shortconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class ShortBooleanConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.BOOLEAN, (new ShortBooleanConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest2() {
    // Arrange
    ShortBooleanConverter shortBooleanConverter = new ShortBooleanConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = shortBooleanConverter.convertToExcelData(Short.valueOf((short) -1),
        contentProperty, new GlobalConfiguration());

    // Assert
    Boolean actualBooleanValue = actualConvertToExcelDataResult.getBooleanValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(false), actualBooleanValue);
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    ShortBooleanConverter shortBooleanConverter = new ShortBooleanConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = shortBooleanConverter.convertToExcelData(Short.valueOf((short) 1),
        contentProperty, new GlobalConfiguration());

    // Assert
    Boolean actualBooleanValue = actualConvertToExcelDataResult.getBooleanValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(true), actualBooleanValue);
  }
}

