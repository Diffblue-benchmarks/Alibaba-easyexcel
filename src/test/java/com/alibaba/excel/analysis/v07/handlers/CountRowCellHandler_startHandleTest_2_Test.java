package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CountRowCellHandler_startHandleTest_2_Test {
  @Test
  public void startHandleTest() throws Exception {
    // Arrange
    CountRowCellHandler countRowCellHandler = new CountRowCellHandler(null);
    String name = "dimension";
    AttributesHolder attributes = new AttributesHolder();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countRowCellHandler.startHandle(name, attributes);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
