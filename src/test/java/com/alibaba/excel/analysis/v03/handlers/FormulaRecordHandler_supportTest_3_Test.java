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

public class FormulaRecordHandler_supportTest_3_Test {
  @Test
  public void supportTest() throws Exception {
    // Arrange
    HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    FormulaRecordHandler formulaRecordHandler = new FormulaRecordHandler(hSSFWorkbook,
        new FormatTrackingHSSFListener(new XlsListSheetListener(null, new POIFSFileSystem())));
    LastCellOfRowDummyRecord record = new LastCellOfRowDummyRecord(0, 0);

    // Act
    boolean actual = formulaRecordHandler.support(record);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
