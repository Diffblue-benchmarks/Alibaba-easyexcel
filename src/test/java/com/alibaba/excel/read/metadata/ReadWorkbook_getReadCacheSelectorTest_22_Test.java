package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getReadCacheSelectorTest_22_Test {
  @Test
  public void getReadCacheSelectorTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    ReadCacheSelector actual = readWorkbook.getReadCacheSelector();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
