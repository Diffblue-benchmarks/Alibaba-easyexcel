package com.alibaba.excel.cache;

import com.alibaba.excel.cache.MapCache;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MapCache_initTest_3_Test {
  @Test
  public void initTest() throws Exception {
    // Arrange
    MapCache mapCache = new MapCache();
    AnalysisContextImpl analysisContextImpl = (AnalysisContextImpl) null;

    // Act
    mapCache.init(analysisContextImpl);

    // Assert
    Assert.assertEquals(null, analysisContextImpl);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
