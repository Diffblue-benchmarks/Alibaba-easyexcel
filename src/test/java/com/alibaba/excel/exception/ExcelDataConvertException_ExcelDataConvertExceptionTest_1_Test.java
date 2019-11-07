package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelDataConvertException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelDataConvertException_ExcelDataConvertExceptionTest_1_Test {
  @Test
  public void ExcelDataConvertExceptionTest() throws Exception {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException(cause);

    // Assert
    String toStringResult = excelDataConvertException.toString();
    Throwable[] suppressed = excelDataConvertException.getSuppressed();
    String message = excelDataConvertException.getMessage();
    Throwable cause1 = excelDataConvertException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelDataConvertException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", excelDataConvertException.getLocalizedMessage());
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
