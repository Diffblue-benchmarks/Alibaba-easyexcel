package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringErrorConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringErrorConverter_StringErrorConverterTest_1_Test {
  @Test
  public void StringErrorConverterTest() throws Exception {
    // Arrange and Act
    StringErrorConverter stringErrorConverter = new StringErrorConverter();

    // Assert
    Assert.assertNotNull(stringErrorConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
