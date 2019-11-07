package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BoxingByteArrayImageConverter_BoxingByteArrayImageConverterTest_5_Test {
  @Test
  public void BoxingByteArrayImageConverterTest() throws Exception {
    // Arrange and Act
    BoxingByteArrayImageConverter boxingByteArrayImageConverter = new BoxingByteArrayImageConverter();

    // Assert
    Assert.assertNotNull(boxingByteArrayImageConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
