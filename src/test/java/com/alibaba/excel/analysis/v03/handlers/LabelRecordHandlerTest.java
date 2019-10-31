package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.LabelRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LabelRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999b3dd08e56f4ba39() {

    // Act, creating object to test constructor
    final LabelRecordHandler actual = new LabelRecordHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero9991e04cdc77176b221() {

    // Arrange
    final LabelRecordHandler thisObj = new LabelRecordHandler();

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid9994372ce9a88b5afa0() {

    // Arrange
    final LabelRecordHandler thisObj = new LabelRecordHandler();

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputClassCastException99968d2fdd673fafe50() {

    // Arrange
    final LabelRecordHandler thisObj = new LabelRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(516, 516);

    // Act
    thrown.expect(ClassCastException.class);
    thisObj.processRecord(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse9992fd88bf7c2343e6e() {

    // Arrange
    final LabelRecordHandler thisObj = new LabelRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(516, 516);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
