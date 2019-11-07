package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelCommonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelCommonException_ExcelCommonExceptionTest_4_Test {
  @Test
  public void ExcelCommonExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ExcelCommonException excelCommonException = new ExcelCommonException(message);

    // Assert
    String toStringResult = excelCommonException.toString();
    Throwable[] suppressed = excelCommonException.getSuppressed();
    String message1 = excelCommonException.getMessage();
    Throwable cause = excelCommonException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelCommonException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelCommonException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
