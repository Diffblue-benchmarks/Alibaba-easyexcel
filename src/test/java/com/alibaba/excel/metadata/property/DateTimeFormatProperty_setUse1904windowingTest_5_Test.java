package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_setUse1904windowingTest_5_Test {
  @Test
  public void setUse1904windowingTest() throws Exception {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("aaaaa", new Boolean(true));
    Boolean use1904windowing = new Boolean(true);

    // Act
    dateTimeFormatProperty.setUse1904windowing(use1904windowing);

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
