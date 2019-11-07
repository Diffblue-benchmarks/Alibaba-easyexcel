package com.alibaba.excel.converters.longconverter;

import com.alibaba.excel.converters.longconverter.LongBooleanConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongBooleanConverter_LongBooleanConverterTest_4_Test {
  @Test
  public void LongBooleanConverterTest() throws Exception {
    // Arrange and Act
    LongBooleanConverter longBooleanConverter = new LongBooleanConverter();

    // Assert
    Assert.assertNotNull(longBooleanConverter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
