package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BofRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.ArrayList;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BofRecordHandler_supportTest_1_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    arrayList.add(new ReadSheet());
    BofRecordHandler bofRecordHandler = new BofRecordHandler(null, arrayList, true);
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(0, 0);

    // Act
    boolean actual = bofRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
