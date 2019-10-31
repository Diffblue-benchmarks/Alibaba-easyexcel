package com.alibaba.excel.event;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.SyncReadListener;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class SyncReadListenerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e6010bc913bc2747() {

    // Act, creating object to test constructor
    final SyncReadListener actual = new SyncReadListener();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    Assert.assertEquals(arrayList, actual.getList());

  }

  // Test written by Diffblue Cover
  @Test
  public void doAfterAllAnalysedInputNullOutputVoid99977af62f91a192836() {

    // Arrange
    final SyncReadListener thisObj = new SyncReadListener();
    final AnalysisContext arg0 = null;

    // Act
    thisObj.doAfterAllAnalysed(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getListOutput09994e8a3feaad85424e() {

    // Arrange
    final SyncReadListener thisObj = new SyncReadListener();

    // Act
    final List<Object> actual = thisObj.getList();

    // Assert result
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void invokeInputNotNullNullOutputVoid9999a0589d7ad4ca8d4() {

    // Arrange
    final SyncReadListener thisObj = new SyncReadListener();
    final Object arg0 = "aaaaa";
    final AnalysisContext arg1 = null;

    // Act
    thisObj.invoke(arg0, arg1);

    // Assert side effects
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, thisObj.getList());

  }

  // Test written by Diffblue Cover
  @Test
  public void setListInputNotNullOutputVoid9994f2c4f285c082a8a() {

    // Arrange
    final SyncReadListener thisObj = new SyncReadListener();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");

    // Act
    thisObj.setList(arg0);

    // Assert side effects
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, thisObj.getList());

  }
}
