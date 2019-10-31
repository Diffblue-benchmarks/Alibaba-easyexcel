package com.alibaba.excel.cache;

import com.alibaba.excel.cache.Ehcache;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class EhcacheTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputIllegalArgumentException99938b44ef3d56daa8f() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new Ehcache(arg0);

    // The method is not expected to return due to exception thrown

  }
}
