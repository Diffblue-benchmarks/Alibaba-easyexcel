package com.alibaba.excel.metadata.property;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.util.ArrayList;



public class ExcelContentPropertyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991f04e3a603e2b7e3() {

    // Act, creating object to test constructor
    final ExcelContentProperty actual = new ExcelContentProperty();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDateTimeFormatProperty());
    Assert.assertNull(actual.getConverter());
    Assert.assertNull(actual.getField());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getNumberFormatProperty());

  }

  // Test written by Diffblue Cover
  @Test
  public void getConverterOutputVoid9994f1ffe022ca65d72() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();

    // Act
    final Converter actual = thisObj.getConverter();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateTimeFormatPropertyOutputVoid999174996ddb4156aad() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();

    // Act
    final DateTimeFormatProperty actual = thisObj.getDateTimeFormatProperty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldOutputVoid999fc675f664c3bc060() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();

    // Act
    final Field actual = thisObj.getField();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadOutputVoid999e22754e2ed130482() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();

    // Act
    final Head actual = thisObj.getHead();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNumberFormatPropertyOutputVoid999b8747a650d59c129() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();

    // Act
    final NumberFormatProperty actual = thisObj.getNumberFormatProperty();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setConverterInputNotNullOutputVoid99952b46072a9ca64ac() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    thisObj.setConverter(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getConverter());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateTimeFormatPropertyInputNotNullOutputVoid999b2103ac9134c2573() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();
    final Boolean boolean1 = new Boolean(true);
    final DateTimeFormatProperty arg0 = new DateTimeFormatProperty("aaaaa", boolean1);

    // Act
    thisObj.setDateTimeFormatProperty(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDateTimeFormatProperty());
    Assert.assertEquals("aaaaa", thisObj.getDateTimeFormatProperty().getFormat());
    Assert.assertNotNull(thisObj.getDateTimeFormatProperty().getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFieldInputNullOutputVoid999635727ab08bb86da() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();
    final Field arg0 = null;

    // Act
    thisObj.setField(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadInputNotNullOutputVoid9990bb7bf71c6fb9af9() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();
    final Integer integer = new Integer(1);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final Boolean boolean1 = new Boolean(true);
    final Head arg0 = new Head(integer, "aaaaa", arrayList, null, boolean1);

    // Act
    thisObj.setHead(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHead());
    Assert.assertNull(thisObj.getHead().getColumnWidthProperty());
    Assert.assertNotNull(thisObj.getHead().getColumnIndex());
    Assert.assertNull(thisObj.getHead().getForceIndex());
    Assert.assertEquals("aaaaa", thisObj.getHead().getFieldName());
    Assert.assertNotNull(thisObj.getHead().getForceName());
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    Assert.assertEquals(arrayList1, thisObj.getHead().getHeadNameList());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNumberFormatPropertyInputNotNullOutputVoid9991eade0873b6f3c73() {

    // Arrange
    final ExcelContentProperty thisObj = new ExcelContentProperty();
    final NumberFormatProperty arg0 = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    thisObj.setNumberFormatProperty(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getNumberFormatProperty());
    Assert.assertEquals("aaaaa", thisObj.getNumberFormatProperty().getFormat());
    Assert.assertEquals(RoundingMode.UP, thisObj.getNumberFormatProperty().getRoundingMode());

  }
}
