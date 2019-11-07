package com.alibaba.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReader_ExcelReaderTest_5_Test {
  @Test
  public void ExcelReaderTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ExcelReader(readWorkbook);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
