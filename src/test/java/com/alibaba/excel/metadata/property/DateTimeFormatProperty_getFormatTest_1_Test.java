package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_getFormatTest_1_Test {
  @Test
  public void getFormatTest() throws Exception {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("aaaaa", new Boolean(true));

    // Act
    String actual = dateTimeFormatProperty.getFormat();

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
