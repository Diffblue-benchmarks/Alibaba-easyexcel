package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerNumberConverter_IntegerNumberConverterTest_2_Test {
  @Test
  public void IntegerNumberConverterTest() throws Exception {
    // Arrange and Act
    IntegerNumberConverter integerNumberConverter = new IntegerNumberConverter();

    // Assert
    Assert.assertNotNull(integerNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
