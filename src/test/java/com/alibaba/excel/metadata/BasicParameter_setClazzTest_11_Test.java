package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BasicParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BasicParameter_setClazzTest_11_Test {
  @Test
  public void setClazzTest() throws Exception {
    // Arrange
    BasicParameter basicParameter = new BasicParameter();
    Class resultClass = (Class) null;

    // Act
    basicParameter.setClazz(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
