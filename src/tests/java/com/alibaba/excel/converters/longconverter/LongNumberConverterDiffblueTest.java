package com.alibaba.excel.converters.longconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class LongNumberConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new LongNumberConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    LongNumberConverter longNumberConverter = new LongNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = longNumberConverter.convertToExcelData(Long.valueOf(42L), contentProperty,
        new GlobalConfiguration());

    // Assert
    String actualToStringResult = actualConvertToExcelDataResult.toString();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.NUMBER, actualType);
    assertEquals("42", actualToStringResult);
  }
}

