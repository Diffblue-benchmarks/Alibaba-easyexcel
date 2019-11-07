package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_getUse1904windowingTest_7_Test {
  @Test
  public void getUse1904windowingTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    Boolean actual = basicParameter.getUse1904windowing();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
