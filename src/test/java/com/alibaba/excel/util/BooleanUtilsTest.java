package com.alibaba.excel.util;

import com.alibaba.excel.util.BooleanUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BooleanUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputNotNull999a515d95672a06e4e() {

    // Arrange
    final String arg0 = "1";

    // Act
    final Boolean actual = BooleanUtils.valueOf(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
