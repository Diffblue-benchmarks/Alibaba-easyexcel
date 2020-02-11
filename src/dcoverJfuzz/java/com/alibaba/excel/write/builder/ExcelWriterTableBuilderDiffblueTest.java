package com.alibaba.excel.write.builder;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ExcelWriterTableBuilderDiffblueTest {
  @Test(timeout=10000)
  public void tableNoTest() {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Act and Assert
    assertSame(excelWriterTableBuilder, excelWriterTableBuilder.tableNo(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void needHeadTest() {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Act and Assert
    assertSame(excelWriterTableBuilder, excelWriterTableBuilder.needHead(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void relativeHeadRowIndexTest() {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Act and Assert
    assertSame(excelWriterTableBuilder, excelWriterTableBuilder.relativeHeadRowIndex(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void useDefaultStyleTest() {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Act and Assert
    assertSame(excelWriterTableBuilder, excelWriterTableBuilder.useDefaultStyle(Boolean.valueOf(true)));
  }
}

