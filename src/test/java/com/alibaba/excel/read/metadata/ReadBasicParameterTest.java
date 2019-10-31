package com.alibaba.excel.read.metadata;

import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadBasicParameter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ReadBasicParameterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999561fc9fe0ce5ccc1() {

    // Act, creating object to test constructor
    final ReadBasicParameter actual = new ReadBasicParameter();

    // Assert result
    Assert.assertNotNull(actual);
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
  public void getCustomReadListenerListOutput0999645e37fda9a3e7b8() {

    // Arrange
    final ReadBasicParameter thisObj = new ReadBasicParameter();

    // Act
    final List<ReadListener> actual = thisObj.getCustomReadListenerList();

    // Assert result
    final ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadRowNumberOutputVoid99998b9bfd39b3f805a() {

    // Arrange
    final ReadBasicParameter thisObj = new ReadBasicParameter();

    // Act
    final Integer actual = thisObj.getHeadRowNumber();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCustomReadListenerListInputNotNullOutputVoid999638fc8d8f5e62664() {

    // Arrange
    final ReadBasicParameter thisObj = new ReadBasicParameter();
    final ArrayList<ReadListener> arg0 = new ArrayList<ReadListener>();
    final SyncReadListener syncReadListener = new SyncReadListener();
    arg0.add(syncReadListener);

    // Act
    thisObj.setCustomReadListenerList(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getCustomReadListenerList());
    Assert.assertEquals(1, thisObj.getCustomReadListenerList().size());
    Assert.assertNotNull(thisObj.getCustomReadListenerList().get(0));
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    Assert.assertEquals(arrayList, ((SyncReadListener) thisObj.getCustomReadListenerList().get(0)).getList());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadRowNumberInputNotNullOutputVoid99971d0bff3eba2fcd6() {

    // Arrange
    final ReadBasicParameter thisObj = new ReadBasicParameter();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setHeadRowNumber(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHeadRowNumber());

  }
}
