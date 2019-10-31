package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class HeadTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullNotNullNotNullOutputNotNull999a32b9b5052d7903b() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final String arg1 = "aaaaa";
    final ArrayList<String> arg2 = new ArrayList<String>();
    arg2.add("aaaaa");
    final Boolean arg3 = new Boolean(true);
    final Boolean arg4 = new Boolean(true);

    // Act, creating object to test constructor
    final Head actual = new Head(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getColumnWidthProperty());
    Assert.assertNotNull(actual.getColumnIndex());
    Assert.assertNotNull(actual.getForceIndex());
    Assert.assertEquals("aaaaa", actual.getFieldName());
    Assert.assertNotNull(actual.getForceName());
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, actual.getHeadNameList());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnIndexOutputNotNull99993227f2b80ce10f1() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final Integer actual = thisObj.getColumnIndex();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnWidthPropertyOutputVoid999f1f6abbd17d6774b() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final ColumnWidthProperty actual = thisObj.getColumnWidthProperty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldNameOutputNotNull9994b519a1cc1dbfe29() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final String actual = thisObj.getFieldName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getForceIndexOutputNotNull99953ee7f60c8098d39() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final Boolean actual = thisObj.getForceIndex();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getForceNameOutputNotNull999488806d195a1d853() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final Boolean actual = thisObj.getForceName();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadNameListOutput1999cd700f0b4e34d661() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);

    // Act
    final List<String> actual = thisObj.getHeadNameList();

    // Assert result
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    Assert.assertEquals(arrayList1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setColumnIndexInputNotNullOutputVoid999625715d6d1578f8b() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final Integer arg0 = integer;

    // Act
    thisObj.setColumnIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setColumnWidthPropertyInputNotNullOutputVoid999198163a5617fb906() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final Integer integer1 = new Integer(1);
    final ColumnWidthProperty arg0 = new ColumnWidthProperty(integer1);

    // Act
    thisObj.setColumnWidthProperty(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColumnWidthProperty());
    Assert.assertNotNull(thisObj.getColumnWidthProperty().getWidth());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFieldNameInputNotNullOutputVoid999ea5de30dc14abed3() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setFieldName(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setForceIndexInputNotNullOutputVoid9997f7b0bf93c530e2a() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final Boolean arg0 = boolean2;

    // Act
    thisObj.setForceIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setForceNameInputNotNullOutputVoid999ff49ae994208ccaf() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final Boolean arg0 = boolean2;

    // Act
    thisObj.setForceName(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadNameListInputNotNullOutputVoid99961f863940eba91fa() {

    // Arrange
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Boolean boolean2 = new Boolean(true);
    final Head thisObj = new Head(integer, "aaaaa", arrayList, boolean1, boolean2);
    final ArrayList<String> arg0 = new ArrayList<String>();
    arg0.add("aaaaa");

    // Act
    thisObj.setHeadNameList(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
