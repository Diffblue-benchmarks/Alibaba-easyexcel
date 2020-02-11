package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BooleanUtilsDiffblueTest {
  @Test(timeout=10000)
  public void valueOfTest() {
    // Arrange
    Boolean actualValueOfResult = BooleanUtils.valueOf("foo");

    // Act and Assert
    assertEquals(Boolean.valueOf(false), actualValueOfResult);
    assertEquals(Boolean.valueOf(true), BooleanUtils.valueOf("1"));
  }
}

