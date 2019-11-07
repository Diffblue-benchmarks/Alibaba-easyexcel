package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EternalReadCacheSelector_EternalReadCacheSelectorTest_2_Test {
  @Test
  public void EternalReadCacheSelectorTest() throws Exception {
    // Arrange
    Ehcache readCache = new Ehcache(1);

    // Act
    EternalReadCacheSelector eternalReadCacheSelector = new EternalReadCacheSelector(readCache);

    // Assert
    Assert.assertNotNull(eternalReadCacheSelector.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
