package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.NumberRecordHandler;
import com.alibaba.excel.context.AnalysisContextImpl;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class NumberRecordHandler_processRecordTest_1_Test {
  @Test
  public void processRecordTest() throws Exception {
    // Arrange
    NumberRecordHandler numberRecordHandler = new NumberRecordHandler(
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(515, 515);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    numberRecordHandler.processRecord(record);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
