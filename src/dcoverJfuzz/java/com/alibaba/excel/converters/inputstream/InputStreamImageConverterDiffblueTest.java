package com.alibaba.excel.converters.inputstream;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InputStreamImageConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.IMAGE, (new InputStreamImageConverter()).supportExcelTypeKey());
  }
  @Test(timeout=10000)
  public void convertToExcelDataTest() throws IOException {
    // Arrange
    InputStreamImageConverter inputStreamImageConverter = new InputStreamImageConverter();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream value = new ByteArrayInputStream(byteArray);
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = inputStreamImageConverter.convertToExcelData(value, contentProperty,
        new GlobalConfiguration());

    // Assert
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    Boolean actualFormula = actualConvertToExcelDataResult.getFormula();
    assertEquals(24, actualConvertToExcelDataResult.getImageValue().length);
    assertEquals(Boolean.valueOf(false), actualFormula);
    assertEquals(CellDataTypeEnum.IMAGE, actualType);
  }
  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    InputStreamImageConverter inputStreamImageConverter = new InputStreamImageConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    inputStreamImageConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }
}

