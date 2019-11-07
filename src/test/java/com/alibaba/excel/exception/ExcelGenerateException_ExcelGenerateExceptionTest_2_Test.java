package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelGenerateException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelGenerateException_ExcelGenerateExceptionTest_2_Test {
  @Test
  public void ExcelGenerateExceptionTest() throws Exception {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ExcelGenerateException excelGenerateException = new ExcelGenerateException(cause);

    // Assert
    String toStringResult = excelGenerateException.toString();
    Throwable[] suppressed = excelGenerateException.getSuppressed();
    String message = excelGenerateException.getMessage();
    Throwable cause1 = excelGenerateException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelGenerateException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", excelGenerateException.getLocalizedMessage());
    String toStringResult1 = cause1.toString();
    String message1 = cause1.getMessage();
    Throwable cause2 = cause1.getCause();
    Assert.assertEquals("java.lang.Throwable", message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause2);
    Assert.assertEquals(null, message1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause1.getLocalizedMessage());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
