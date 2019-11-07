package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import java.util.Map;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultCellHandler_clearResultTest_3_Test {
  @Test
  public void clearResultTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());

    // Act
    defaultCellHandler.clearResult();

    // Assert
    String toStringResult = defaultCellHandler.toString();
    Map<Integer, CellData> curRowContent = defaultCellHandler.getCurRowContent();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(curRowContent instanceof java.util.TreeMap);
    Assert.assertEquals(0, curRowContent.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
