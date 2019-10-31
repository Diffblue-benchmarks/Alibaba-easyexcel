package com.alibaba.excel.util;

import com.alibaba.excel.util.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StringUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void isEmptyInputNotNullOutputTrue9995fa3bc18e696fba8() {

    // Arrange
    final Object arg0 = "";

    // Act
    final boolean actual = StringUtils.isEmpty(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
