package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteStringConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteStringConverter_ByteStringConverterTest_5_Test {
  @Test
  public void ByteStringConverterTest() throws Exception {
    // Arrange and Act
    ByteStringConverter byteStringConverter = new ByteStringConverter();

    // Assert
    Assert.assertNotNull(byteStringConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
