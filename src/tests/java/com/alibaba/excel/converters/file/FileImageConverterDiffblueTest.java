package com.alibaba.excel.converters.file;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileImageConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.IMAGE, (new FileImageConverter()).supportExcelTypeKey());
  }
  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    FileImageConverter fileImageConverter = new FileImageConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    fileImageConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration());
  }
}

