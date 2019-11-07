package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelCommonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelCommonException_ExcelCommonExceptionTest_1_Test {
  @Test
  public void ExcelCommonExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable cause = new Throwable();

    // Act
    ExcelCommonException excelCommonException = new ExcelCommonException(message, cause);

    // Assert
    String toStringResult = excelCommonException.toString();
    Throwable[] suppressed = excelCommonException.getSuppressed();
    String message1 = excelCommonException.getMessage();
    Throwable cause1 = excelCommonException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelCommonException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelCommonException.getLocalizedMessage());
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
