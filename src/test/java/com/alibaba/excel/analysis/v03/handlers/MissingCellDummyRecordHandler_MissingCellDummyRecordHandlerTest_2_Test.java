package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MissingCellDummyRecordHandler_MissingCellDummyRecordHandlerTest_2_Test {
  @Test
  public void MissingCellDummyRecordHandlerTest() throws Exception {
    // Arrange and Act
    MissingCellDummyRecordHandler missingCellDummyRecordHandler = new MissingCellDummyRecordHandler();

    // Assert
    int row = missingCellDummyRecordHandler.getRow();
    String toStringResult = missingCellDummyRecordHandler.toString();
    int column = missingCellDummyRecordHandler.getColumn();
    int order = missingCellDummyRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, missingCellDummyRecordHandler.getCellData());
    Assert.assertEquals(1, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
