package com.alibaba.excel.converters.string;

import com.alibaba.excel.converters.string.StringNumberConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringNumberConverter_StringNumberConverterTest_3_Test {
  @Test
  public void StringNumberConverterTest() throws Exception {
    // Arrange and Act
    StringNumberConverter stringNumberConverter = new StringNumberConverter();

    // Assert
    Assert.assertNotNull(stringNumberConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
