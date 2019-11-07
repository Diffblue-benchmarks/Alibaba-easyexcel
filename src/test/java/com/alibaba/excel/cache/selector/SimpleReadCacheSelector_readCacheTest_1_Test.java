package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.SimpleReadCacheSelector;
import org.apache.poi.openxml4j.opc.ZipPackagePart;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SimpleReadCacheSelector_readCacheTest_1_Test {
  @Test
  public void readCacheTest() throws Exception {
    // Arrange
    SimpleReadCacheSelector simpleReadCacheSelector = new SimpleReadCacheSelector();
    ZipPackagePart sharedStringsTablePackagePart = (ZipPackagePart) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    simpleReadCacheSelector.readCache(sharedStringsTablePackagePart);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
