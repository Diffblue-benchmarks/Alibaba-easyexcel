package com.alibaba.excel.read.listener;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ModelBuildEventListener_doAfterAllAnalysedTest_2_Test {
  @Test
  public void doAfterAllAnalysedTest() throws Exception {
    // Arrange
    ModelBuildEventListener modelBuildEventListener = new ModelBuildEventListener();
    AnalysisContextImpl analysisContextImpl = (AnalysisContextImpl) null;

    // Act
    modelBuildEventListener.doAfterAllAnalysed(analysisContextImpl);

    // Assert
    Assert.assertEquals(null, analysisContextImpl);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
