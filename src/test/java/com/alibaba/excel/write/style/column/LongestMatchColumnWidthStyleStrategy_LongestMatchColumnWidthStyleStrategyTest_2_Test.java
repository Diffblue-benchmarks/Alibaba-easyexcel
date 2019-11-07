package com.alibaba.excel.write.style.column;

import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongestMatchColumnWidthStyleStrategy_LongestMatchColumnWidthStyleStrategyTest_2_Test {
  @Test
  public void LongestMatchColumnWidthStyleStrategyTest() throws Exception {
    // Arrange and Act
    LongestMatchColumnWidthStyleStrategy longestMatchColumnWidthStyleStrategy = new LongestMatchColumnWidthStyleStrategy();

    // Assert
    Assert.assertNotNull(longestMatchColumnWidthStyleStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
