package com.alibaba.excel.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange
    boolean actualIsEmptyResult = StringUtils.isEmpty("foo");

    // Act and Assert
    assertFalse(actualIsEmptyResult);
    assertTrue(StringUtils.isEmpty(""));
  }
}

