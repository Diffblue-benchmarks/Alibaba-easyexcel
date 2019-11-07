package com.alibaba.excel.converters.floatconverter;

import com.alibaba.excel.converters.floatconverter.FloatNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloatNumberConverter_FloatNumberConverterTest_5_Test {
  @Test
  public void FloatNumberConverterTest() throws Exception {
    // Arrange and Act
    FloatNumberConverter floatNumberConverter = new FloatNumberConverter();

    // Assert
    Assert.assertNotNull(floatNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
