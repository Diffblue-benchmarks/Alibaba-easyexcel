package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BofRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadSheet;
import java.util.ArrayList;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BofRecordHandler_processRecordTest_5_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    arrayList.add(new ReadSheet());
    BofRecordHandler bofRecordHandler = new BofRecordHandler(null, arrayList, true);
    LastCellOfRowDummyRecord lastCellOfRowDummyRecord = new LastCellOfRowDummyRecord(0, 0);

    // Act
    bofRecordHandler.processRecord(lastCellOfRowDummyRecord);

    // Assert
    int row = lastCellOfRowDummyRecord.getRow();
    String toStringResult = lastCellOfRowDummyRecord.toString();
    short sid = lastCellOfRowDummyRecord.getSid();
    Assert.assertEquals(0, row);
    Assert.assertEquals(0, lastCellOfRowDummyRecord.getLastColumnNumber());
    Assert.assertEquals((short) -1, sid);
    Assert.assertEquals("End-of-Row for Row=0 at Column=0", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
