package com.alibaba.excel.converters.bigdecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BigDecimalNumberConverterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void convertToExcelDataTest() {
    // Arrange
    BigDecimalNumberConverter bigDecimalNumberConverter = new BigDecimalNumberConverter();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    bigDecimalNumberConverter.convertToExcelData(null, contentProperty, new GlobalConfiguration());
  }

  @Test(timeout=10000)
  public void supportExcelTypeKeyTest() {
    // Arrange, Act and Assert
    assertEquals(CellDataTypeEnum.NUMBER, (new BigDecimalNumberConverter()).supportExcelTypeKey());
  }

  @Test(timeout=10000)
  public void convertToJavaDataTest() {
    // Arrange
    BigDecimalNumberConverter bigDecimalNumberConverter = new BigDecimalNumberConverter();
    CellData cellData = new CellData();
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    assertNull(bigDecimalNumberConverter.convertToJavaData(cellData, contentProperty, new GlobalConfiguration()));
  }
}

