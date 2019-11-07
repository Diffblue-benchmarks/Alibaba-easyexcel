package com.alibaba.excel.converters.doubleconverter;

import com.alibaba.excel.converters.doubleconverter.DoubleNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleNumberConverter_DoubleNumberConverterTest_5_Test {
  @Test
  public void DoubleNumberConverterTest() throws Exception {
    // Arrange and Act
    DoubleNumberConverter doubleNumberConverter = new DoubleNumberConverter();

    // Assert
    Assert.assertNotNull(doubleNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
