package com.alibaba.excel.analysis.v03;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.exception.ExcelAnalysisException;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XlsListSheetListenerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNotNull999058dfe858ae9bb8f() {

    // Arrange
    final AnalysisContext arg0 = null;
    final POIFSFileSystem arg1 = new POIFSFileSystem();

    // Act, creating object to test constructor
    final XlsListSheetListener actual = new XlsListSheetListener(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetListOutputExcelAnalysisException9999f672d23575c3ef0() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener thisObj = new XlsListSheetListener(null, pOIFSFileSystem);

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.getSheetList();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputVoid99931b8553060226a22() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener thisObj = new XlsListSheetListener(null, pOIFSFileSystem);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(0, 0);

    // Act
    thisObj.processRecord(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
