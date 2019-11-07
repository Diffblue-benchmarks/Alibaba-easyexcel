package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalConfiguration_getUse1904windowingTest_1_Test {
  @Test
  public void getUse1904windowingTest() throws Exception {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    Boolean actual = globalConfiguration.getUse1904windowing();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
