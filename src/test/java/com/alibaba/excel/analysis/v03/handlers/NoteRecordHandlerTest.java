package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.NoteRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NoteRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999d71b7280c6bde65() {

    // Act, creating object to test constructor
    final NoteRecordHandler actual = new NoteRecordHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero99976225a05eb975b51() {

    // Arrange
    final NoteRecordHandler thisObj = new NoteRecordHandler();

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid999b97e69f04ce7667d() {

    // Arrange
    final NoteRecordHandler thisObj = new NoteRecordHandler();

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputClassCastException999ba80d47f133f0fba() {

    // Arrange
    final NoteRecordHandler thisObj = new NoteRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(28, 28);

    // Act
    thrown.expect(ClassCastException.class);
    thisObj.processRecord(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse99955e56fe98f9cb0e7() {

    // Arrange
    final NoteRecordHandler thisObj = new NoteRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(28, 28);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
