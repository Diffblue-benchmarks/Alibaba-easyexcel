package com.alibaba.excel.read.listener;

import com.alibaba.excel.read.listener.ModelBuildEventListener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ModelBuildEventListener_ModelBuildEventListenerTest_3_Test {
  @Test
  public void ModelBuildEventListenerTest() throws Exception {
    // Arrange and Act
    ModelBuildEventListener modelBuildEventListener = new ModelBuildEventListener();

    // Assert
    Assert.assertNotNull(modelBuildEventListener.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
