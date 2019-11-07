package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ProcessResultCellHandler_startHandleTest_2_Test {
  @Test
  public void startHandleTest() throws Exception {
    // Arrange
    ProcessResultCellHandler processResultCellHandler = new ProcessResultCellHandler(null,
        new DefaultCellHandler(null, new StylesTable()));
    String name = "row";
    AttributesHolder attributesHolder = new AttributesHolder();
    attributesHolder.setAttributes(new AttributesHolder());
    attributesHolder.setAttributes(new AttributesHolder());

    // Act and Assert
    thrown.expect(NullPointerException.class);
    processResultCellHandler.startHandle(name, attributesHolder);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
