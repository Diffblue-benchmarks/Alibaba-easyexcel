package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalConfiguration_setAutoTrimTest_3_Test {
  @Test
  public void setAutoTrimTest() throws Exception {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();
    Boolean autoTrim = new Boolean(true);

    // Act
    globalConfiguration.setAutoTrim(autoTrim);

    // Assert
    Boolean autoTrim1 = globalConfiguration.getAutoTrim();
    String toStringResult = globalConfiguration.toString();
    Assert.assertEquals(Boolean.valueOf(true), autoTrim1);
    Assert.assertEquals(null, globalConfiguration.getUse1904windowing());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
