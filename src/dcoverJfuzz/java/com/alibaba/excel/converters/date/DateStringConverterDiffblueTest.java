package com.alibaba.excel.converters.date;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.util.Date;
import org.junit.Test;

public class DateStringConverterDiffblueTest {
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new DateStringConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    DateStringConverter dateStringConverter = new DateStringConverter();
    Date value = new Date(1L);
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = dateStringConverter.convertToExcelData(value, contentProperty,
        new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("1970-01-01 00:00:00", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }
}

