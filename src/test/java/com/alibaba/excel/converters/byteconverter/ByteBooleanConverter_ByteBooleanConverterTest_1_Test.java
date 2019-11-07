package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteBooleanConverter_ByteBooleanConverterTest_1_Test {
  @Test
  public void ByteBooleanConverterTest() throws Exception {
    // Arrange and Act
    ByteBooleanConverter byteBooleanConverter = new ByteBooleanConverter();

    // Assert
    Assert.assertNotNull(byteBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
