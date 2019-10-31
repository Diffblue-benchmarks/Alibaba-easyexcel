package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.MissingCellDummyRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MissingCellDummyRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a11cee602fc48d05() {

    // Act, creating object to test constructor
    final MissingCellDummyRecordHandler actual = new MissingCellDummyRecordHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputPositive99914ecab697cbfd360() {

    // Arrange
    final MissingCellDummyRecordHandler thisObj = new MissingCellDummyRecordHandler();

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid99999ea80ae8f25f9aa() {

    // Arrange
    final MissingCellDummyRecordHandler thisObj = new MissingCellDummyRecordHandler();

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputClassCastException999dad4e4908c9c9ea5() {

    // Arrange
    final MissingCellDummyRecordHandler thisObj = new MissingCellDummyRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(1, 1);

    // Act
    thrown.expect(ClassCastException.class);
    thisObj.processRecord(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse999b9e8ebd2313bdfda() {

    // Arrange
    final MissingCellDummyRecordHandler thisObj = new MissingCellDummyRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(1, 1);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
