package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessResultCellHandler_supportTest_1_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    ProcessResultCellHandler processResultCellHandler = new ProcessResultCellHandler(null,
        new DefaultCellHandler(null, new StylesTable()));
    String name = "row";

    // Act
    boolean actual = processResultCellHandler.support(name);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
