package com.alibaba.excel.read.listener.event;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EachRowAnalysisFinishEventDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new EachRowAnalysisFinishEvent(null)).getAnalysisResult());
  }

  @Test(timeout=10000)
  public void getAnalysisResultTest() {
    // Arrange, Act and Assert
    assertNull((new EachRowAnalysisFinishEvent(null)).getAnalysisResult());
  }
}

