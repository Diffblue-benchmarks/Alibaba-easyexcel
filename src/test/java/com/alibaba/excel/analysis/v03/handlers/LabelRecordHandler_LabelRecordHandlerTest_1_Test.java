package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.LabelRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LabelRecordHandler_LabelRecordHandlerTest_1_Test {
  @Test
  public void LabelRecordHandlerTest() throws Exception {
    // Arrange and Act
    LabelRecordHandler labelRecordHandler = new LabelRecordHandler();

    // Assert
    int row = labelRecordHandler.getRow();
    String toStringResult = labelRecordHandler.toString();
    int column = labelRecordHandler.getColumn();
    int order = labelRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, labelRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
