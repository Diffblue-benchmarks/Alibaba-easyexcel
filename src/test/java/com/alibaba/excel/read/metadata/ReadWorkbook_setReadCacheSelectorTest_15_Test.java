package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_setReadCacheSelectorTest_15_Test {
  @Test
  public void setReadCacheSelectorTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();
    EternalReadCacheSelector eternalReadCacheSelector = new EternalReadCacheSelector(new Ehcache(1));

    // Act
    readWorkbook.setReadCacheSelector(eternalReadCacheSelector);

    // Assert
    Assert.assertNotNull(eternalReadCacheSelector.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
