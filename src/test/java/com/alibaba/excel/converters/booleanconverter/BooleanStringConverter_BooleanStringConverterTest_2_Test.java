package com.alibaba.excel.converters.booleanconverter;

import com.alibaba.excel.converters.booleanconverter.BooleanStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanStringConverter_BooleanStringConverterTest_2_Test {
  @Test
  public void BooleanStringConverterTest() throws Exception {
    // Arrange and Act
    BooleanStringConverter booleanStringConverter = new BooleanStringConverter();

    // Assert
    Assert.assertNotNull(booleanStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
