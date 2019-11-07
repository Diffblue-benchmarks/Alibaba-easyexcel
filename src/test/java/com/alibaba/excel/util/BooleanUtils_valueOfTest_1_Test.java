package com.alibaba.excel.util;

import com.alibaba.excel.util.BooleanUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BooleanUtils_valueOfTest_1_Test {
  @Test
  public void valueOfTest() throws Exception {
    // Arrange
    String str = "1";

    // Act
    Boolean actual = BooleanUtils.valueOf(str);

    // Assert
    Assert.assertEquals(Boolean.valueOf(true), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
