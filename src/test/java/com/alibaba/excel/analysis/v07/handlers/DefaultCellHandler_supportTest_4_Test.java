package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultCellHandler_supportTest_4_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());
    String name = "Cannot set values now";

    // Act
    boolean actual = defaultCellHandler.support(name);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
