package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerBooleanConverter_IntegerBooleanConverterTest_2_Test {
  @Test
  public void IntegerBooleanConverterTest() throws Exception {
    // Arrange and Act
    IntegerBooleanConverter integerBooleanConverter = new IntegerBooleanConverter();

    // Assert
    Assert.assertNotNull(integerBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
