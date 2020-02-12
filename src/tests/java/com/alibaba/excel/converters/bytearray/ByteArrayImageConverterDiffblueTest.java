package com.alibaba.excel.converters.bytearray;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ByteArrayImageConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.IMAGE, (new ByteArrayImageConverter()).supportExcelTypeKey());
  }
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    ByteArrayImageConverter byteArrayImageConverter = new ByteArrayImageConverter();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = byteArrayImageConverter.convertToExcelData(byteArray, contentProperty,
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
    ByteArrayImageConverter byteArrayImageConverter = new ByteArrayImageConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    byteArrayImageConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }
}

