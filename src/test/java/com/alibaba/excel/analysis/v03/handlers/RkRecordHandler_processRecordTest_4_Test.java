package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class RkRecordHandler_processRecordTest_4_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    RkRecordHandler rkRecordHandler = new RkRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(638, 638);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    rkRecordHandler.processRecord(record);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
