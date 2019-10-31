package com.alibaba.excel.read.builder;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.cache.selector.EternalReadCacheSelector;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ExcelReaderBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void autoCloseStreamInputNotNullOutputNotNull9999113f12f063455df() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderBuilder actual = thisObj.autoCloseStream(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void autoTrimInputNotNullOutputNotNull999546a0b9ed6c43c00() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderBuilder actual = thisObj.autoTrim(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void buildOutputExcelAnalysisException99941fd15b50aa4710a() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.build();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a5a4b8d1792f5883() {

    // Act, creating object to test constructor
    final ExcelReaderBuilder actual = new ExcelReaderBuilder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void customObjectInputNotNullOutputNotNull9990a001c882ab48da4() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Object arg0 = "aaaaa";

    // Act
    final ExcelReaderBuilder actual = thisObj.customObject(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void excelTypeInputXlsOutputNotNull999fffabd3ae942fb04() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    final ExcelReaderBuilder actual = thisObj.excelType(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull99941ee5b389a0f5294() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final File arg0 = new File("aaaaa");

    // Act
    final ExcelReaderBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull99945c9e4a5430329f6() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final ExcelReaderBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fileInputNotNullOutputNotNull999637246a6d9b00206() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final String arg0 = "aaaaa";

    // Act
    final ExcelReaderBuilder actual = thisObj.file(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNullOutputNotNull999bccb277fe5a70c7f() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Class arg0 = null;

    // Act
    final ExcelReaderBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNotNullOutputNotNull9995ea67e635dca2929() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    arg0.add(arrayList);

    // Act
    final ExcelReaderBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headRowNumberInputNotNullOutputNotNull999bc8e1d2dd4702366() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelReaderBuilder actual = thisObj.headRowNumber(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ignoreEmptyRowInputNotNullOutputNotNull99909f2a3ddce2e5a2a() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderBuilder actual = thisObj.ignoreEmptyRow(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mandatoryUseInputStreamInputNotNullOutputNotNull99942f63a2abe668eba() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderBuilder actual = thisObj.mandatoryUseInputStream(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readCacheSelectorInputNotNullOutputNotNull9992e5ffda661d5ec06() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Ehcache ehcache = new Ehcache(1);
    final EternalReadCacheSelector arg0 = new EternalReadCacheSelector(ehcache);

    // Act
    final ExcelReaderBuilder actual = thisObj.readCacheSelector(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readCacheInputNotNullOutputNotNull9990d7b82fac42ce983() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Ehcache arg0 = new Ehcache(1);

    // Act
    final ExcelReaderBuilder actual = thisObj.readCache(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerConverterInputNotNullOutputNotNull999fc785002f45efc91() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    final ExcelReaderBuilder actual = thisObj.registerConverter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerReadListenerInputNotNullOutputNotNull99913450101aaac5dc0() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final SyncReadListener arg0 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = thisObj.registerReadListener(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetOutputExcelAnalysisException999538cc8b56f3ab15e() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.sheet();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullNotNullOutputExcelAnalysisException9999f1fd1e73045c535() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Integer arg0 = new Integer(1);
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.sheet(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullOutputExcelAnalysisException99975616fad337c396b() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.sheet(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetInputNotNullOutputExcelAnalysisException999f59defc52ebcf111() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.sheet(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void use1904windowingInputNotNullOutputNotNull9990685412e5a0c1de3() {

    // Arrange
    final ExcelReaderBuilder thisObj = new ExcelReaderBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderBuilder actual = thisObj.use1904windowing(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
