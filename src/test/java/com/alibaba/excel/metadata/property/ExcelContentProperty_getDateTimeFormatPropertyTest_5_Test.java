package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_getDateTimeFormatPropertyTest_5_Test {
  @Test
  public void getDateTimeFormatPropertyTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();

    // Act
    DateTimeFormatProperty actual = excelContentProperty.getDateTimeFormatProperty();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
