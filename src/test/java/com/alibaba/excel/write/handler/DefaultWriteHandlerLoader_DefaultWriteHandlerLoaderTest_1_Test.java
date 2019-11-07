package com.alibaba.excel.write.handler;

import com.alibaba.excel.write.handler.DefaultWriteHandlerLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultWriteHandlerLoader_DefaultWriteHandlerLoaderTest_1_Test {
  @Test
  public void DefaultWriteHandlerLoaderTest() throws Exception {
    // Arrange and Act
    DefaultWriteHandlerLoader defaultWriteHandlerLoader = new DefaultWriteHandlerLoader();

    // Assert
    Assert.assertNotNull(defaultWriteHandlerLoader.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
