package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContext;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ProcessResultCellHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNotNull9991375c324211754dd() {

    // Arrange
    final AnalysisContext arg0 = null;
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler arg1 = new DefaultCellHandler(null, stylesTable);

    // Act, creating object to test constructor
    final ProcessResultCellHandler actual = new ProcessResultCellHandler(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void endHandleInputNotNullOutputNullPointerException999572c5e8e9ca49628() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, stylesTable);
    final ProcessResultCellHandler thisObj = new ProcessResultCellHandler(null, defaultCellHandler);
    final String arg0 = "row";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.endHandle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startHandleInputNotNullNotNullOutputNullPointerException999f602e56079b7f5b1() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, stylesTable);
    final ProcessResultCellHandler thisObj = new ProcessResultCellHandler(null, defaultCellHandler);
    final String arg0 = "row";
    final AttributesHolder arg1 = new AttributesHolder();
    final AttributesHolder attributesHolder = new AttributesHolder();
    arg1.setAttributes(attributesHolder);
    final AttributesHolder attributesHolder1 = new AttributesHolder();
    arg1.setAttributes(attributesHolder1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.startHandle(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputTrue999585d1653466e6d6f() {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final DefaultCellHandler defaultCellHandler = new DefaultCellHandler(null, stylesTable);
    final ProcessResultCellHandler thisObj = new ProcessResultCellHandler(null, defaultCellHandler);
    final String arg0 = "row";

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
