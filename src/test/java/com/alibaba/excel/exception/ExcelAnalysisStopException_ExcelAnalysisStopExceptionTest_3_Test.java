package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisStopException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisStopException_ExcelAnalysisStopExceptionTest_3_Test {
  @Test
  public void ExcelAnalysisStopExceptionTest() throws Exception {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ExcelAnalysisStopException excelAnalysisStopException = new ExcelAnalysisStopException(cause);

    // Assert
    Throwable[] suppressed = excelAnalysisStopException.getSuppressed();
    String message = excelAnalysisStopException.getMessage();
    Throwable cause1 = excelAnalysisStopException.getCause();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("java.lang.Throwable", excelAnalysisStopException.getLocalizedMessage());
    String toStringResult = cause1.toString();
    String message1 = cause1.getMessage();
    Throwable cause2 = cause1.getCause();
    Assert.assertEquals("java.lang.Throwable", message);
    Assert.assertEquals(null, cause1.getLocalizedMessage());
    Assert.assertEquals(null, cause2);
    Assert.assertEquals(null, message1);
    Assert.assertEquals("java.lang.Throwable", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
