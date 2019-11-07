package com.alibaba.excel.util;

import com.alibaba.excel.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StringUtils_isEmptyTest_1_Test {
  @Test
  public void isEmptyTest() throws Exception {
    // Arrange
    String str = "";

    // Act
    boolean actual = StringUtils.isEmpty(str);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
