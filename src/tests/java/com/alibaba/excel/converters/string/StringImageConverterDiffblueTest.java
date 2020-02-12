package com.alibaba.excel.converters.string;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringImageConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.IMAGE, (new StringImageConverter()).supportExcelTypeKey());
  }
  @Test(timeout=10000)
  public void convertToExcelDataTest() throws IOException {
    // Arrange
    StringImageConverter stringImageConverter = new StringImageConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(FileNotFoundException.class);
    stringImageConverter.convertToExcelData("value", contentProperty, new GlobalConfiguration());
  }
  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    StringImageConverter stringImageConverter = new StringImageConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    stringImageConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }
}

