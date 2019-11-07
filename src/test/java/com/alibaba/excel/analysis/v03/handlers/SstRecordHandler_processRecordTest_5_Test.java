package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.SstRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SstRecordHandler_processRecordTest_5_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    SstRecordHandler sstRecordHandler = new SstRecordHandler();
    LastCellOfRowDummyRecord lastCellOfRowDummyRecord = new LastCellOfRowDummyRecord(252, 252);

    // Act
    sstRecordHandler.processRecord(lastCellOfRowDummyRecord);

    // Assert
    int row = lastCellOfRowDummyRecord.getRow();
    String toStringResult = lastCellOfRowDummyRecord.toString();
    short sid = lastCellOfRowDummyRecord.getSid();
    Assert.assertEquals(252, row);
    Assert.assertEquals(252, lastCellOfRowDummyRecord.getLastColumnNumber());
    Assert.assertEquals((short) -1, sid);
    Assert.assertEquals("End-of-Row for Row=252 at Column=252", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
