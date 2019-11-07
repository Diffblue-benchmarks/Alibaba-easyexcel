package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessResultCellHandler_ProcessResultCellHandlerTest_4_Test {
  @Test
  public void ProcessResultCellHandlerTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;
    DefaultCellHandler rowResultHandler = new DefaultCellHandler(null, new StylesTable());

    // Act
    ProcessResultCellHandler processResultCellHandler = new ProcessResultCellHandler(analysisContext, rowResultHandler);

    // Assert
    Assert.assertNotNull(processResultCellHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
