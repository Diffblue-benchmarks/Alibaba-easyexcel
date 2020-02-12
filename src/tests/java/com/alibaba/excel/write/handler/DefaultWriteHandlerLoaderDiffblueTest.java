package com.alibaba.excel.write.handler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultWriteHandlerLoaderDiffblueTest {
  @Test(timeout=10000)
  public void loadDefaultHandlerTest() {
    // Arrange, Act and Assert
    assertEquals(1, DefaultWriteHandlerLoader.loadDefaultHandler(Boolean.valueOf(true)).size());
  }
}

