package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelCommonException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelCommonException_ExcelCommonExceptionTest_2_Test {
  @Test
  public void ExcelCommonExceptionTest() throws Exception {
    // Arrange and Act
    ExcelCommonException excelCommonException = new ExcelCommonException();

    // Assert
    String toStringResult = excelCommonException.toString();
    Throwable[] suppressed = excelCommonException.getSuppressed();
    String message = excelCommonException.getMessage();
    Throwable cause = excelCommonException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelCommonException", toStringResult);
    Assert.assertEquals(null, excelCommonException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
