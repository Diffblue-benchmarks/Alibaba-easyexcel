package com.alibaba.excel.read.builder;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.exception.ExcelAnalysisException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcelReaderSheetBuilderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void autoTrimTest() {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    assertSame(excelReaderSheetBuilder, excelReaderSheetBuilder.autoTrim(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void doReadSyncTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderSheetBuilder()).doReadSync();
  }

  @Test(timeout=10000)
  public void headRowNumberTest() {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    assertSame(excelReaderSheetBuilder, excelReaderSheetBuilder.headRowNumber(Integer.valueOf(10)));
  }

  @Test(timeout=10000)
  public void sheetNoTest() {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    assertSame(excelReaderSheetBuilder, excelReaderSheetBuilder.sheetNo(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void use1904windowingTest() {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    assertSame(excelReaderSheetBuilder, excelReaderSheetBuilder.use1904windowing(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void sheetNameTest() {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Act and Assert
    assertSame(excelReaderSheetBuilder, excelReaderSheetBuilder.sheetName("name"));
  }
}

