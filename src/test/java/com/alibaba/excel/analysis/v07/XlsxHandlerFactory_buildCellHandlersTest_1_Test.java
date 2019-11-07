package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxCellHandler;
import com.alibaba.excel.analysis.v07.XlsxHandlerFactory;
import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.metadata.CellData;
import java.util.List;
import java.util.Map;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxHandlerFactory_buildCellHandlersTest_1_Test {
  @Test
  public void buildCellHandlersTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;
    StylesTable stylesTable = new StylesTable();

    // Act
    List<XlsxCellHandler> actual = XlsxHandlerFactory.buildCellHandlers(analysisContext, stylesTable);

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(3, actual.size());
    XlsxCellHandler getResult = actual.get(0);
    XlsxCellHandler getResult1 = actual.get(1);
    XlsxCellHandler getResult2 = actual.get(2);
    Assert.assertTrue(getResult instanceof CountRowCellHandler);
    Assert.assertTrue(getResult2 instanceof ProcessResultCellHandler);
    String toStringResult = ((CountRowCellHandler) getResult).toString();
    String toStringResult1 = ((ProcessResultCellHandler) getResult2).toString();
    Assert.assertTrue(getResult1 instanceof DefaultCellHandler);
    String toStringResult2 = ((DefaultCellHandler) getResult1).toString();
    Map<Integer, CellData> curRowContent = ((DefaultCellHandler) getResult1).getCurRowContent();
    Assert.assertNotNull(toStringResult1);
    Assert.assertTrue(curRowContent instanceof java.util.TreeMap);
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(0, curRowContent.size());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
