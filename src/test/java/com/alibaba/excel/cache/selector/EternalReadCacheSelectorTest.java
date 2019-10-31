package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class EternalReadCacheSelectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e7a7b136d0c44d4b() {

    // Arrange
    final Ehcache arg0 = new Ehcache(1);

    // Act, creating object to test constructor
    final EternalReadCacheSelector actual = new EternalReadCacheSelector(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readCacheInputNullOutputNotNull9996dd7ff59e2dcd612() {

    // Arrange
    final Ehcache ehcache = new Ehcache(1);
    final EternalReadCacheSelector thisObj = new EternalReadCacheSelector(ehcache);
    final PackagePart arg0 = null;

    // Act
    final ReadCache actual = thisObj.readCache(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
