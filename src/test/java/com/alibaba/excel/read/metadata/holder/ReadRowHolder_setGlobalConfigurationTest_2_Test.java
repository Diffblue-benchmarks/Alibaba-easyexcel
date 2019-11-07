package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_setGlobalConfigurationTest_2_Test {
  @Test
  public void setGlobalConfigurationTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    readRowHolder.setGlobalConfiguration(globalConfiguration);

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
