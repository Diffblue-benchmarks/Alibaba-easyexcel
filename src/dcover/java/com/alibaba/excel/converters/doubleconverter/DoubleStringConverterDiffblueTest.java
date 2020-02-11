package com.alibaba.excel.converters.doubleconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class DoubleStringConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    DoubleStringConverter doubleStringConverter = new DoubleStringConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = doubleStringConverter.convertToExcelData(Double.valueOf(10.0),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("10.0", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new DoubleStringConverter()).supportExcelTypeKey());
  }
}

