package com.alibaba.excel.converters.shortconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class ShortNumberConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new ShortNumberConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    ShortNumberConverter shortNumberConverter = new ShortNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = shortNumberConverter.convertToExcelData(Short.valueOf((short) 1),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualToStringResult = actualConvertToExcelDataResult.toString();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.NUMBER, actualType);
    assertEquals("1", actualToStringResult);
  }
}

