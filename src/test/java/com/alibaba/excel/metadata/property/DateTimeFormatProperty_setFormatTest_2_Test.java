package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_setFormatTest_2_Test {
  @Test
  public void setFormatTest() throws Exception {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("aaaaa", new Boolean(true));
    String format = "aaaaa";

    // Act
    dateTimeFormatProperty.setFormat(format);

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
