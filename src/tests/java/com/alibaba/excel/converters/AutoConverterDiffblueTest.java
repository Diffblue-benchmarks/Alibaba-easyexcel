package com.alibaba.excel.converters;

import static org.junit.Assert.assertNull;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Test;

public class AutoConverterDiffblueTest {
  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    AutoConverter autoConverter = new AutoConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    assertNull(autoConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration()));
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertNull((new AutoConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void supportJavaTypeKeyTest() {
    // Arrange, Act and Assert
    assertNull((new AutoConverter()).supportJavaTypeKey());
  }

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    AutoConverter autoConverter = new AutoConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    assertNull(autoConverter.convertToExcelData("value", contentProperty, new GlobalConfiguration()));
  }
}

