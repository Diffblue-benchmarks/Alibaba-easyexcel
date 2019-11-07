package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BlankOrErrorRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BlankOrErrorRecordHandler_BlankOrErrorRecordHandlerTest_5_Test {
  @Test
  public void BlankOrErrorRecordHandlerTest() throws Exception {
    // Arrange and Act
    BlankOrErrorRecordHandler blankOrErrorRecordHandler = new BlankOrErrorRecordHandler();

    // Assert
    int row = blankOrErrorRecordHandler.getRow();
    String toStringResult = blankOrErrorRecordHandler.toString();
    int column = blankOrErrorRecordHandler.getColumn();
    int order = blankOrErrorRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, blankOrErrorRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
