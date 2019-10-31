package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.RkRecordHandler;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RkRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99927f8a4620dbe73fd() {

    // Act, creating object to test constructor
    final RkRecordHandler actual = new RkRecordHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero9992b19fd1ba73e26c9() {

    // Arrange
    final RkRecordHandler thisObj = new RkRecordHandler();

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid999623a1d7e5622fccf() {

    // Arrange
    final RkRecordHandler thisObj = new RkRecordHandler();

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputClassCastException999b2486ec69a47023a() {

    // Arrange
    final RkRecordHandler thisObj = new RkRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(638, 638);

    // Act
    thrown.expect(ClassCastException.class);
    thisObj.processRecord(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse9990c7f4f60b350b695() {

    // Arrange
    final RkRecordHandler thisObj = new RkRecordHandler();
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(638, 638);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
