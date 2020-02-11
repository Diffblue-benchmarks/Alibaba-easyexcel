package com.alibaba.excel.converters.string;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class StringBooleanConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.BOOLEAN, (new StringBooleanConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    StringBooleanConverter stringBooleanConverter = new StringBooleanConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = stringBooleanConverter.convertToExcelData("value", contentProperty,
        new GlobalConfiguration());

    // Assert
    Boolean actualBooleanValue = actualConvertToExcelDataResult.getBooleanValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(false), actualBooleanValue);
  }
}

