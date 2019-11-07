package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelDataConvertException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelDataConvertException_ExcelDataConvertExceptionTest_3_Test {
  @Test
  public void ExcelDataConvertExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable cause = new Throwable();

    // Act
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException(message, cause);

    // Assert
    String toStringResult = excelDataConvertException.toString();
    Throwable[] suppressed = excelDataConvertException.getSuppressed();
    String message1 = excelDataConvertException.getMessage();
    Throwable cause1 = excelDataConvertException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelDataConvertException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelDataConvertException.getLocalizedMessage());
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
