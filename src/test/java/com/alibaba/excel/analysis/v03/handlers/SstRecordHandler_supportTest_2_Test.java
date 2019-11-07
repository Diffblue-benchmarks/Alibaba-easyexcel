package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.SstRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SstRecordHandler_supportTest_2_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    SstRecordHandler sstRecordHandler = new SstRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(252, 252);

    // Act
    boolean actual = sstRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
