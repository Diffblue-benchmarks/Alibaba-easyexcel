package com.alibaba.excel.analysis.v03.handlers;

import com.alibaba.excel.analysis.v03.handlers.BofRecordHandler;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class BofRecordHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullTrueOutputNotNull99991a09d72f187c137() {

    // Arrange
    final AnalysisContext arg0 = null;
    final ArrayList<ReadSheet> arg1 = new ArrayList<ReadSheet>();
    final ReadSheet readSheet = new ReadSheet();
    arg1.add(readSheet);
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final BofRecordHandler actual = new BofRecordHandler(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getColumn());
    Assert.assertNull(actual.getCellData());
    Assert.assertEquals(-1, actual.getRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderOutputZero99995f492203d02690e() {

    // Arrange
    final ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    final ReadSheet readSheet = new ReadSheet();
    arrayList.add(readSheet);
    final BofRecordHandler thisObj = new BofRecordHandler(null, arrayList, true);

    // Act
    final int actual = thisObj.getOrder();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputVoid999d1eeffb12b9c2686() {

    // Arrange
    final ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    final ReadSheet readSheet = new ReadSheet();
    arrayList.add(readSheet);
    final BofRecordHandler thisObj = new BofRecordHandler(null, arrayList, true);

    // Act
    thisObj.init();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processRecordInputNotNullOutputVoid999bc2b506eafd23ba8() {

    // Arrange
    final ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    final ReadSheet readSheet = new ReadSheet();
    arrayList.add(readSheet);
    final BofRecordHandler thisObj = new BofRecordHandler(null, arrayList, true);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(0, 0);

    // Act
    thisObj.processRecord(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse99975c104ff3c6adff6() {

    // Arrange
    final ArrayList<ReadSheet> arrayList = new ArrayList<ReadSheet>();
    final ReadSheet readSheet = new ReadSheet();
    arrayList.add(readSheet);
    final BofRecordHandler thisObj = new BofRecordHandler(null, arrayList, true);
    final LastCellOfRowDummyRecord arg0 = new LastCellOfRowDummyRecord(0, 0);

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
