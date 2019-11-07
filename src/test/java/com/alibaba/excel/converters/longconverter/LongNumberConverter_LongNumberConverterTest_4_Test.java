package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongNumberConverter_LongNumberConverterTest_4_Test {
  @Test
  public void LongNumberConverterTest() throws Exception {
    // Arrange and Act
    LongNumberConverter longNumberConverter = new LongNumberConverter();

    // Assert
    Assert.assertNotNull(longNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
