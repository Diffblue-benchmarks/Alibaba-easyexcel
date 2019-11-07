package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisStopException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisStopException_ExcelAnalysisStopExceptionTest_1_Test {
  @Test
  public void ExcelAnalysisStopExceptionTest() throws Exception {
    // Arrange and Act
    ExcelAnalysisStopException excelAnalysisStopException = new ExcelAnalysisStopException();

    // Assert
    String toStringResult = excelAnalysisStopException.toString();
    Throwable[] suppressed = excelAnalysisStopException.getSuppressed();
    String message = excelAnalysisStopException.getMessage();
    Throwable cause = excelAnalysisStopException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisStopException", toStringResult);
    Assert.assertEquals(null, excelAnalysisStopException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
