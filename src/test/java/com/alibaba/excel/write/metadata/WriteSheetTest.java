package com.alibaba.excel.write.metadata;

import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class WriteSheetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c2b1182805210faf() {

    // Act, creating object to test constructor
    final WriteSheet actual = new WriteSheet();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNull(actual.getSheetNo());
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
  public void getColumnWidthMapOutput0999a0d28a5dda58628b() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();

    // Act
    final Map<Integer, Integer> actual = thisObj.getColumnWidthMap();

    // Assert result
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNameOutputVoid999944f33f924082a36() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();

    // Act
    final String actual = thisObj.getSheetName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNoOutputVoid99909678f920f066f87() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();

    // Act
    final Integer actual = thisObj.getSheetNo();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableStyleOutputVoid999747d17079904515a() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();

    // Act
    final TableStyle actual = thisObj.getTableStyle();

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setColumnWidthMapInputNotNullOutputVoid999c643f6df8998ca56() throws InvocationTargetException {
//
//    // Arrange
//    final WriteSheet thisObj = new WriteSheet();
//    final HashMap<Integer, Integer> arg0 = new HashMap<Integer, Integer>();
//    final Integer integer = new Integer(1);
//    final Integer integer1 = new Integer(1);
//    arg0.put(integer, integer1);
//
//    // Act
//    thisObj.setColumnWidthMap(arg0);
//
//    // Assert side effects
//    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//    final Integer integer2 = (Integer) Reflector.getInstance("java.lang.Integer");
//    final Integer integer3 = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer3, integer2);
//    Assert.assertEquals(hashMap, thisObj.getColumnWidthMap());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNameInputNotNullOutputVoid999567422636ce00ddf() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSheetName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSheetName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNoInputNotNullOutputVoid99989c06598d12df512() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setSheetNo(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getSheetNo());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableStyleInputNotNullOutputVoid9998af32ce4bce84882() {

    // Arrange
    final WriteSheet thisObj = new WriteSheet();
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

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull9993fabf5c1b37c962f() {
//
//    // Arrange
//    final WriteSheet thisObj = new WriteSheet();
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("WriteSheet{sheetNo=null, sheetName='null'} com.alibaba.excel.write.metadata.WriteSheet@3da7c48b", actual);
//
//  }
}
