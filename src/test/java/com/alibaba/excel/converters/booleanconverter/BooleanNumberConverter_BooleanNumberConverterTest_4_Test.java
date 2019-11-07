package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanNumberConverter_BooleanNumberConverterTest_4_Test {
  @Test
  public void BooleanNumberConverterTest() throws Exception {
    // Arrange and Act
    BooleanNumberConverter booleanNumberConverter = new BooleanNumberConverter();

    // Assert
    Assert.assertNotNull(booleanNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
