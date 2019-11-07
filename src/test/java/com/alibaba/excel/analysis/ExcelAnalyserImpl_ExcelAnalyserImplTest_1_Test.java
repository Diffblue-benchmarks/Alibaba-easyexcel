package com.alibaba.excel.analysis;

import com.alibaba.excel.analysis.ExcelAnalyserImpl;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelAnalyserImpl_ExcelAnalyserImplTest_1_Test {
  @Test
  public void ExcelAnalyserImplTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ExcelAnalyserImpl(readWorkbook);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
