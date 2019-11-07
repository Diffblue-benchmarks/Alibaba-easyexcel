package com.alibaba.excel.cache;

import com.alibaba.excel.cache.Ehcache;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Ehcache_EhcacheTest_1_Test {
  @Test
  public void EhcacheTest() throws Exception {
    // Arrange
    int maxCacheActivateSize = 0;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new Ehcache(maxCacheActivateSize);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
