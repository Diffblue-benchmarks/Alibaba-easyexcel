package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongStringConverter_LongStringConverterTest_3_Test {
  @Test
  public void LongStringConverterTest() throws Exception {
    // Arrange and Act
    LongStringConverter longStringConverter = new LongStringConverter();

    // Assert
    Assert.assertNotNull(longStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
