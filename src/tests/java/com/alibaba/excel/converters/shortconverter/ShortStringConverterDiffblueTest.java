package com.alibaba.excel.converters.shortconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.text.ParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ShortStringConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void convertToJavaDataTest() throws ParseException {
    // Arrange
    ShortStringConverter shortStringConverter = new ShortStringConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    shortStringConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new ShortStringConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    ShortStringConverter shortStringConverter = new ShortStringConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = shortStringConverter.convertToExcelData(Short.valueOf((short) 1),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("1", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }
}

