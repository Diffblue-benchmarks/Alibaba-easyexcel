package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisStopException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExcelAnalysisStopExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99927ca48925135fdaa() {

    // Act, creating object to test constructor
    final ExcelAnalysisStopException actual = new ExcelAnalysisStopException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99945fab80309bfbd6a() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final ExcelAnalysisStopException actual = new ExcelAnalysisStopException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999ddd2a90c5ad37a05() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ExcelAnalysisStopException actual = new ExcelAnalysisStopException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995c599b56cdf5359f() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final ExcelAnalysisStopException actual = new ExcelAnalysisStopException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
