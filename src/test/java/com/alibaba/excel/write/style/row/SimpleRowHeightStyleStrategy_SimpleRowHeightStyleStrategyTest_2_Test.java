package com.alibaba.excel.write.style.row;

import com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SimpleRowHeightStyleStrategy_SimpleRowHeightStyleStrategyTest_2_Test {
  @Test
  public void SimpleRowHeightStyleStrategyTest() throws Exception {
    // Arrange
    Short headRowHeight = new Short((short) 1);
    Short contentRowHeight = new Short((short) 1);

    // Act
    SimpleRowHeightStyleStrategy simpleRowHeightStyleStrategy = new SimpleRowHeightStyleStrategy(headRowHeight,
        contentRowHeight);

    // Assert
    Assert.assertNotNull(simpleRowHeightStyleStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
