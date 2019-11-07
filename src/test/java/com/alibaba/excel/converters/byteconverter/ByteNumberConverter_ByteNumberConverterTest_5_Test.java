package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteNumberConverter_ByteNumberConverterTest_5_Test {
  @Test
  public void ByteNumberConverterTest() throws Exception {
    // Arrange and Act
    ByteNumberConverter byteNumberConverter = new ByteNumberConverter();

    // Assert
    Assert.assertNotNull(byteNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
