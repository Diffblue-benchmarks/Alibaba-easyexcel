package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxRowHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsxRowHandler_startElementTest_3_Test {
  @Test
  public void startElementTest() throws Exception {
    // Arrange
    XlsxRowHandler xlsxRowHandler = new XlsxRowHandler(null, new StylesTable());
    String uri = "aaaaa";
    String localName = "aaaaa";
    String name = "akaaa";
    AttributesHolder attributesHolder = new AttributesHolder();

    // Act
    xlsxRowHandler.startElement(uri, localName, name, attributesHolder);

    // Assert
    String toStringResult = attributesHolder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, attributesHolder.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
