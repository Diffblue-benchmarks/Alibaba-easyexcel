package com.alibaba.excel.converters.byteconverter;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.text.ParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ByteStringConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void convertToJavaDataTest() throws ParseException {
    // Arrange
    ByteStringConverter byteStringConverter = new ByteStringConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    byteStringConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.STRING, (new ByteStringConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    ByteStringConverter byteStringConverter = new ByteStringConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = byteStringConverter.convertToExcelData(Byte.valueOf((byte) 1),
        contentProperty, new GlobalConfiguration());

    // Assert
    String actualStringValue = actualConvertToExcelDataResult.getStringValue();
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    assertEquals("1", actualStringValue);
    assertEquals(Boolean.valueOf(false), actualConvertToExcelDataResult.getFormula());
    assertEquals(CellDataTypeEnum.STRING, actualType);
  }
}

