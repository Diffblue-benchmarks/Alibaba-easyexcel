package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountRowCellHandler_supportTest_1_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    CountRowCellHandler countRowCellHandler = new CountRowCellHandler(null);
    String name = "dimension";

    // Act
    boolean actual = countRowCellHandler.support(name);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
