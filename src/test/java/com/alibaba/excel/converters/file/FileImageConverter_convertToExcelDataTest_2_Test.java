package com.alibaba.excel.converters.file;

import com.alibaba.excel.converters.file.FileImageConverter;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FileImageConverter_convertToExcelDataTest_2_Test {
  @Test
  public void convertToExcelDataTest() throws Exception {
    // Arrange
    FileImageConverter fileImageConverter = new FileImageConverter();
    File value = new File("Cannot convert images to file");
    ExcelContentProperty contentProperty = new ExcelContentProperty();
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    thrown.expect(FileNotFoundException.class);
    fileImageConverter.convertToExcelData(value, contentProperty, globalConfiguration);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
