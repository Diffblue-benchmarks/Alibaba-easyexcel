package com.alibaba.excel.read.metadata.holder;

import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReadWorkbookHolder_ReadWorkbookHolderTest_1_Test {
  @Test
  public void ReadWorkbookHolderTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ReadWorkbookHolder(readWorkbook);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
