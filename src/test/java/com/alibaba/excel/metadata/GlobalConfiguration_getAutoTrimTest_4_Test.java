package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalConfiguration_getAutoTrimTest_4_Test {
  @Test
  public void getAutoTrimTest() throws Exception {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    Boolean actual = globalConfiguration.getAutoTrim();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
