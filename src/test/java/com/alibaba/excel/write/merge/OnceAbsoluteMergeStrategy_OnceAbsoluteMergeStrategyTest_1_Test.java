package com.alibaba.excel.write.merge;

import com.alibaba.excel.write.merge.OnceAbsoluteMergeStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OnceAbsoluteMergeStrategy_OnceAbsoluteMergeStrategyTest_1_Test {
  @Test
  public void OnceAbsoluteMergeStrategyTest() throws Exception {
    // Arrange
    int firstRowIndex = 1;
    int lastRowIndex = 1;
    int firstColumnIndex = 1;
    int lastColumnIndex = 1;

    // Act
    OnceAbsoluteMergeStrategy onceAbsoluteMergeStrategy = new OnceAbsoluteMergeStrategy(firstRowIndex, lastRowIndex,
        firstColumnIndex, lastColumnIndex);

    // Assert
    Assert.assertNotNull(onceAbsoluteMergeStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
