package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringBooleanConverter_StringBooleanConverterTest_2_Test {
  @Test
  public void StringBooleanConverterTest() throws Exception {
    // Arrange and Act
    StringBooleanConverter stringBooleanConverter = new StringBooleanConverter();

    // Assert
    Assert.assertNotNull(stringBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
