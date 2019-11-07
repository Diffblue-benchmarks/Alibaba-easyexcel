package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BigDecimalStringConverter_BigDecimalStringConverterTest_1_Test {
  @Test
  public void BigDecimalStringConverterTest() throws Exception {
    // Arrange and Act
    BigDecimalStringConverter bigDecimalStringConverter = new BigDecimalStringConverter();

    // Assert
    Assert.assertNotNull(bigDecimalStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
