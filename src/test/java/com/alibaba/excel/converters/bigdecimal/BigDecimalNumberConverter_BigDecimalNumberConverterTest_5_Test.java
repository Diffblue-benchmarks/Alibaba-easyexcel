package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BigDecimalNumberConverter_BigDecimalNumberConverterTest_5_Test {
  @Test
  public void BigDecimalNumberConverterTest() throws Exception {
    // Arrange and Act
    BigDecimalNumberConverter bigDecimalNumberConverter = new BigDecimalNumberConverter();

    // Assert
    Assert.assertNotNull(bigDecimalNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
