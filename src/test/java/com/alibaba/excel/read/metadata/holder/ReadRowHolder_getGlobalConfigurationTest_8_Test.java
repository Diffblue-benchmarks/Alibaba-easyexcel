package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadRowHolder_getGlobalConfigurationTest_8_Test {
  @Test
  public void getGlobalConfigurationTest() throws Exception {
    // Arrange
    Integer integer = new Integer(1);
    ReadRowHolder readRowHolder = new ReadRowHolder(integer, new GlobalConfiguration());

    // Act
    GlobalConfiguration actual = readRowHolder.getGlobalConfiguration();

    // Assert
    Boolean autoTrim = actual.getAutoTrim();
    String toStringResult = actual.toString();
    Assert.assertEquals(null, autoTrim);
    Assert.assertEquals(null, actual.getUse1904windowing());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
