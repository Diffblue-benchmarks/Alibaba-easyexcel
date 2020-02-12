package com.alibaba.excel.converters.longconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.text.ParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LongStringConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void convertToJavaDataTest() throws ParseException {
    // Arrange
    LongStringConverter longStringConverter = new LongStringConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    longStringConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new LongStringConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    LongStringConverter longStringConverter = new LongStringConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = longStringConverter.convertToExcelData(Long.valueOf(42L), contentProperty,
        new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("42", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }
}

