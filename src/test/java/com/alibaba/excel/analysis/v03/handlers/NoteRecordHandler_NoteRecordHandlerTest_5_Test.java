package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import com.alibaba.excel.metadata.CellData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NoteRecordHandler_NoteRecordHandlerTest_5_Test {
  @Test
  public void NoteRecordHandlerTest() throws Exception {
    // Arrange and Act
    NoteRecordHandler noteRecordHandler = new NoteRecordHandler();

    // Assert
    String toStringResult = noteRecordHandler.toString();
    int column = noteRecordHandler.getColumn();
    int order = noteRecordHandler.getOrder();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, noteRecordHandler.getCellData());
    Assert.assertEquals(0, order);
    Assert.assertEquals(-1, column);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
