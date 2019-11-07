package com.alibaba.excel.read.builder;

import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_doReadTest_11_Test {
  @Test
  public void doReadTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    excelReaderSheetBuilder.doRead();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
