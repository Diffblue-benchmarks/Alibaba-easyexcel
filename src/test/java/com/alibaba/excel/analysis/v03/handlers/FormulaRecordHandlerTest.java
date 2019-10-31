package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.FormulaRecordHandler;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FormulaRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99963c65cfffdcddcab() {

    // Arrange
    final HSSFWorkbook arg0 = new HSSFWorkbook();
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener arg1 = new FormatTrackingHSSFListener(xlsListSheetListener);

    // Act, creating object to test constructor
    final FormulaRecordHandler actual = new FormulaRecordHandler(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero999fa14b8a3b6c8e155() {

    // Arrange
    final HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final FormulaRecordHandler thisObj = new FormulaRecordHandler(hSSFWorkbook, formatTrackingHSSFListener);

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid9999de5fc06ea296b7d() {

    // Arrange
    final HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final FormulaRecordHandler thisObj = new FormulaRecordHandler(hSSFWorkbook, formatTrackingHSSFListener);

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputVoid999ccaaac3ef8e0f43c() {

    // Arrange
    final HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final FormulaRecordHandler thisObj = new FormulaRecordHandler(hSSFWorkbook, formatTrackingHSSFListener);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(0, 0);

    // Act
    thisObj.processRecord(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse999ced327593ea869ba() {

    // Arrange
    final HSSFWorkbook hSSFWorkbook = new HSSFWorkbook();
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final FormulaRecordHandler thisObj = new FormulaRecordHandler(hSSFWorkbook, formatTrackingHSSFListener);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(0, 0);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
