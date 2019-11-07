package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_getNumberFormatPropertyTest_6_Test {
  @Test
  public void getNumberFormatPropertyTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    NumberFormatProperty actual = excelContentProperty.getNumberFormatProperty();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
