package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatStringConverter_FloatStringConverterTest_3_Test {
  @Test
  public void FloatStringConverterTest() throws Exception {
    // Arrange and Act
    FloatStringConverter floatStringConverter = new FloatStringConverter();

    // Assert
    Assert.assertNotNull(floatStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
