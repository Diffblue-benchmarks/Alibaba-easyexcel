package com.alibaba.excel.converters.longconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class LongBooleanConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.BOOLEAN, (new LongBooleanConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    LongBooleanConverter longBooleanConverter = new LongBooleanConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = longBooleanConverter.convertToExcelData(Long.valueOf(42L),
        contentProperty, new GlobalConfiguration());

    // Assert
    Boolean actualBooleanValue = actualConvertToExcelDataResult.getBooleanValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.BOOLEAN, actualType);
    assertEquals(Boolean.valueOf(false), actualBooleanValue);
  }
}

