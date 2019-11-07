package com.alibaba.excel.converters.shortconverter;

import com.alibaba.excel.converters.shortconverter.ShortBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShortBooleanConverter_ShortBooleanConverterTest_5_Test {
  @Test
  public void ShortBooleanConverterTest() throws Exception {
    // Arrange and Act
    ShortBooleanConverter shortBooleanConverter = new ShortBooleanConverter();

    // Assert
    Assert.assertNotNull(shortBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
