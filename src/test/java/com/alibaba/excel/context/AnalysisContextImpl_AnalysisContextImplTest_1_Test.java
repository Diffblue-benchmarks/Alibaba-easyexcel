package com.alibaba.excel.context;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AnalysisContextImpl_AnalysisContextImplTest_1_Test {
  @Test
  public void AnalysisContextImplTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new AnalysisContextImpl(readWorkbook);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
