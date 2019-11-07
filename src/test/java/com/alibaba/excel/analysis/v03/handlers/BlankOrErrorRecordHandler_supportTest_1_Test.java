package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BlankOrErrorRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BlankOrErrorRecordHandler_supportTest_1_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    BlankOrErrorRecordHandler blankOrErrorRecordHandler = new BlankOrErrorRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(513, 513);

    // Act
    boolean actual = blankOrErrorRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
