package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.LabelRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LabelRecordHandler_supportTest_4_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    LabelRecordHandler labelRecordHandler = new LabelRecordHandler();
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(516, 516);

    // Act
    boolean actual = labelRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
