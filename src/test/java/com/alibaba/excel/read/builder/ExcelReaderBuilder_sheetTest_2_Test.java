package com.alibaba.excel.read.builder;

import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_sheetTest_2_Test {
  @Test
  public void sheetTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    Integer sheetNo = new Integer(1);

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    excelReaderBuilder.sheet(sheetNo);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
