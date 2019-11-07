package com.alibaba.excel.converters;

import com.alibaba.excel.converters.AutoConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AutoConverter_AutoConverterTest_2_Test {
  @Test
  public void AutoConverterTest() throws Exception {
    // Arrange and Act
    AutoConverter autoConverter = new AutoConverter();

    // Assert
    Assert.assertNotNull(autoConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
