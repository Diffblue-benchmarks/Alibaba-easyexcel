package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapCache_getTest_6_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    MapCache mapCache = new MapCache();
    Integer key = new Integer(0);

    // Act
    String actual = mapCache.get(key);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
