package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalConfiguration_GlobalConfigurationTest_5_Test {
  @Test
  public void GlobalConfigurationTest() throws Exception {
    // Arrange and Act
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Assert
    Boolean autoTrim = globalConfiguration.getAutoTrim();
    String toStringResult = globalConfiguration.toString();
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, globalConfiguration.getUse1904windowing());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
