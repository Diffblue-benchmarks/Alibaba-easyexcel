package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapCache_destroyTest_5_Test {
  @Test
  public void destroyTest() throws Exception {
    // Arrange
    MapCache mapCache = new MapCache();

    // Act
    mapCache.destroy();

    // Assert
    Assert.assertNotNull(mapCache.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
