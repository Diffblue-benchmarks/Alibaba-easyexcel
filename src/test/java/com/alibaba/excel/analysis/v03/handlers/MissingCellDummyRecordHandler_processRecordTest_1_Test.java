package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MissingCellDummyRecordHandler_processRecordTest_1_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    MissingCellDummyRecordHandler missingCellDummyRecordHandler = new MissingCellDummyRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(1, 1);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    missingCellDummyRecordHandler.processRecord(record);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
