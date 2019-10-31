package com.alibaba.excel.read.metadata;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class ReadWorkbookTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995a180846eb44df05() {

    // Act, creating object to test constructor
    final ReadWorkbook actual = new ReadWorkbook();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getFile());
    Assert.assertNull(actual.getConvertAllFiled());
    Assert.assertNull(actual.getExcelType());
    Assert.assertNull(actual.getAutoCloseStream());
    Assert.assertNull(actual.getCustomObject());
    Assert.assertNull(actual.getDefaultReturnMap());
    Assert.assertNull(actual.getInputStream());
    Assert.assertNull(actual.getReadCache());
    Assert.assertNull(actual.getIgnoreEmptyRow());
    Assert.assertNull(actual.getMandatoryUseInputStream());
    Assert.assertNull(actual.getReadCacheSelector());
    final ArrayList<ReadListener> arrayList = new ArrayList<ReadListener>();
    Assert.assertEquals(arrayList, actual.getCustomReadListenerList());
    Assert.assertNull(actual.getHeadRowNumber());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoCloseStreamOutputVoid999ef7234dfcbdf550c() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Boolean actual = thisObj.getAutoCloseStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConvertAllFiledOutputVoid99937dc076f4ea55216() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Boolean actual = thisObj.getConvertAllFiled();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCustomObjectOutputVoid999be6d2a0075d35960() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Object actual = thisObj.getCustomObject();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDefaultReturnMapOutputVoid999cec9ddc2f1e3aeb1() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Boolean actual = thisObj.getDefaultReturnMap();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getExcelTypeOutputVoid999280df19dff431747() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final ExcelTypeEnum actual = thisObj.getExcelType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileOutputVoid999ed91e38b2533e427() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final File actual = thisObj.getFile();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIgnoreEmptyRowOutputVoid9996c278a2560eabc8e() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Boolean actual = thisObj.getIgnoreEmptyRow();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputStreamOutputVoid9991d8b70c92956324d() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final InputStream actual = thisObj.getInputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMandatoryUseInputStreamOutputVoid999b8c3938cff47ab26() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final Boolean actual = thisObj.getMandatoryUseInputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getReadCacheSelectorOutputVoid999c16693441419322c() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final ReadCacheSelector actual = thisObj.getReadCacheSelector();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getReadCacheOutputVoid999d001b4a9bf86e3a2() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();

    // Act
    final ReadCache actual = thisObj.getReadCache();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoCloseStreamInputNotNullOutputVoid9992135ac8ec97a48c3() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoCloseStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAutoCloseStream());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConvertAllFiledInputNotNullOutputVoid999b6812d933d66b59b() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setConvertAllFiled(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getConvertAllFiled());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCustomObjectInputNotNullOutputVoid999c446933d26ed719a() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Object arg0 = "aaaaa";

    // Act
    thisObj.setCustomObject(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCustomObject());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDefaultReturnMapInputNotNullOutputVoid999491687e931f5fbb8() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setDefaultReturnMap(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDefaultReturnMap());

  }

  // Test written by Diffblue Cover
  @Test
  public void setExcelTypeInputXlsOutputVoid999a82498ec5d4e27ea() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    thisObj.setExcelType(arg0);

    // Assert side effects
    Assert.assertEquals(ExcelTypeEnum.XLS, thisObj.getExcelType());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileInputNotNullOutputVoid99910c8d2e10297ee28() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final File arg0 = new File("aaaaa");

    // Act
    thisObj.setFile(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFile());
    Assert.assertEquals("aaaaa", thisObj.getFile().getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIgnoreEmptyRowInputNotNullOutputVoid999a443cf51a82513da() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setIgnoreEmptyRow(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getIgnoreEmptyRow());

  }

  // Test written by Diffblue Cover
  @Test
  public void setInputStreamInputNotNullOutputVoid999b110d147556516a3() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    thisObj.setInputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getInputStream());
    Assert.assertEquals(24, Reflector.getInstanceField(thisObj.getInputStream(), "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getInputStream(), "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 }, ((byte[]) Reflector.getInstanceField(thisObj.getInputStream(), "buf")));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getInputStream(), "pos"));

  }

  // Test written by Diffblue Cover
  @Test
  public void setMandatoryUseInputStreamInputNotNullOutputVoid999fcb3ea0056974a1f() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setMandatoryUseInputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getMandatoryUseInputStream());

  }

  // Test written by Diffblue Cover
  @Test
  public void setReadCacheSelectorInputNotNullOutputVoid999c1cbc2e3f804b1cf() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Ehcache ehcache = new Ehcache(1);
    final EternalReadCacheSelector arg0 = new EternalReadCacheSelector(ehcache);

    // Act
    thisObj.setReadCacheSelector(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getReadCacheSelector());

  }

  // Test written by Diffblue Cover
  @Test
  public void setReadCacheInputNotNullOutputVoid99972fc4b3347f7493e() {

    // Arrange
    final ReadWorkbook thisObj = new ReadWorkbook();
    final Ehcache arg0 = new Ehcache(1);

    // Act
    thisObj.setReadCache(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getReadCache());

  }
}
