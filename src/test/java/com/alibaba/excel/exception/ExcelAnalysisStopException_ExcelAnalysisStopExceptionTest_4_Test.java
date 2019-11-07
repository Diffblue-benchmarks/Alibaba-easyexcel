package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisStopException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisStopException_ExcelAnalysisStopExceptionTest_4_Test {
  @Test
  public void ExcelAnalysisStopExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable cause = new Throwable();

    // Act
    ExcelAnalysisStopException excelAnalysisStopException = new ExcelAnalysisStopException(message, cause);

    // Assert
    String toStringResult = excelAnalysisStopException.toString();
    Throwable[] suppressed = excelAnalysisStopException.getSuppressed();
    String message1 = excelAnalysisStopException.getMessage();
    Throwable cause1 = excelAnalysisStopException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisStopException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelAnalysisStopException.getLocalizedMessage());
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
