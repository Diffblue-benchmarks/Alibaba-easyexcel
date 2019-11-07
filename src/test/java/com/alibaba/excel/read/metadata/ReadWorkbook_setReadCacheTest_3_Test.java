package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_setReadCacheTest_3_Test {
  @Test
  public void setReadCacheTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();
    Ehcache ehcache = new Ehcache(1);

    // Act
    readWorkbook.setReadCache(ehcache);

    // Assert
    Assert.assertNotNull(ehcache.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
