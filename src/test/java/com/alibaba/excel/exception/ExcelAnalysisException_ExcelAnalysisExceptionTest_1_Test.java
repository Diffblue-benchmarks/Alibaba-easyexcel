package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisException_ExcelAnalysisExceptionTest_1_Test {
  @Test
  public void ExcelAnalysisExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable cause = new Throwable();

    // Act
    ExcelAnalysisException excelAnalysisException = new ExcelAnalysisException(message, cause);

    // Assert
    Throwable[] suppressed = excelAnalysisException.getSuppressed();
    String message1 = excelAnalysisException.getMessage();
    Throwable cause1 = excelAnalysisException.getCause();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("aaaaa", excelAnalysisException.getLocalizedMessage());
    String toStringResult = cause1.toString();
    String message2 = cause1.getMessage();
    Throwable cause2 = cause1.getCause();
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(null, cause1.getLocalizedMessage());
    Assert.assertEquals(null, cause2);
    Assert.assertEquals(null, message2);
    Assert.assertEquals("java.lang.Throwable", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
