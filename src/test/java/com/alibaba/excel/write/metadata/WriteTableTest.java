package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteTable;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class WriteTableTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999468870db2cce3496() {

    // Act, creating object to test constructor
    final WriteTable actual = new WriteTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableNo());
    Assert.assertNull(actual.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, actual.getCustomWriteHandlerList());
    Assert.assertNull(actual.getNeedHead());
    Assert.assertNull(actual.getRelativeHeadRowIndex());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableNoOutputVoid9993eaf5509a6f2f215() {

    // Arrange
    final WriteTable thisObj = new WriteTable();

    // Act
    final Integer actual = thisObj.getTableNo();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableStyleOutputVoid999b98d55cd10c2e924() {

    // Arrange
    final WriteTable thisObj = new WriteTable();

    // Act
    final TableStyle actual = thisObj.getTableStyle();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableNoInputNotNullOutputVoid9997daf95a905b54da8() {

    // Arrange
    final WriteTable thisObj = new WriteTable();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setTableNo(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableNo());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableStyleInputNotNullOutputVoid999e0140e9d4376dced() {

    // Arrange
    final WriteTable thisObj = new WriteTable();
    final TableStyle arg0 = new TableStyle();

    // Act
    thisObj.setTableStyle(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTableStyle());
    Assert.assertNull(thisObj.getTableStyle().getTableContentFont());
    Assert.assertNull(thisObj.getTableStyle().getTableContentBackGroundColor());
    Assert.assertNull(thisObj.getTableStyle().getTableHeadBackGroundColor());
    Assert.assertNull(thisObj.getTableStyle().getTableHeadFont());

  }
}
