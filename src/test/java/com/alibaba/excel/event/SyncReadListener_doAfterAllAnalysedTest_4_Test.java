package com.alibaba.excel.event;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.event.SyncReadListener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SyncReadListener_doAfterAllAnalysedTest_4_Test {
  @Test
  public void doAfterAllAnalysedTest() throws Exception {
    // Arrange
    SyncReadListener syncReadListener = new SyncReadListener();
    AnalysisContextImpl analysisContextImpl = (AnalysisContextImpl) null;

    // Act
    syncReadListener.doAfterAllAnalysed(analysisContextImpl);

    // Assert
    Assert.assertEquals(null, analysisContextImpl);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
