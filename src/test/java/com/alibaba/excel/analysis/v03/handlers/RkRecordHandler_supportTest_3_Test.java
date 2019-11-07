package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RkRecordHandler_supportTest_3_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    RkRecordHandler rkRecordHandler = new RkRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(638, 638);

    // Act
    boolean actual = rkRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
