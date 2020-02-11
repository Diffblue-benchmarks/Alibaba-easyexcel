package com.alibaba.excel.write.builder;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ExcelWriterBuilderDiffblueTest {
  @Test(timeout=10000)
  public void withTemplateTest3() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.withTemplate("name"));
  }

  @Test(timeout=10000)
  public void excludeColumnFiledNamesTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.excludeColumnFiledNames(null));
  }

  @Test(timeout=10000)
  public void fileTest3() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.file((File) null));
  }

  @Test(timeout=10000)
  public void passwordTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.password("Password123"));
  }

  @Test(timeout=10000)
  public void fileTest2() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.file((OutputStream) null));
  }

  @Test(timeout=10000)
  public void inMemoryTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.inMemory(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void relativeHeadRowIndexTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.relativeHeadRowIndex(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void convertAllFiledTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.convertAllFiled(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void excelTypeTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.excelType(ExcelTypeEnum.XLS));
  }

  @Test(timeout=10000)
  public void needHeadTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.needHead(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void headTest2() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.head((List<List<String>>) null));
  }

  @Test(timeout=10000)
  public void includeColumnFiledNamesTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.includeColumnFiledNames(null));
  }

  @Test(timeout=10000)
  public void includeColumnIndexesTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.includeColumnIndexes(null));
  }

  @Test(timeout=10000)
  public void excludeColumnIndexesTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.excludeColumnIndexes(null));
  }

  @Test(timeout=10000)
  public void useDefaultStyleTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.useDefaultStyle(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void fileTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.file("name"));
  }

  @Test(timeout=10000)
  public void withTemplateTest2() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.withTemplate(new ByteArrayInputStream(byteArray)));
  }

  @Test(timeout=10000)
  public void autoCloseStreamTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.autoCloseStream(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void headTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.head((Class) null));
  }

  @Test(timeout=10000)
  public void withTemplateTest() {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Act and Assert
    assertSame(excelWriterBuilder, excelWriterBuilder.withTemplate((File) null));
  }
}

