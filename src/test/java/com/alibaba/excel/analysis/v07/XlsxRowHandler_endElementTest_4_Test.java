package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxRowHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxRowHandler_endElementTest_4_Test {
  @Test
  public void endElementTest() throws Exception {
    // Arrange
    XlsxRowHandler xlsxRowHandler = new XlsxRowHandler(null, new StylesTable());
    String uri = "aaaaa";
    String localName = "aaaaa";
    String name = "akaaa";

    // Act
    xlsxRowHandler.endElement(uri, localName, name);

    // Assert
    Assert.assertNotNull(xlsxRowHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
