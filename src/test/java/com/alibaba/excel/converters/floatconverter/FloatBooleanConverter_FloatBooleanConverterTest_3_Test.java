package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatBooleanConverter_FloatBooleanConverterTest_3_Test {
  @Test
  public void FloatBooleanConverterTest() throws Exception {
    // Arrange and Act
    FloatBooleanConverter floatBooleanConverter = new FloatBooleanConverter();

    // Assert
    Assert.assertNotNull(floatBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
