package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BooleanUtilsDiffblueTest {
  @Test(timeout=10000)
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), BooleanUtils.valueOf("foo"));
  }
}

