package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisException_ExcelAnalysisExceptionTest_3_Test {
  @Test
  public void ExcelAnalysisExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ExcelAnalysisException excelAnalysisException = new ExcelAnalysisException(message);

    // Assert
    String toStringResult = excelAnalysisException.toString();
    Throwable[] suppressed = excelAnalysisException.getSuppressed();
    String message1 = excelAnalysisException.getMessage();
    Throwable cause = excelAnalysisException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", excelAnalysisException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
