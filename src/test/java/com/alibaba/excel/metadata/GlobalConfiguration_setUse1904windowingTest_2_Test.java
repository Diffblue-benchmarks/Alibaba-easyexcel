package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalConfiguration_setUse1904windowingTest_2_Test {
  @Test
  public void setUse1904windowingTest() throws Exception {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    Boolean use1904windowing = new Boolean(true);

    // Act
    globalConfiguration.setUse1904windowing(use1904windowing);

    // Assert
    Boolean autoTrim = globalConfiguration.getAutoTrim();
    String toStringResult = globalConfiguration.toString();
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(Boolean.valueOf(true), globalConfiguration.getUse1904windowing());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
