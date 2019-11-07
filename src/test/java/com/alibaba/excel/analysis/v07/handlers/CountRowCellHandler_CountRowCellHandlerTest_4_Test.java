package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountRowCellHandler_CountRowCellHandlerTest_4_Test {
  @Test
  public void CountRowCellHandlerTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;

    // Act
    CountRowCellHandler countRowCellHandler = new CountRowCellHandler(analysisContext);

    // Assert
    Assert.assertNotNull(countRowCellHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
