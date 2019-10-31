package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReadWorkbookHolderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputExcelAnalysisException99976f66ccd67e3e8bd() {

    // Arrange
    final ReadWorkbook arg0 = new ReadWorkbook();

    // Act, creating object to test constructor
    thrown.expect(ExcelAnalysisException.class);
    new ReadWorkbookHolder(arg0);

    // The method is not expected to return due to exception thrown

  }
}
