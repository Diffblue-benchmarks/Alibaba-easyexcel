package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NoteRecordHandler_supportTest_2_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    NoteRecordHandler noteRecordHandler = new NoteRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(28, 28);

    // Act
    boolean actual = noteRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
