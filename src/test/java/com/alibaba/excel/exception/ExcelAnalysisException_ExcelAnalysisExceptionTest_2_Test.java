package com.alibaba.excel.exception;

import com.alibaba.excel.exception.ExcelAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelAnalysisException_ExcelAnalysisExceptionTest_2_Test {
  @Test
  public void ExcelAnalysisExceptionTest() throws Exception {
    // Arrange and Act
    ExcelAnalysisException excelAnalysisException = new ExcelAnalysisException();

    // Assert
    String toStringResult = excelAnalysisException.toString();
    Throwable[] suppressed = excelAnalysisException.getSuppressed();
    String message = excelAnalysisException.getMessage();
    Throwable cause = excelAnalysisException.getCause();
    Assert.assertEquals("com.alibaba.excel.exception.ExcelAnalysisException", toStringResult);
    Assert.assertEquals(null, excelAnalysisException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
