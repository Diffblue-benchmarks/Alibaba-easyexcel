package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapCache_putTest_1_Test {
  @Test
  public void putTest() throws Exception {
    // Arrange
    MapCache mapCache = new MapCache();
    String value = "aaaaa";

    // Act
    mapCache.put(value);

    // Assert
    Assert.assertNotNull(mapCache.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
