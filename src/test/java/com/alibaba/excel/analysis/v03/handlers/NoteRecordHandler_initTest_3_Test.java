package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NoteRecordHandler_initTest_3_Test {
  @Test
  public void initTest() throws Exception {
    // Arrange
    NoteRecordHandler noteRecordHandler = new NoteRecordHandler();

    // Act
    noteRecordHandler.init();

    // Assert
    int row = noteRecordHandler.getRow();
    String toStringResult = noteRecordHandler.toString();
    int column = noteRecordHandler.getColumn();
    int order = noteRecordHandler.getOrder();
    Assert.assertEquals(-1, row);
    Assert.assertEquals(null, noteRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
