package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.LabelRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LabelRecordHandler_processRecordTest_5_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    LabelRecordHandler labelRecordHandler = new LabelRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(516, 516);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    labelRecordHandler.processRecord(record);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
