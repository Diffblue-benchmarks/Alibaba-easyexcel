package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapCache_MapCacheTest_2_Test {
  @Test
  public void MapCacheTest() throws Exception {
    // Arrange and Act
    new MapCache();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
