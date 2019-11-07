package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisException_ExcelAnalysisExceptionTest_4_Test {
  @Test
  public void ExcelAnalysisExceptionTest() throws Exception {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ExcelAnalysisException excelAnalysisException = new ExcelAnalysisException(cause);

    // Assert
    String toStringResult = excelAnalysisException.toString();
    Throwable[] suppressed = excelAnalysisException.getSuppressed();
    String message = excelAnalysisException.getMessage();
    Throwable cause1 = excelAnalysisException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", excelAnalysisException.getLocalizedMessage());
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
