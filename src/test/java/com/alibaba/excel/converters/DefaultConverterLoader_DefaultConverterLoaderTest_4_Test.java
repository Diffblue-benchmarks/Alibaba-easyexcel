package com.alibaba.excel.converters;

import com.alibaba.excel.converters.DefaultConverterLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultConverterLoader_DefaultConverterLoaderTest_4_Test {
  @Test
  public void DefaultConverterLoaderTest() throws Exception {
    // Arrange and Act
    DefaultConverterLoader defaultConverterLoader = new DefaultConverterLoader();

    // Assert
    Assert.assertNotNull(defaultConverterLoader.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
