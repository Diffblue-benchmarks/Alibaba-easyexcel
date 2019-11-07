package com.alibaba.excel.converters.shortconverter;

import com.alibaba.excel.converters.shortconverter.ShortNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShortNumberConverter_ShortNumberConverterTest_4_Test {
  @Test
  public void ShortNumberConverterTest() throws Exception {
    // Arrange and Act
    ShortNumberConverter shortNumberConverter = new ShortNumberConverter();

    // Assert
    Assert.assertNotNull(shortNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
