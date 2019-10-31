package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.SstRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SstRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999019d18de5f2ad6e0() {

    // Act, creating object to test constructor
    final SstRecordHandler actual = new SstRecordHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero999ed76e3fd3e792427() {

    // Arrange
    final SstRecordHandler thisObj = new SstRecordHandler();

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid99920d21e1b422e378c() {

    // Arrange
    final SstRecordHandler thisObj = new SstRecordHandler();

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputVoid9998e6c6fade9fcab95() {

    // Arrange
    final SstRecordHandler thisObj = new SstRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(252, 252);

    // Act
    thisObj.processRecord(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse99949157688163b8a01() {

    // Arrange
    final SstRecordHandler thisObj = new SstRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(252, 252);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
