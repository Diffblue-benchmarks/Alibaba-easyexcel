package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getReadCacheTest_8_Test {
  @Test
  public void getReadCacheTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    ReadCache actual = readWorkbook.getReadCache();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
