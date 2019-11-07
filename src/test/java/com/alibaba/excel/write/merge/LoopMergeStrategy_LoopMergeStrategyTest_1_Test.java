package com.alibaba.excel.write.merge;

import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LoopMergeStrategy_LoopMergeStrategyTest_1_Test {
  @Test
  public void LoopMergeStrategyTest() throws Exception {
    // Arrange
    int eachRow = 1;
    int columnIndex = 1;

    // Act
    LoopMergeStrategy loopMergeStrategy = new LoopMergeStrategy(eachRow, columnIndex);

    // Assert
    Assert.assertNotNull(loopMergeStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
