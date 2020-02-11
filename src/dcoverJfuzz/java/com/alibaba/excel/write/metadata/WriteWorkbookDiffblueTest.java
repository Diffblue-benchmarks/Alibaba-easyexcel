package com.alibaba.excel.write.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class WriteWorkbookDiffblueTest {
  @Test(timeout=10000)
  public void getTemplateFileTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getTemplateFile());
  }

  @Test(timeout=10000)
  public void setExcelTypeTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setExcelType(ExcelTypeEnum.XLS);

    // Assert
    assertEquals(ExcelTypeEnum.XLS, writeWorkbook.getExcelType());
  }

  @Test(timeout=10000)
  public void getMandatoryUseInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void setConvertAllFiledTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setConvertAllFiled(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbook.getConvertAllFiled());
  }

  @Test(timeout=10000)
  public void setAutoCloseStreamTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setAutoCloseStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbook.getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void setTemplateInputStreamTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act
    writeWorkbook.setTemplateInputStream(byteArrayInputStream);

    // Assert
    assertSame(byteArrayInputStream, writeWorkbook.getTemplateInputStream());
  }

  @Test(timeout=10000)
  public void setInMemoryTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setInMemory(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbook.getInMemory());
  }

  @Test(timeout=10000)
  public void setTemplateFileTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setTemplateFile(null);

    // Assert
    assertNull(writeWorkbook.getTemplateFile());
  }

  @Test(timeout=10000)
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getPassword());
  }

  @Test(timeout=10000)
  public void getWriteHandlerTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getWriteHandler());
  }

  @Test(timeout=10000)
  public void getConvertAllFiledTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getConvertAllFiled());
  }

  @Test(timeout=10000)
  public void getAutoCloseStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void getOutputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getOutputStream());
  }

  @Test(timeout=10000)
  public void getFileTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getFile());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    WriteWorkbook actualWriteWorkbook = new WriteWorkbook();

    // Assert
    ExcelTypeEnum actualExcelType = actualWriteWorkbook.getExcelType();
    Class actualClazz = actualWriteWorkbook.getClazz();
    Collection<String> actualIncludeColumnFiledNames = actualWriteWorkbook.getIncludeColumnFiledNames();
    Boolean actualInMemory = actualWriteWorkbook.getInMemory();
    List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = actualWriteWorkbook
        .getCustomWriteHandlerList();
    InputStream actualTemplateInputStream = actualWriteWorkbook.getTemplateInputStream();
    File actualFile = actualWriteWorkbook.getFile();
    OutputStream actualOutputStream = actualWriteWorkbook.getOutputStream();
    Collection<String> actualExcludeColumnFiledNames = actualWriteWorkbook.getExcludeColumnFiledNames();
    Boolean actualAutoCloseStream = actualWriteWorkbook.getAutoCloseStream();
    Boolean actualConvertAllFiled = actualWriteWorkbook.getConvertAllFiled();
    com.alibaba.excel.event.WriteHandler actualWriteHandler = actualWriteWorkbook.getWriteHandler();
    String actualPassword = actualWriteWorkbook.getPassword();
    List<List<String>> actualHead = actualWriteWorkbook.getHead();
    Boolean actualAutoTrim = actualWriteWorkbook.getAutoTrim();
    Boolean actualNeedHead = actualWriteWorkbook.getNeedHead();
    Integer actualRelativeHeadRowIndex = actualWriteWorkbook.getRelativeHeadRowIndex();
    Boolean actualMandatoryUseInputStream = actualWriteWorkbook.getMandatoryUseInputStream();
    Collection<Integer> actualExcludeColumnIndexes = actualWriteWorkbook.getExcludeColumnIndexes();
    Boolean actualUse1904windowing = actualWriteWorkbook.getUse1904windowing();
    Boolean actualUseDefaultStyle = actualWriteWorkbook.getUseDefaultStyle();
    List<Converter> actualCustomConverterList = actualWriteWorkbook.getCustomConverterList();
    File actualTemplateFile = actualWriteWorkbook.getTemplateFile();
    assertNull(actualExcelType);
    assertNull(actualWriteWorkbook.getIncludeColumnIndexes());
    assertNull(actualTemplateFile);
    assertNull(actualCustomConverterList);
    assertNull(actualUseDefaultStyle);
    assertNull(actualUse1904windowing);
    assertNull(actualExcludeColumnIndexes);
    assertNull(actualMandatoryUseInputStream);
    assertNull(actualRelativeHeadRowIndex);
    assertNull(actualNeedHead);
    assertNull(actualAutoTrim);
    assertNull(actualHead);
    assertNull(actualPassword);
    assertNull(actualWriteHandler);
    assertNull(actualConvertAllFiled);
    assertNull(actualAutoCloseStream);
    assertNull(actualExcludeColumnFiledNames);
    assertNull(actualOutputStream);
    assertNull(actualFile);
    assertNull(actualTemplateInputStream);
    assertTrue(customWriteHandlerList instanceof java.util.ArrayList);
    assertNull(actualInMemory);
    assertEquals(0, customWriteHandlerList.size());
    assertNull(actualIncludeColumnFiledNames);
    assertNull(actualClazz);
  }

  @Test(timeout=10000)
  public void getTemplateInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getTemplateInputStream());
  }

  @Test(timeout=10000)
  public void setFileTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setFile(null);

    // Assert
    assertNull(writeWorkbook.getFile());
  }

  @Test(timeout=10000)
  public void getInMemoryTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getInMemory());
  }

  @Test(timeout=10000)
  public void setMandatoryUseInputStreamTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setMandatoryUseInputStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeWorkbook.getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void setPasswordTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setPassword("Password123");

    // Assert
    assertEquals("Password123", writeWorkbook.getPassword());
  }

  @Test(timeout=10000)
  public void setOutputStreamTest() {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    writeWorkbook.setOutputStream(null);

    // Assert
    assertNull(writeWorkbook.getOutputStream());
  }

  @Test(timeout=10000)
  public void getExcelTypeTest() {
    // Arrange, Act and Assert
    assertNull((new WriteWorkbook()).getExcelType());
  }
}

