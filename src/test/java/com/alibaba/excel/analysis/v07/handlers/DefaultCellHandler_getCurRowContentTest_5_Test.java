package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import java.util.Map;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultCellHandler_getCurRowContentTest_5_Test {
  @Test
  public void getCurRowContentTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());

    // Act
    Map<Integer, CellData> actual = defaultCellHandler.getCurRowContent();

    // Assert
    Assert.assertTrue(actual instanceof java.util.TreeMap);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
