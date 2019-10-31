package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
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
import java.util.List;
import java.util.Map;



public class SheetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroZeroNullNotNullNotNullOutputNotNull9992e0e7ef537ffb155() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;
    final Class<BaseRowModel> arg2 = null;
    final String arg3 = "aaaaa";
    final ArrayList<List<String>> arg4 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg4.add(arrayList);

    // Act, creating object to test constructor
    final Sheet actual = new Sheet(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableStyle());
    Assert.assertEquals(0, actual.getStartRow());
    Assert.assertEquals("aaaaa", actual.getSheetName());
    Assert.assertEquals(0, actual.getSheetNo());
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add("aaaaa");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, actual.getHead());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNotNull(actual.getAutoWidth());
    Assert.assertEquals(0, actual.getHeadLineMun());
    Assert.assertNull(actual.getClazz());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroZeroNullOutputNotNull999b5ba06e806c25ff1() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;
    final Class<BaseRowModel> arg2 = null;

    // Act, creating object to test constructor
    final Sheet actual = new Sheet(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableStyle());
    Assert.assertEquals(0, actual.getStartRow());
    Assert.assertNull(actual.getSheetName());
    Assert.assertEquals(0, actual.getSheetNo());
    Assert.assertNull(actual.getHead());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNotNull(actual.getAutoWidth());
    Assert.assertEquals(0, actual.getHeadLineMun());
    Assert.assertNull(actual.getClazz());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroZeroOutputNotNull9996f146851eabf46ff() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;

    // Act, creating object to test constructor
    final Sheet actual = new Sheet(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableStyle());
    Assert.assertEquals(0, actual.getStartRow());
    Assert.assertNull(actual.getSheetName());
    Assert.assertEquals(0, actual.getSheetNo());
    Assert.assertNull(actual.getHead());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNotNull(actual.getAutoWidth());
    Assert.assertEquals(0, actual.getHeadLineMun());
    Assert.assertNull(actual.getClazz());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull999f7a9e9d158c86d88() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final Sheet actual = new Sheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableStyle());
    Assert.assertEquals(0, actual.getStartRow());
    Assert.assertNull(actual.getSheetName());
    Assert.assertEquals(0, actual.getSheetNo());
    Assert.assertNull(actual.getHead());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNotNull(actual.getAutoWidth());
    Assert.assertEquals(0, actual.getHeadLineMun());
    Assert.assertNull(actual.getClazz());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoWidthOutputNotNull9991e132a1ac8597fa4() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final Boolean actual = thisObj.getAutoWidth();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getClazzOutputVoid9994184a06c2802387e() {
//
//    // Arrange
//    final Sheet thisObj = new Sheet(0);
//
//    // Act
//    final Class<BaseRowModel> actual = thisObj.getClazz();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnWidthMapOutput0999e2cdcd7d1f5e9968() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final Map<Integer, Integer> actual = thisObj.getColumnWidthMap();

    // Assert result
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadLineMunOutputZero9998c2fb22e1e32b4c1() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final int actual = thisObj.getHeadLineMun();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadOutputVoid9998cb77bd55608a678() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final List<List<String>> actual = thisObj.getHead();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNameOutputVoid999c9496f8f355c547f() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final String actual = thisObj.getSheetName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNoOutputZero9990c98f35548bd36ae() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final int actual = thisObj.getSheetNo();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStartRowOutputZero9990466b09bfab6452e() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final int actual = thisObj.getStartRow();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableStyleOutputVoid9991a20aa6f850a31af() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final TableStyle actual = thisObj.getTableStyle();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoWidthInputNotNullOutputVoid999266feff4b3cf7a8a() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoWidth(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClazzInputNullOutputVoid999aeda0cf7f6673693() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final Class<BaseRowModel> arg0 = null;

    // Act
    thisObj.setClazz(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getHeadLineMun());

  }

  // Test written by Diffblue Cover
  @Test
  public void setColumnWidthMapInputNotNullOutputVoid999ec5b3dd0aaa4b19c() throws InvocationTargetException {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final HashMap<Integer, Integer> arg0 = new HashMap<Integer, Integer>();
    final Integer integer = new Integer(0);
    final Integer integer1 = new Integer(0);
    arg0.put(integer, integer1);

    // Act
    thisObj.setColumnWidthMap(arg0);

    // Assert side effects
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    final Integer integer2 = (Integer) Reflector.getInstance("java.lang.Integer");
    final Integer integer3 = (Integer) Reflector.getInstance("java.lang.Integer");
    hashMap.put(integer3, integer2);
    Assert.assertEquals(hashMap, thisObj.getColumnWidthMap());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadLineMunInputZeroOutputVoid999087bcaf92ae7a118() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final int arg0 = 0;

    // Act
    thisObj.setHeadLineMun(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadInputNotNullOutputVoid9997c5a7d6dc9d05ca6() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg0.add(arrayList);

    // Act
    thisObj.setHead(arg0);

    // Assert side effects
    final ArrayList<List<String>> arrayList1 = new ArrayList<List<String>>();
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add("aaaaa");
    arrayList1.add(arrayList2);
    Assert.assertEquals(arrayList1, thisObj.getHead());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNameInputNotNullOutputVoid99911a996b09e4cc2cf() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSheetName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSheetName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNoInputZeroOutputVoid9999b5177e528633784() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final int arg0 = 0;

    // Act
    thisObj.setSheetNo(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStartRowInputZeroOutputVoid9997b249ffdd03b3a34() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
    final int arg0 = 0;

    // Act
    thisObj.setStartRow(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableStyleInputNotNullOutputVoid99974a986bc764bbcc8() {

    // Arrange
    final Sheet thisObj = new Sheet(0);
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

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull99909f2e1e8def535f1() {

    // Arrange
    final Sheet thisObj = new Sheet(0);

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("Sheet{headLineMun=0, sheetNo=0, sheetName='null', clazz=null, head=null, tableStyle=null, columnWidthMap={}}", actual);

  }
}
