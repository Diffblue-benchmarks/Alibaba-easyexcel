package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import com.diffblue.deeptestutils.Reflector;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;



public class BaseRowModelTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void addStyleInputNotNullNullOutputVoid999e1d96d3e57e233b0() throws InvocationTargetException {
//
//    // Arrange
//    final BaseRowModel thisObj = new BaseRowModel();
//    final Integer arg0 = new Integer(1);
//    final CellStyle arg1 = null;
//
//    // Act
//    thisObj.addStyle(arg0, arg1);
//
//    // Assert side effects
//    final HashMap<Integer, CellStyle> hashMap = new HashMap<Integer, CellStyle>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer, null);
//    Assert.assertEquals(hashMap, thisObj.getCellStyleMap());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e9ea83eaf82ac8d1() {

    // Act, creating object to test constructor
    final BaseRowModel actual = new BaseRowModel();

    // Assert result
    Assert.assertNotNull(actual);
    final HashMap<Integer, CellStyle> hashMap = new HashMap<Integer, CellStyle>();
    Assert.assertEquals(hashMap, actual.getCellStyleMap());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCellStyleMapOutput099919a8263ea8c1dd2c() {

    // Arrange
    final BaseRowModel thisObj = new BaseRowModel();

    // Act
    final Map<Integer, CellStyle> actual = thisObj.getCellStyleMap();

    // Assert result
    final HashMap<Integer, CellStyle> hashMap = new HashMap<Integer, CellStyle>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStyleInputNotNullOutputVoid99946ffb8cb0fac8988() {

    // Arrange
    final BaseRowModel thisObj = new BaseRowModel();
    final Integer arg0 = new Integer(1);

    // Act
    final CellStyle actual = thisObj.getStyle(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setCellStyleMapInputNotNullOutputVoid9998db2ea009c0d3306() throws InvocationTargetException {
//
//    // Arrange
//    final BaseRowModel thisObj = new BaseRowModel();
//    final HashMap<Integer, CellStyle> arg0 = new HashMap<Integer, CellStyle>();
//    final Integer integer = new Integer(1);
//    arg0.put(integer, null);
//
//    // Act
//    thisObj.setCellStyleMap(arg0);
//
//    // Assert side effects
//    final HashMap<Integer, CellStyle> hashMap = new HashMap<Integer, CellStyle>();
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer1, null);
//    Assert.assertEquals(hashMap, thisObj.getCellStyleMap());
//
//  }
}
