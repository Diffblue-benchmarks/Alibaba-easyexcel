package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class NoteRecordHandler_processRecordTest_4_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    NoteRecordHandler noteRecordHandler = new NoteRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(28, 28);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    noteRecordHandler.processRecord(record);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
