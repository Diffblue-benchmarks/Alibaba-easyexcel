package com.alibaba.excel.read.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ReadWorkbookDiffblueTest {
  @Test(timeout=10000)
  public void setExcelTypeTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setExcelType(ExcelTypeEnum.XLS);

    // Assert
    assertEquals(ExcelTypeEnum.XLS, readWorkbook.getExcelType());
  }

  @Test(timeout=10000)
  public void getCustomObjectTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getCustomObject());
  }

  @Test(timeout=10000)
  public void getInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getInputStream());
  }

  @Test(timeout=10000)
  public void getReadCacheSelectorTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getReadCacheSelector());
  }

  @Test(timeout=10000)
  public void setConvertAllFiledTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setConvertAllFiled(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), readWorkbook.getConvertAllFiled());
  }

  @Test(timeout=10000)
  public void setAutoCloseStreamTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setAutoCloseStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), readWorkbook.getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getPassword());
  }

  @Test(timeout=10000)
  public void getConvertAllFiledTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getConvertAllFiled());
  }

  @Test(timeout=10000)
  public void getAutoCloseStreamTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getAutoCloseStream());
  }

  @Test(timeout=10000)
  public void setInputStreamTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

    // Act
    readWorkbook.setInputStream(byteArrayInputStream);

    // Assert
    assertSame(byteArrayInputStream, readWorkbook.getInputStream());
  }

  @Test(timeout=10000)
  public void getIgnoreEmptyRowTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getIgnoreEmptyRow());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ReadWorkbook actualReadWorkbook = new ReadWorkbook();

    // Assert
    ExcelTypeEnum actualExcelType = actualReadWorkbook.getExcelType();
    ReadCache actualReadCache = actualReadWorkbook.getReadCache();
    Class actualClazz = actualReadWorkbook.getClazz();
    Boolean actualDefaultReturnMap = actualReadWorkbook.getDefaultReturnMap();
    Integer actualHeadRowNumber = actualReadWorkbook.getHeadRowNumber();
    File actualFile = actualReadWorkbook.getFile();
    Boolean actualIgnoreEmptyRow = actualReadWorkbook.getIgnoreEmptyRow();
    Boolean actualAutoCloseStream = actualReadWorkbook.getAutoCloseStream();
    Boolean actualConvertAllFiled = actualReadWorkbook.getConvertAllFiled();
    String actualPassword = actualReadWorkbook.getPassword();
    List<List<String>> actualHead = actualReadWorkbook.getHead();
    Boolean actualAutoTrim = actualReadWorkbook.getAutoTrim();
    ReadCacheSelector actualReadCacheSelector = actualReadWorkbook.getReadCacheSelector();
    Boolean actualMandatoryUseInputStream = actualReadWorkbook.getMandatoryUseInputStream();
    InputStream actualInputStream = actualReadWorkbook.getInputStream();
    List<ReadListener> customReadListenerList = actualReadWorkbook.getCustomReadListenerList();
    Boolean actualUse1904windowing = actualReadWorkbook.getUse1904windowing();
    List<Converter> actualCustomConverterList = actualReadWorkbook.getCustomConverterList();
    assertNull(actualExcelType);
    assertNull(actualReadWorkbook.getCustomObject());
    assertNull(actualCustomConverterList);
    assertNull(actualUse1904windowing);
    assertTrue(customReadListenerList instanceof java.util.ArrayList);
    assertNull(actualInputStream);
    assertEquals(0, customReadListenerList.size());
    assertNull(actualMandatoryUseInputStream);
    assertNull(actualReadCacheSelector);
    assertNull(actualAutoTrim);
    assertNull(actualHead);
    assertNull(actualPassword);
    assertNull(actualConvertAllFiled);
    assertNull(actualAutoCloseStream);
    assertNull(actualIgnoreEmptyRow);
    assertNull(actualFile);
    assertNull(actualHeadRowNumber);
    assertNull(actualDefaultReturnMap);
    assertNull(actualClazz);
    assertNull(actualReadCache);
  }

  @Test(timeout=10000)
  public void setFileTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setFile(null);

    // Assert
    assertNull(readWorkbook.getFile());
  }

  @Test(timeout=10000)
  public void getDefaultReturnMapTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getDefaultReturnMap());
  }

  @Test(timeout=10000)
  public void getMandatoryUseInputStreamTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void setIgnoreEmptyRowTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setIgnoreEmptyRow(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), readWorkbook.getIgnoreEmptyRow());
  }

  @Test(timeout=10000)
  public void setDefaultReturnMapTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setDefaultReturnMap(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), readWorkbook.getDefaultReturnMap());
  }

  @Test(timeout=10000)
  public void getFileTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getFile());
  }

  @Test(timeout=10000)
  public void setMandatoryUseInputStreamTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setMandatoryUseInputStream(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), readWorkbook.getMandatoryUseInputStream());
  }

  @Test(timeout=10000)
  public void setPasswordTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setPassword("Password123");

    // Assert
    assertEquals("Password123", readWorkbook.getPassword());
  }

  @Test(timeout=10000)
  public void getReadCacheTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getReadCache());
  }

  @Test(timeout=10000)
  public void setCustomObjectTest() {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    readWorkbook.setCustomObject("foo");

    // Assert
    assertTrue(readWorkbook.getCustomObject() instanceof String);
  }

  @Test(timeout=10000)
  public void getExcelTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ReadWorkbook()).getExcelType());
  }
}

