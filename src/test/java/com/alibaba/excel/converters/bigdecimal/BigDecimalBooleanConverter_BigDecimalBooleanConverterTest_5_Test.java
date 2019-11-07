package com.alibaba.excel.converters.bigdecimal;

import com.alibaba.excel.converters.bigdecimal.BigDecimalBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BigDecimalBooleanConverter_BigDecimalBooleanConverterTest_5_Test {
  @Test
  public void BigDecimalBooleanConverterTest() throws Exception {
    // Arrange and Act
    BigDecimalBooleanConverter bigDecimalBooleanConverter = new BigDecimalBooleanConverter();

    // Assert
    Assert.assertNotNull(bigDecimalBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
