package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultCellHandler_appendCurrentCellValueTest_6_Test {
  @Test
  public void appendCurrentCellValueTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());
    char[] charArray = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
    int start = 1;
    int length = 655361;

    // Act
    defaultCellHandler.appendCurrentCellValue(charArray, start, length);

    // Assert
    Assert.assertEquals(8, charArray.length);
    Assert.assertArrayEquals(new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'}, charArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
