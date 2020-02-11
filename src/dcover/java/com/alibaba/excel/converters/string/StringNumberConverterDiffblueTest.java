package com.alibaba.excel.converters.string;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringNumberConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new StringNumberConverter()).supportExcelTypeKey());
  }
  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    StringNumberConverter stringNumberConverter = new StringNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    stringNumberConverter.convertToExcelData("value", contentProperty, new GlobalConfiguration());
  }
}

