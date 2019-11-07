package com.alibaba.excel.read.builder;

import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_doReadSyncTest_12_Test {
  @Test
  public void doReadSyncTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    excelReaderSheetBuilder.doReadSync();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
