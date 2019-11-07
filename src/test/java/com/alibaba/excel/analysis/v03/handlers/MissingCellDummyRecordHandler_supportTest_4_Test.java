package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MissingCellDummyRecordHandler_supportTest_4_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    MissingCellDummyRecordHandler missingCellDummyRecordHandler = new MissingCellDummyRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(1, 1);

    // Act
    boolean actual = missingCellDummyRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
