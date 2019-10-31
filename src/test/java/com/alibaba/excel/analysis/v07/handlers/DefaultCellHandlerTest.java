package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;



public class DefaultCellHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void appendCurrentCellValueInput8PositivePositiveOutputVoid9998d5fa99074cc338c() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 1;
    final int arg2 = 655361;

    // Act
    thisObj.appendCurrentCellValue(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearResultOutputVoid999ded97aa42e0379d6() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);

    // Act
    thisObj.clearResult();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNotNull99978a7094106d47926() {

    // Arrange
    final AnalysisContext arg0 = null;
    final StylesTable arg1 = new StylesTable();

    // Act, creating object to test constructor
    final DefaultCellHandler actual = new DefaultCellHandler(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    final TreeMap<Integer, CellData> treeMap = new TreeMap<Integer, CellData>();
    Assert.assertEquals(treeMap, actual.getCurRowContent());

  }

  // Test written by Diffblue Cover
  @Test
  public void endHandleInputNotNullOutputNoSuchElementException999e3eee0cd859b1e40() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);
    final String arg0 = "Cannot set values now";

    // Act
    thrown.expect(NoSuchElementException.class);
    thisObj.endHandle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurRowContentOutput09998e53a94a7ce8ab90() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);

    // Act
    final Map<Integer, CellData> actual = thisObj.getCurRowContent();

    // Assert result
    final TreeMap<Integer, CellData> treeMap = new TreeMap<Integer, CellData>();
    Assert.assertEquals(treeMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void startHandleInputNotNullNotNullOutputVoid999b5d97db943872d13() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);
    final String arg0 = "Cannot set values now";
    final AttributesHolder arg1 = new AttributesHolder();

    // Act
    thisObj.startHandle(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputFalse999ed1a6f78c2f1c11a() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler thisObj = new DefaultCellHandler(null, stylesTable);
    final String arg0 = "Cannot set values now";

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
