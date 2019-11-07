package com.alibaba.excel.converters;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.DefaultConverterLoader;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultConverterLoader_loadDefaultReadConverterTest_1_Test {
  @Test
  public void loadDefaultReadConverterTest() throws Exception {
    // Arrange and Act
    Map<String, Converter> actual = DefaultConverterLoader.loadDefaultReadConverter();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
