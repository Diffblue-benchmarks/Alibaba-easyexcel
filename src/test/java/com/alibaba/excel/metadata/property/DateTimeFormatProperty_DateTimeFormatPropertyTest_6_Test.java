package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_DateTimeFormatPropertyTest_6_Test {
  @Test
  public void DateTimeFormatPropertyTest() throws Exception {
    // Arrange
    String format = "aaaaa";
    Boolean use1904windowing = new Boolean(true);

    // Act
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty(format, use1904windowing);

    // Assert
    String toStringResult = dateTimeFormatProperty.toString();
    String format1 = dateTimeFormatProperty.getFormat();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Boolean.valueOf(true), dateTimeFormatProperty.getUse1904windowing());
    Assert.assertEquals("aaaaa", format1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
