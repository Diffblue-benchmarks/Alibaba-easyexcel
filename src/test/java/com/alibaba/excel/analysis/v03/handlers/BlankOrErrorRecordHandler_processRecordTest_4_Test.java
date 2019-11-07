package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BlankOrErrorRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BlankOrErrorRecordHandler_processRecordTest_4_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    BlankOrErrorRecordHandler blankOrErrorRecordHandler = new BlankOrErrorRecordHandler();
    LastCellOfRowDummyRecord lastCellOfRowDummyRecord = new LastCellOfRowDummyRecord(513, 513);

    // Act
    blankOrErrorRecordHandler.processRecord(lastCellOfRowDummyRecord);

    // Assert
    int row = lastCellOfRowDummyRecord.getRow();
    String toStringResult = lastCellOfRowDummyRecord.toString();
    short sid = lastCellOfRowDummyRecord.getSid();
    Assert.assertEquals(513, row);
    Assert.assertEquals(513, lastCellOfRowDummyRecord.getLastColumnNumber());
    Assert.assertEquals((short) -1, sid);
    Assert.assertEquals("End-of-Row for Row=513 at Column=513", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
