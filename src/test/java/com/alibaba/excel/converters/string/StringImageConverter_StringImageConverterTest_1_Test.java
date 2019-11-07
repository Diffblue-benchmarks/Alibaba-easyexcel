package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringImageConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringImageConverter_StringImageConverterTest_1_Test {
  @Test
  public void StringImageConverterTest() throws Exception {
    // Arrange and Act
    StringImageConverter stringImageConverter = new StringImageConverter();

    // Assert
    Assert.assertNotNull(stringImageConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
