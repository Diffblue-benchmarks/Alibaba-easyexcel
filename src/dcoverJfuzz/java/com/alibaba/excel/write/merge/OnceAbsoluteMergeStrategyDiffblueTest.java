package com.alibaba.excel.write.merge;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OnceAbsoluteMergeStrategyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new OnceAbsoluteMergeStrategy(1, 1, 1, -1);
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new OnceAbsoluteMergeStrategy(1, -1, 1, 1);
  }
}

