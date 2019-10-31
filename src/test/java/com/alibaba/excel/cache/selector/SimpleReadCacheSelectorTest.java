package com.alibaba.excel.cache.selector;

import com.alibaba.excel.cache.selector.SimpleReadCacheSelector;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SimpleReadCacheSelectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c721d367032c0359() {

    // Act, creating object to test constructor
    final SimpleReadCacheSelector actual = new SimpleReadCacheSelector();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroPositiveOutputNotNull99978446981d81c276f() {

    // Arrange
    final long arg0 = 0L;
    final int arg1 = 20;

    // Act, creating object to test constructor
    final SimpleReadCacheSelector actual = new SimpleReadCacheSelector(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readCacheInputNullOutputNullPointerException99975cffea572b00317() {

    // Arrange
    final SimpleReadCacheSelector thisObj = new SimpleReadCacheSelector();
    final PackagePart arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.readCache(arg0);

    // The method is not expected to return due to exception thrown

  }
}
