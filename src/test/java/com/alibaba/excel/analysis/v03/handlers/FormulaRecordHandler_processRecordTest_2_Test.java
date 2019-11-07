package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.FormulaRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormulaRecordHandler_processRecordTest_2_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    FormulaRecordHandler formulaRecordHandler = new FormulaRecordHandler(hSSFWorkbook,
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));
    LastCellOfRowDummyRecord lastCellOfRowDummyRecord = new LastCellOfRowDummyRecord(0, 0);

    // Act
    formulaRecordHandler.processRecord(lastCellOfRowDummyRecord);

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
