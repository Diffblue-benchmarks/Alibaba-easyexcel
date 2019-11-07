package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteArrayImageConverter_ByteArrayImageConverterTest_3_Test {
  @Test
  public void ByteArrayImageConverterTest() throws Exception {
    // Arrange and Act
    ByteArrayImageConverter byteArrayImageConverter = new ByteArrayImageConverter();

    // Assert
    Assert.assertNotNull(byteArrayImageConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
