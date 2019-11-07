package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.selector.SimpleReadCacheSelector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SimpleReadCacheSelector_SimpleReadCacheSelectorTest_3_Test {
  @Test
  public void SimpleReadCacheSelectorTest() throws Exception {
    // Arrange and Act
    SimpleReadCacheSelector simpleReadCacheSelector = new SimpleReadCacheSelector();

    // Assert
    Assert.assertNotNull(simpleReadCacheSelector.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
