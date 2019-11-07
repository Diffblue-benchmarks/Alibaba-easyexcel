package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultCellHandler_startHandleTest_1_Test {
  @Test
  public void startHandleTest() throws Exception {
    // Arrange
    DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, new StylesTable());
    String name = "Cannot set values now";
    AttributesHolder attributesHolder = new AttributesHolder();

    // Act
    defaultCellHandler.startHandle(name, attributesHolder);

    // Assert
    String toStringResult = attributesHolder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, attributesHolder.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
