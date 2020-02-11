package com.alibaba.excel.util;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.isEmpty("foo"));
  }
}

