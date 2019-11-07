package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XlsListSheetListener_processRecordTest_1_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, new POIFSFileSystem());
    LastCellOfRowDummyRecord lastCellOfRowDummyRecord = new LastCellOfRowDummyRecord(0, 0);

    // Act
    xlsListSheetListener.processRecord(lastCellOfRowDummyRecord);

    // Assert
    String toStringResult = lastCellOfRowDummyRecord.toString();
    short sid = lastCellOfRowDummyRecord.getSid();
    Assert.assertEquals("End-of-Row for Row=0 at Column=0", toStringResult);
    Assert.assertEquals(0, lastCellOfRowDummyRecord.getLastColumnNumber());
    Assert.assertEquals((short) -1, sid);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
