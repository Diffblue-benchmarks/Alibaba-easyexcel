package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanBooleanConverter_BooleanBooleanConverterTest_3_Test {
  @Test
  public void BooleanBooleanConverterTest() throws Exception {
    // Arrange and Act
    BooleanBooleanConverter booleanBooleanConverter = new BooleanBooleanConverter();

    // Assert
    Assert.assertNotNull(booleanBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
