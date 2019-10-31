package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxRowHandler;
import com.alibaba.excel.context.AnalysisContext;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.xml.sax.SAXException;



public class XlsxRowHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void charactersInput8PositivePositiveOutputVoid999483f162e2a2a1d25() throws SAXException {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final XlsxRowHandler thisObj = new XlsxRowHandler(null, stylesTable);
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 1;
    final int arg2 = 655361;

    // Act
    thisObj.characters(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNotNull999a9a20938fe5bc341() {

    // Arrange
    final AnalysisContext arg0 = null;
    final StylesTable arg1 = new StylesTable();

    // Act, creating object to test constructor
    final XlsxRowHandler actual = new XlsxRowHandler(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void endElementInputNotNullNotNullNotNullOutputVoid999008f95af060e6f5f() throws SAXException {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final XlsxRowHandler thisObj = new XlsxRowHandler(null, stylesTable);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "akaaa";

    // Act
    thisObj.endElement(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startElementInputNotNullNotNullNotNullNotNullOutputVoid9990be4d7de90525250() throws SAXException {

    // Arrange
    final StylesTable stylesTable = new StylesTable();
    final XlsxRowHandler thisObj = new XlsxRowHandler(null, stylesTable);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "akaaa";
    final AttributesHolder arg3 = new AttributesHolder();

    // Act
    thisObj.startElement(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
