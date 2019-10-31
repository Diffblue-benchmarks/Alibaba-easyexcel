package com.alibaba.excel.read.builder;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ExcelReaderSheetBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void autoTrimInputNotNullOutputNotNull999dbcf369f0f6febac() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.autoTrim(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void buildOutputNotNull9999c02a5a1bd1bd9ea() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();

    // Act
    final ReadSheet actual = thisObj.build();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSheetName());
    Assert.assertNull(actual.getSheetNo());
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
  public void constructorOutputNotNull999bfe70676f5e8d62c() {

    // Act, creating object to test constructor
    final ExcelReaderSheetBuilder actual = new ExcelReaderSheetBuilder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999d0e450620ec3bc00() {

    // Arrange
    final ExcelReader arg0 = null;

    // Act, creating object to test constructor
    final ExcelReaderSheetBuilder actual = new ExcelReaderSheetBuilder(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doReadSyncOutputExcelAnalysisException999460230c1518fe48a() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();

    // Act
    thrown.expect(ExcelAnalysisException.class);
    thisObj.doReadSync();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doReadOutputExcelGenerateException999c4c0e453f6a6488e() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();

    // Act
    thrown.expect(ExcelGenerateException.class);
    thisObj.doRead();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNullOutputNotNull999b0e45afa68038648() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final Class arg0 = null;

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNotNullOutputNotNull999cc7c0f974cd21880() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Must use 'EasyExcelFactory.read().sheet()' to call this method");
    arg0.add(arrayList);

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headRowNumberInputNotNullOutputNotNull9997c83cb296dfaa739() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.headRowNumber(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerConverterInputNotNullOutputNotNull999e5282ff8cb7c4dbc() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.registerConverter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerReadListenerInputNotNullOutputNotNull9996a898063286fd8ca() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final SyncReadListener arg0 = new SyncReadListener();

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.registerReadListener(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetNameInputNotNullOutputNotNull999787bba3ef8ddcc7e() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final String arg0 = "Must use 'EasyExcelFactory.read().sheet()' to call this method";

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.sheetName(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetNoInputNotNullOutputNotNull9995cd7880e76246300() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.sheetNo(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void use1904windowingInputNotNullOutputNotNull999ed0add815093f9a8() {

    // Arrange
    final ExcelReaderSheetBuilder thisObj = new ExcelReaderSheetBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelReaderSheetBuilder actual = thisObj.use1904windowing(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
