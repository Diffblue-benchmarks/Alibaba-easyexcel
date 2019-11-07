package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_getClazzTest_4_Test {
  @Test
  public void getClazzTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();

    // Act
    Class actual = basicParameter.getClazz();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
