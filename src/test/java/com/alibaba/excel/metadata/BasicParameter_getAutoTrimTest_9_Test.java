package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_getAutoTrimTest_9_Test {
  @Test
  public void getAutoTrimTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    Boolean actual = basicParameter.getAutoTrim();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
