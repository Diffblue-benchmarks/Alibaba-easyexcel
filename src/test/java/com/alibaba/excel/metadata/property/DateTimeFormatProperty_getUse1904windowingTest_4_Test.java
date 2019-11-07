package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_getUse1904windowingTest_4_Test {
  @Test
  public void getUse1904windowingTest() throws Exception {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("aaaaa", new Boolean(true));

    // Act
    Boolean actual = dateTimeFormatProperty.getUse1904windowing();

    // Assert
    Assert.assertEquals(Boolean.valueOf(true), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
