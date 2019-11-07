package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.SharedStringsTableHandler;
import com.alibaba.excel.cache.Ehcache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SharedStringsTableHandler_SharedStringsTableHandlerTest_3_Test {
  @Test
  public void SharedStringsTableHandlerTest() throws Exception {
    // Arrange
    Ehcache readCache = (Ehcache) null;

    // Act
    SharedStringsTableHandler sharedStringsTableHandler = new SharedStringsTableHandler(readCache);

    // Assert
    Assert.assertNotNull(sharedStringsTableHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
