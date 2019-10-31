package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ReadSheetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b4129bb1d589056d() {

    // Act, creating object to test constructor
    final ReadSheet actual = new ReadSheet();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSheetName());
    Assert.assertNull(actual.getSheetNo());
    final ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    Assert.assertEquals(arrayList, actual.getCustomReadListenerList());
    Assert.assertNull(actual.getHeadRowNumber());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999724dd57836dcdf5a() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ReadSheet actual = new ReadSheet(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getSheetName());
    Assert.assertNotNull(actual.getSheetNo());
    final ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    Assert.assertEquals(arrayList, actual.getCustomReadListenerList());
    Assert.assertNull(actual.getHeadRowNumber());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9997eee74d1e18cb32a() {

    // Arrange
    final Integer arg0 = new Integer(1);

    // Act, creating object to test constructor
    final ReadSheet actual = new ReadSheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSheetName());
    Assert.assertNotNull(actual.getSheetNo());
    final ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    Assert.assertEquals(arrayList, actual.getCustomReadListenerList());
    Assert.assertNull(actual.getHeadRowNumber());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNameOutputVoid9995b6d30a44f58e868() {

    // Arrange
    final ReadSheet thisObj = new ReadSheet();

    // Act
    final String actual = thisObj.getSheetName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNoOutputVoid9997e6c0a7e5f5dcef2() {

    // Arrange
    final ReadSheet thisObj = new ReadSheet();

    // Act
    final Integer actual = thisObj.getSheetNo();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNameInputNotNullOutputVoid999e302a10e6f6ab77d() {

    // Arrange
    final ReadSheet thisObj = new ReadSheet();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSheetName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSheetName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNoInputNotNullOutputVoid999f47cbffc608c9e1f() {

    // Arrange
    final ReadSheet thisObj = new ReadSheet();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setSheetNo(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getSheetNo());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull99957421a98e701c406() {
//
//    // Arrange
//    final ReadSheet thisObj = new ReadSheet();
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("ReadSheet{sheetNo=null, sheetName='null'} com.alibaba.excel.read.metadata.ReadSheet@26ad6771", actual);
//
//  }
}
