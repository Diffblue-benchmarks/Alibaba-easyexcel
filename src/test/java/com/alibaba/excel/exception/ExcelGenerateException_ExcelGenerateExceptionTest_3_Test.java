package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelGenerateException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelGenerateException_ExcelGenerateExceptionTest_3_Test {
  @Test
  public void ExcelGenerateExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ExcelGenerateException excelGenerateException = new ExcelGenerateException(message);

    // Assert
    Throwable[] suppressed = excelGenerateException.getSuppressed();
    String message1 = excelGenerateException.getMessage();
    Throwable cause = excelGenerateException.getCause();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("aaaaa", excelGenerateException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
