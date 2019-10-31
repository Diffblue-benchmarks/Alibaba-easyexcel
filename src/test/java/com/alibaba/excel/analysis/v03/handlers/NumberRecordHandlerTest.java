package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.XlsListSheetListener;
import com.alibaba.excel.analysis.v03.handlers.NumberRecordHandler;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999ec67e64404ab5119() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener arg0 = new FormatTrackingHSSFListener(xlsListSheetListener);

    // Act, creating object to test constructor
    final NumberRecordHandler actual = new NumberRecordHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero9992634bfed9309b0d6() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final NumberRecordHandler thisObj = new NumberRecordHandler(formatTrackingHSSFListener);

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid999d18e79e822c7d874() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final NumberRecordHandler thisObj = new NumberRecordHandler(formatTrackingHSSFListener);

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputClassCastException9991ecc16e21eeeee3b() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final NumberRecordHandler thisObj = new NumberRecordHandler(formatTrackingHSSFListener);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(515, 515);

    // Act
    thrown.expect(ClassCastException.class);
    thisObj.processRecord(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse999d91f298cbc115fba() {

    // Arrange
    final POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem();
    final XlsListSheetListener xlsListSheetListener = new XlsListSheetListener(null, pOIFSFileSystem);
    final FormatTrackingHSSFListener formatTrackingHSSFListener = new FormatTrackingHSSFListener(xlsListSheetListener);
    final NumberRecordHandler thisObj = new NumberRecordHandler(formatTrackingHSSFListener);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(515, 515);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
