package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelDataConvertException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelDataConvertException_ExcelDataConvertExceptionTest_2_Test {
  @Test
  public void ExcelDataConvertExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException(message);

    // Assert
    String toStringResult = excelDataConvertException.toString();
    Throwable[] suppressed = excelDataConvertException.getSuppressed();
    String message1 = excelDataConvertException.getMessage();
    Throwable cause = excelDataConvertException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelDataConvertException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelDataConvertException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
