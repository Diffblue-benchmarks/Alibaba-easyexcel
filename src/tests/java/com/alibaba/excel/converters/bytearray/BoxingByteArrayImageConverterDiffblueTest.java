package com.alibaba.excel.converters.bytearray;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BoxingByteArrayImageConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    BoxingByteArrayImageConverter boxingByteArrayImageConverter = new BoxingByteArrayImageConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    boxingByteArrayImageConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    BoxingByteArrayImageConverter boxingByteArrayImageConverter = new BoxingByteArrayImageConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    CellData actualConvertToExcelDataResult = boxingByteArrayImageConverter.convertToExcelData(
        new Byte[]{Byte.valueOf((byte) 1), Byte.valueOf((byte) 1), Byte.valueOf((byte) 1)}, contentProperty,
        new GlobalConfiguration());

    // Assert
    CellDataTypeEnum actualType = actualConvertToExcelDataResult.getType();
    Boolean actualFormula = actualConvertToExcelDataResult.getFormula();
    assertEquals(3, actualConvertToExcelDataResult.getImageValue().length);
    assertEquals(Boolean.valueOf(false), actualFormula);
    assertEquals(CellDataTypeEnum.IMAGE, actualType);
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.IMAGE, (new BoxingByteArrayImageConverter()).supportExcelTypeKey());
  }
}

