package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelContentProperty_setDateTimeFormatPropertyTest_8_Test {
  @Test
  public void setDateTimeFormatPropertyTest() throws Exception {
    // Arrange
    ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("aaaaa", new Boolean(true));

    // Act
    excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);

    // Assert
    String toStringResult = dateTimeFormatProperty.toString();
    String format = dateTimeFormatProperty.getFormat();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Boolean.valueOf(true), dateTimeFormatProperty.getUse1904windowing());
    Assert.assertEquals("aaaaa", format);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
