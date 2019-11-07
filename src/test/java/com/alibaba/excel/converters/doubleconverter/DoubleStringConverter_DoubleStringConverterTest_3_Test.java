package com.alibaba.excel.converters.doubleconverter;

import com.alibaba.excel.converters.doubleconverter.DoubleStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoubleStringConverter_DoubleStringConverterTest_3_Test {
  @Test
  public void DoubleStringConverterTest() throws Exception {
    // Arrange and Act
    DoubleStringConverter doubleStringConverter = new DoubleStringConverter();

    // Assert
    Assert.assertNotNull(doubleStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
