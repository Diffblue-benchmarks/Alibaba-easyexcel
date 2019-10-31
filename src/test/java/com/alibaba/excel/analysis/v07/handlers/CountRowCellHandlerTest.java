package com.alibaba.excel.analysis.v07.handlers;

import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.context.AnalysisContext;
import org.apache.xmlbeans.impl.piccolo.xml.AttributesHolder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CountRowCellHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull9991daae7f1dfbe7775() {

    // Arrange
    final AnalysisContext arg0 = null;

    // Act, creating object to test constructor
    final CountRowCellHandler actual = new CountRowCellHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void endHandleInputNotNullOutputVoid9991f4be6a7bc690994() {

    // Arrange
    final CountRowCellHandler thisObj = new CountRowCellHandler(null);
    final String arg0 = "dimension";

    // Act
    thisObj.endHandle(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startHandleInputNotNullNotNullOutputNullPointerException9997e4b7c34b648ef8f() {

    // Arrange
    final CountRowCellHandler thisObj = new CountRowCellHandler(null);
    final String arg0 = "dimension";
    final AttributesHolder arg1 = new AttributesHolder();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.startHandle(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportInputNotNullOutputTrue999c3a81c7e36e83edb() {

    // Arrange
    final CountRowCellHandler thisObj = new CountRowCellHandler(null);
    final String arg0 = "dimension";

    // Act
    final boolean actual = thisObj.support(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
