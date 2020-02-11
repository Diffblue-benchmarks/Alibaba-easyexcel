package com.alibaba.excel.write.builder;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcelWriterSheetBuilderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void headTest2() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.head((Class) null));
  }

  @Test(timeout=10000)
  public void relativeHeadRowIndexTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.relativeHeadRowIndex(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void excludeColumnFiledNamesTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.excludeColumnFiledNames(null));
  }

  @Test(timeout=10000)
  public void excludeColumnIndexesTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.excludeColumnIndexes(null));
  }

  @Test(timeout=10000)
  public void needHeadTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.needHead(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void includeColumnIndexesTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.includeColumnIndexes(null));
  }

  @Test(timeout=10000)
  public void doFillTest2() {
    // Arrange, Act and Assert
    thrown.expect(ExcelGenerateException.class);
    (new ExcelWriterSheetBuilder()).doFill("foo");
  }

  @Test(timeout=10000)
  public void useDefaultStyleTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.useDefaultStyle(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void includeColumnFiledNamesTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.includeColumnFiledNames(null));
  }

  @Test(timeout=10000)
  public void doFillTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    thrown.expect(ExcelGenerateException.class);
    excelWriterSheetBuilder.doFill("foo", new FillConfig());
  }

  @Test(timeout=10000)
  public void headTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.head((List<List<String>>) null));
  }

  @Test(timeout=10000)
  public void sheetNoTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.sheetNo(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void doWriteTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelGenerateException.class);
    (new ExcelWriterSheetBuilder()).doWrite(null);
  }

  @Test(timeout=10000)
  public void sheetNameTest() {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act and Assert
    assertSame(excelWriterSheetBuilder, excelWriterSheetBuilder.sheetName("name"));
  }
}

