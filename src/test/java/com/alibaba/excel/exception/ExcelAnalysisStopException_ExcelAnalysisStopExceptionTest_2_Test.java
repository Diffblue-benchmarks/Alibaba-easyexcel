package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisStopException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisStopException_ExcelAnalysisStopExceptionTest_2_Test {
  @Test
  public void ExcelAnalysisStopExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ExcelAnalysisStopException excelAnalysisStopException = new ExcelAnalysisStopException(message);

    // Assert
    String toStringResult = excelAnalysisStopException.toString();
    Throwable[] suppressed = excelAnalysisStopException.getSuppressed();
    String message1 = excelAnalysisStopException.getMessage();
    Throwable cause = excelAnalysisStopException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisStopException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelAnalysisStopException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
