package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ProcessResultCellHandler_endHandleTest_3_Test {
  @Test
  public void endHandleTest() throws Exception {
    // Arrange
    ProcessResultCellHandler processResultCellHandler = new ProcessResultCellHandler(null,
        new DefaultCellHandler(null, new StylesTable()));
    String name = "row";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    processResultCellHandler.endHandle(name);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
