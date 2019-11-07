package com.alibaba.excel.converters.date;

import com.alibaba.excel.converters.date.DateStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateStringConverter_DateStringConverterTest_5_Test {
  @Test
  public void DateStringConverterTest() throws Exception {
    // Arrange and Act
    DateStringConverter dateStringConverter = new DateStringConverter();

    // Assert
    Assert.assertNotNull(dateStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
