package com.alibaba.excel.context;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AnalysisContextImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputExcelAnalysisException999f35abd3acbc0c18b() {

    // Arrange
    final ReadWorkbook arg0 = new ReadWorkbook();

    // Act, creating object to test constructor
    thrown.expect(ExcelAnalysisException.class);
    new AnalysisContextImpl(arg0);

    // The method is not expected to return due to exception thrown

  }
}
