package com.alibaba.excel.metadata.property;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.ExcelHeadProperty;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class ExcelHeadPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullNotNullOutputNotNull999ec5f79db9c4874d4() throws InvocationTargetException {

    // Arrange
    final Class arg0 = null;
    final ArrayList<List<String>> arg1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("' must be inconsistent");
    arg1.add(arrayList);
    final Boolean arg2 = new Boolean(true);

    // Act, creating object to test constructor
    final ExcelHeadProperty actual = new ExcelHeadProperty(arg0, arg1, arg2);

    // Assert side effects
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("' must be inconsistent");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHeadClazz());
    final TreeMap<Integer, ExcelContentProperty> treeMap = new TreeMap<Integer, ExcelContentProperty>();
    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
    treeMap.put(integer, null);
    Assert.assertEquals(treeMap, actual.getContentPropertyMap());
    Assert.assertEquals(HeadKindEnum.STRING, actual.getHeadKind());
    Assert.assertNotNull(actual.getHeadMap());
    Assert.assertEquals(1, actual.getHeadMap().size());
    Assert.assertNotNull(actual.getHeadMap().get(integer));
    Assert.assertNull(actual.getHeadMap().get(integer).getColumnWidthProperty());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getColumnIndex());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getForceIndex());
    Assert.assertNull(actual.getHeadMap().get(integer).getFieldName());
    Assert.assertNotNull(actual.getHeadMap().get(integer).getForceName());
    final ArrayList<String> arrayList3 = new ArrayList<String>();
    arrayList3.add("' must be inconsistent");
    Assert.assertEquals(arrayList3, actual.getHeadMap().get(integer).getHeadNameList());
    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
    Assert.assertEquals(hashMap, actual.getIgnoreMap());
    Assert.assertEquals(1, actual.getHeadRowNumber());

  }

  // Test written by Diffblue Cover
  @Test
  public void getContentPropertyMapOutput19999e3a6877ee989d86() throws InvocationTargetException {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final Map<Integer, ExcelContentProperty> actual = thisObj.getContentPropertyMap();

    // Assert result
    final TreeMap<Integer, ExcelContentProperty> treeMap = new TreeMap<Integer, ExcelContentProperty>();
    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
    treeMap.put(integer, null);
    Assert.assertEquals(treeMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadClazzOutputVoid999b055ed683e738a58() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final Class actual = thisObj.getHeadClazz();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadKindOutputString999f9462f9d504b439d() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final HeadKindEnum actual = thisObj.getHeadKind();

    // Assert result
    Assert.assertEquals(HeadKindEnum.STRING, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadMapOutput19995c3cd51e841e32a0() throws InvocationTargetException {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final Map<Integer, Head> actual = thisObj.getHeadMap();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
    Assert.assertNotNull(actual.get(integer));
    Assert.assertNull(actual.get(integer).getColumnWidthProperty());
    Assert.assertNotNull(actual.get(integer).getColumnIndex());
    Assert.assertNotNull(actual.get(integer).getForceIndex());
    Assert.assertNull(actual.get(integer).getFieldName());
    Assert.assertNotNull(actual.get(integer).getForceName());
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("' must be inconsistent");
    Assert.assertEquals(arrayList2, actual.get(integer).getHeadNameList());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadRowNumberOutputPositive999eb37658d6bb1b01a() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final int actual = thisObj.getHeadRowNumber();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIgnoreMapOutput0999fe1ae3efd7010cc6() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final Map<String, Field> actual = thisObj.getIgnoreMap();

    // Assert result
    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasHeadOutputTrue999a8a2a1aac0d42230() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);

    // Act
    final boolean actual = thisObj.hasHead();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setContentPropertyMapInputNotNullOutputVoid99962f0d154ea296dba() throws InvocationTargetException {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final HashMap<Integer, ExcelContentProperty> arg0 = new HashMap<Integer, ExcelContentProperty>();
    final Integer integer = new Integer(0);
    final ExcelContentProperty excelContentProperty = new ExcelContentProperty();
    arg0.put(integer, excelContentProperty);

    // Act
    thisObj.setContentPropertyMap(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getContentPropertyMap());
    Assert.assertEquals(1, thisObj.getContentPropertyMap().size());
    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
    Assert.assertNotNull(thisObj.getContentPropertyMap().get(integer1));
    Assert.assertNull(thisObj.getContentPropertyMap().get(integer1).getDateTimeFormatProperty());
    Assert.assertNull(thisObj.getContentPropertyMap().get(integer1).getConverter());
    Assert.assertNull(thisObj.getContentPropertyMap().get(integer1).getField());
    Assert.assertNull(thisObj.getContentPropertyMap().get(integer1).getHead());
    Assert.assertNull(thisObj.getContentPropertyMap().get(integer1).getNumberFormatProperty());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadClazzInputNullOutputVoid999d422a982c4f78e06() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final Class arg0 = null;

    // Act
    thisObj.setHeadClazz(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadKindInputNoneOutputVoid999dc35718bf26f7877() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final HeadKindEnum arg0 = HeadKindEnum.NONE;

    // Act
    thisObj.setHeadKind(arg0);

    // Assert side effects
    Assert.assertEquals(HeadKindEnum.NONE, thisObj.getHeadKind());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadMapInputNotNullOutputVoid9994817ffb50c861148() throws InvocationTargetException {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final HashMap<Integer, Head> arg0 = new HashMap<Integer, Head>();
    final Integer integer = new Integer(0);
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("' must be inconsistent");
    final Boolean boolean2 = new Boolean(true);
    final Head head = new Head(null, "' must be inconsistent", arrayList2, boolean2, boolean1);
    arg0.put(integer, head);

    // Act
    thisObj.setHeadMap(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHeadMap());
    Assert.assertEquals(1, thisObj.getHeadMap().size());
    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
    Assert.assertNotNull(thisObj.getHeadMap().get(integer1));
    Assert.assertNull(thisObj.getHeadMap().get(integer1).getColumnWidthProperty());
    Assert.assertNull(thisObj.getHeadMap().get(integer1).getColumnIndex());
    Assert.assertNotNull(thisObj.getHeadMap().get(integer1).getForceIndex());
    Assert.assertEquals("' must be inconsistent", thisObj.getHeadMap().get(integer1).getFieldName());
    Assert.assertNotNull(thisObj.getHeadMap().get(integer1).getForceName());
    final ArrayList<String> arrayList3 = new ArrayList<String>();
    arrayList3.add("' must be inconsistent");
    Assert.assertEquals(arrayList3, thisObj.getHeadMap().get(integer1).getHeadNameList());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadRowNumberInputZeroOutputVoid9993cb3242395f2f05f() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final int arg0 = 0;

    // Act
    thisObj.setHeadRowNumber(arg0);

    // Assert side effects
    Assert.assertEquals(0, thisObj.getHeadRowNumber());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIgnoreMapInputNotNullOutputVoid999fb0f88962349365e() {

    // Arrange
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("' must be inconsistent");
    arrayList.add(arrayList1);
    final Boolean boolean1 = new Boolean(true);
    final ExcelHeadProperty thisObj = new ExcelHeadProperty(null, arrayList, boolean1);
    final HashMap<String, Field> arg0 = new HashMap<String, Field>();
    arg0.put("' must be inconsistent", null);

    // Act
    thisObj.setIgnoreMap(arg0);

    // Assert side effects
    final HashMap<String, Field> hashMap = new HashMap<String, Field>();
    hashMap.put("' must be inconsistent", null);
    Assert.assertEquals(hashMap, thisObj.getIgnoreMap());

  }
}
