package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxRowHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxRowHandler_XlsxRowHandlerTest_2_Test {
  @Test
  public void XlsxRowHandlerTest() throws Exception {
    // Arrange
    AnalysisContextImpl analysisContext = (AnalysisContextImpl) null;
    StylesTable stylesTable = new StylesTable();

    // Act
    XlsxRowHandler xlsxRowHandler = new XlsxRowHandler(analysisContext, stylesTable);

    // Assert
    Assert.assertNotNull(xlsxRowHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
