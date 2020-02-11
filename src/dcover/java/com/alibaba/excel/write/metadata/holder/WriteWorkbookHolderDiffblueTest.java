package com.alibaba.excel.write.metadata.holder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class WriteWorkbookHolderDiffblueTest {
  @Test(timeout=10000)
  public void setExcelTypeTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);

    // Assert
    assertEquals(ExcelTypeEnum.XLS, writeWorkbookHolder.getExcelType());
  }

  @Test(timeout=10000)
  public void getTemplateFileTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getTemplateFile());
  }

  @Test(timeout=10000)
  public void setAutoCloseStreamTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setAutoCloseStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbookHolder.getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void setTemplateInputStreamTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act
    writeWorkbookHolder.setTemplateInputStream(byteArrayInputStream);

    // Assert
    assertSame(byteArrayInputStream, writeWorkbookHolder.getTemplateInputStream());
  }

  @Test(timeout=10000)
  public void setInMemoryTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setInMemory(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbookHolder.getInMemory());
  }

  @Test(timeout=10000)
  public void setTemplateFileTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setTemplateFile(null);

    // Assert
    assertNull(writeWorkbookHolder.getTemplateFile());
  }

  @Test(timeout=10000)
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getPassword());
  }

  @Test(timeout=10000)
  public void getTempTemplateInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getTempTemplateInputStream());
  }

  @Test(timeout=10000)
  public void holderTypeTest() {
    // Arrange, Act and Assert
    assertEquals(HolderEnum.WORKBOOK, (new WriteWorkbookHolder(new WriteWorkbook())).holderType());
  }

  @Test(timeout=10000)
  public void getAutoCloseStreamTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new WriteWorkbookHolder(new WriteWorkbook())).getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void setHasBeenInitializedSheetTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setHasBeenInitializedSheet(null);

    // Assert
    assertNull(writeWorkbookHolder.getHasBeenInitializedSheet());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    WriteWorkbookHolder actualWriteWorkbookHolder = new WriteWorkbookHolder(writeWorkbook);

    // Assert
    ExcelTypeEnum actualExcelType = actualWriteWorkbookHolder.getExcelType();
    Collection<String> actualIncludeColumnFiledNames = actualWriteWorkbookHolder.getIncludeColumnFiledNames();
    Boolean actualInMemory = actualWriteWorkbookHolder.getInMemory();
    File actualFile = actualWriteWorkbookHolder.getFile();
    Boolean actualNewInitialization = actualWriteWorkbookHolder.getNewInitialization();
    OutputStream actualOutputStream = actualWriteWorkbookHolder.getOutputStream();
    List<List<String>> actualHead = actualWriteWorkbookHolder.getHead();
    Boolean actualNeedHead = actualWriteWorkbookHolder.getNeedHead();
    Integer actualRelativeHeadRowIndex = actualWriteWorkbookHolder.getRelativeHeadRowIndex();
    Boolean actualMandatoryUseInputStream = actualWriteWorkbookHolder.getMandatoryUseInputStream();
    Collection<Integer> actualExcludeColumnIndexes = actualWriteWorkbookHolder.getExcludeColumnIndexes();
    Boolean actualUseDefaultStyle = actualWriteWorkbookHolder.getUseDefaultStyle();
    Class actualClazz = actualWriteWorkbookHolder.getClazz();
    WriteWorkbook actualWriteWorkbook = actualWriteWorkbookHolder.getWriteWorkbook();
    Collection<String> actualExcludeColumnFiledNames = actualWriteWorkbookHolder.getExcludeColumnFiledNames();
    Boolean actualAutoCloseStream = actualWriteWorkbookHolder.getAutoCloseStream();
    String actualPassword = actualWriteWorkbookHolder.getPassword();
    assertEquals(ExcelTypeEnum.XLSX, actualExcelType);
    assertNull(actualWriteWorkbookHolder.getIncludeColumnIndexes());
    assertNull(actualPassword);
    assertEquals(Boolean.valueOf(true), actualAutoCloseStream);
    assertNull(actualExcludeColumnFiledNames);
    assertSame(writeWorkbook, actualWriteWorkbook);
    assertNull(actualIncludeColumnFiledNames);
    assertEquals(Boolean.valueOf(true), actualUseDefaultStyle);
    assertNull(actualClazz);
    assertNull(actualFile);
    assertNull(actualHead);
    assertEquals(Boolean.valueOf(true), actualNeedHead);
    assertEquals(Boolean.valueOf(false), actualInMemory);
    assertEquals(Boolean.valueOf(true), actualNewInitialization);
    assertEquals(Integer.valueOf(0), actualRelativeHeadRowIndex);
    assertEquals(Boolean.valueOf(false), actualMandatoryUseInputStream);
    assertNull(actualOutputStream);
    assertNull(actualExcludeColumnIndexes);
  }

  @Test(timeout=10000)
  public void getHasBeenInitializedSheetTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new WriteWorkbookHolder(new WriteWorkbook())).getHasBeenInitializedSheet().size());
  }

  @Test(timeout=10000)
  public void getCachedWorkbookTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getCachedWorkbook());
  }

  @Test(timeout=10000)
  public void getTemplateInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getTemplateInputStream());
  }

  @Test(timeout=10000)
  public void getWriteWorkbookTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act and Assert
    assertSame(writeWorkbook, (new WriteWorkbookHolder(writeWorkbook)).getWriteWorkbook());
  }

  @Test(timeout=10000)
  public void setFileTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setFile(null);

    // Assert
    assertNull(writeWorkbookHolder.getFile());
  }

  @Test(timeout=10000)
  public void setOutputStreamTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setOutputStream(null);

    // Assert
    assertNull(writeWorkbookHolder.getOutputStream());
  }

  @Test(timeout=10000)
  public void getWorkbookTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getWorkbook());
  }

  @Test(timeout=10000)
  public void getMandatoryUseInputStreamTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new WriteWorkbookHolder(new WriteWorkbook())).getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void getOutputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getOutputStream());
  }

  @Test(timeout=10000)
  public void getFileTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbookHolder(new WriteWorkbook())).getFile());
  }

  @Test(timeout=10000)
  public void getInMemoryTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new WriteWorkbookHolder(new WriteWorkbook())).getInMemory());
  }

  @Test(timeout=10000)
  public void setMandatoryUseInputStreamTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setMandatoryUseInputStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbookHolder.getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void setTempTemplateInputStreamTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act
    writeWorkbookHolder.setTempTemplateInputStream(byteArrayInputStream);

    // Assert
    assertSame(byteArrayInputStream, writeWorkbookHolder.getTempTemplateInputStream());
  }

  @Test(timeout=10000)
  public void setWriteWorkbookTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbookHolder.setWriteWorkbook(writeWorkbook);

    // Assert
    assertSame(writeWorkbook, writeWorkbookHolder.getWriteWorkbook());
  }

  @Test(timeout=10000)
  public void setPasswordTest() {
    // Arrange
    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());

    // Act
    writeWorkbookHolder.setPassword("Password123");

    // Assert
    assertEquals("Password123", writeWorkbookHolder.getPassword());
  }

  @Test(timeout=10000)
  public void getExcelTypeTest() {
    // Arrange, Act and Assert
    assertEquals(ExcelTypeEnum.XLSX, (new WriteWorkbookHolder(new WriteWorkbook())).getExcelType());
  }
}

