package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import org.apache.poi.openxml4j.opc.ZipPackagePart;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EternalReadCacheSelector_readCacheTest_1_Test {
  @Test
  public void readCacheTest() throws Exception {
    // Arrange
    EternalReadCacheSelector eternalReadCacheSelector = new EternalReadCacheSelector(new Ehcache(1));
    ZipPackagePart sharedStringsTablePackagePart = (ZipPackagePart) null;

    // Act
    ReadCache actual = eternalReadCacheSelector.readCache(sharedStringsTablePackagePart);

    // Assert
    Assert.assertTrue(actual instanceof Ehcache);
    Assert.assertNotNull(((Ehcache) actual).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
