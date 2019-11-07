package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelGenerateException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelGenerateException_ExcelGenerateExceptionTest_1_Test {
  @Test
  public void ExcelGenerateExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable cause = new Throwable();

    // Act
    ExcelGenerateException excelGenerateException = new ExcelGenerateException(message, cause);

    // Assert
    String toStringResult = excelGenerateException.toString();
    Throwable[] suppressed = excelGenerateException.getSuppressed();
    String message1 = excelGenerateException.getMessage();
    Throwable cause1 = excelGenerateException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelGenerateException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelGenerateException.getLocalizedMessage());
    String toStringResult1 = cause1.toString();
    String message2 = cause1.getMessage();
    Throwable cause2 = cause1.getCause();
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause2);
    Assert.assertEquals(null, message2);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause1.getLocalizedMessage());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
