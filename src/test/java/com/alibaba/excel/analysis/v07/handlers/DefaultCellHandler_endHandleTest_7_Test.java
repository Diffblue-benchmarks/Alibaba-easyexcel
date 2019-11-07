package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import java.util.NoSuchElementException;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultCellHandler_endHandleTest_7_Test {
  @Test
  public void endHandleTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());
    String name = "Cannot set values now";

    // Act and Assert
    thrown.expect(NoSuchElementException.class);
    defaultCellHandler.endHandle(name);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
