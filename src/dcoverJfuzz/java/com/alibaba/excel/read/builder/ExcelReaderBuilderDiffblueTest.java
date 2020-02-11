package com.alibaba.excel.read.builder;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcelReaderBuilderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void autoTrimTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.autoTrim(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void sheetTest4() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).sheet(Integer.valueOf(1), "name");
  }

  @Test(timeout=10000)
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).build();
  }

  @Test(timeout=10000)
  public void use1904windowingTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.use1904windowing(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void fileTest3() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.file((File) null));
  }

  @Test(timeout=10000)
  public void customObjectTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.customObject("foo"));
  }

  @Test(timeout=10000)
  public void sheetTest3() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).sheet(Integer.valueOf(1));
  }

  @Test(timeout=10000)
  public void fileTest2() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.file("name"));
  }

  @Test(timeout=10000)
  public void headRowNumberTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.headRowNumber(Integer.valueOf(10)));
  }

  @Test(timeout=10000)
  public void sheetTest2() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).sheet();
  }

  @Test(timeout=10000)
  public void doReadAllTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).doReadAll();
  }

  @Test(timeout=10000)
  public void headTest2() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.head((Class) null));
  }

  @Test(timeout=10000)
  public void autoCloseStreamTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.autoCloseStream(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void fileTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.file(new ByteArrayInputStream(byteArray)));
  }

  @Test(timeout=10000)
  public void ignoreEmptyRowTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.ignoreEmptyRow(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void mandatoryUseInputStreamTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.mandatoryUseInputStream(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void headTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.head((List<List<String>>) null));
  }

  @Test(timeout=10000)
  public void sheetTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    (new ExcelReaderBuilder()).sheet("name");
  }

  @Test(timeout=10000)
  public void excelTypeTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.excelType(ExcelTypeEnum.XLS));
  }

  @Test(timeout=10000)
  public void passwordTest() {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Act and Assert
    assertSame(excelReaderBuilder, excelReaderBuilder.password("Password123"));
  }
}

