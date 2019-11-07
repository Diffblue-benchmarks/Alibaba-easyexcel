package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerStringConverter_IntegerStringConverterTest_1_Test {
  @Test
  public void IntegerStringConverterTest() throws Exception {
    // Arrange and Act
    IntegerStringConverter integerStringConverter = new IntegerStringConverter();

    // Assert
    Assert.assertNotNull(integerStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
