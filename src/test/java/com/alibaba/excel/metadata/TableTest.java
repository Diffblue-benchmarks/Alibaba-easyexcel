package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class TableTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99973aa3990da50237f() {

    // Arrange
    final Integer arg0 = new Integer(1);

    // Act, creating object to test constructor
    final Table actual = new Table(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getClazz());
    Assert.assertEquals(1, actual.getTableNo());
    Assert.assertNull(actual.getTableStyle());

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getClazzOutputVoid999337da8d6ffc355ee() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Table thisObj = new Table(integer);
//
//    // Act
//    final Class<BaseRowModel> actual = thisObj.getClazz();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadOutputVoid99945aee7a05d918114() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);

    // Act
    final List<List<String>> actual = thisObj.getHead();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableNoOutputPositive9996942c1185d372aab() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);

    // Act
    final int actual = thisObj.getTableNo();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableStyleOutputVoid99970d9c8443c349605() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);

    // Act
    final TableStyle actual = thisObj.getTableStyle();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClazzInputNullOutputVoid999d7d2d0ea65a703a1() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);
    final Class<BaseRowModel> arg0 = null;

    // Act
    thisObj.setClazz(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadInputNotNullOutputVoid99944b3d50cf61c360f() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);
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
  public void setTableNoInputPositiveOutputVoid999c864815cbd7af2f3() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);
    final int arg0 = 1;

    // Act
    thisObj.setTableNo(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTableStyleInputNotNullOutputVoid99975b218a20cf65691() {

    // Arrange
    final Integer integer = new Integer(1);
    final Table thisObj = new Table(integer);
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
