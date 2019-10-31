package com.alibaba.excel.write.builder;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class ExcelWriterSheetBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void buildOutputNotNull99982be2697a2c1d962() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();

    // Act
    final WriteSheet actual = thisObj.build();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, actual.getColumnWidthMap());
    Assert.assertNull(actual.getSheetNo());
    Assert.assertNull(actual.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, actual.getCustomWriteHandlerList());
    Assert.assertNull(actual.getNeedHead());
    Assert.assertNull(actual.getRelativeHeadRowIndex());
    Assert.assertNull(actual.getClazz());
    Assert.assertNull(actual.getAutoTrim());
    Assert.assertNull(actual.getCustomConverterList());
    Assert.assertNull(actual.getHead());
    Assert.assertNull(actual.getUse1904windowing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999850cf95f29f6387b() {

    // Act, creating object to test constructor
    final ExcelWriterSheetBuilder actual = new ExcelWriterSheetBuilder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c60fa95630e3cb0f() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("Must use 'EasyExcelFactory.write().sheet()' to call this method", null, byteArrayOutputStream);
    final ExcelWriter arg0 = new ExcelWriter(generateParam);

    // Act, creating object to test constructor
    final ExcelWriterSheetBuilder actual = new ExcelWriterSheetBuilder(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doWriteInputNotNullOutputExcelGenerateException999ddc0f6ae10003bf9() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("Must use 'EasyExcelFactory.write().sheet()' to call this method");

    // Act
    thrown.expect(ExcelGenerateException.class);
    thisObj.doWrite(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNullOutputNotNull99963c19255a8364729() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final Class arg0 = null;

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNotNullOutputNotNull999aa143725bedb36cc() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Must use 'EasyExcelFactory.write().sheet()' to call this method");
    arg0.add(arrayList);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void needHeadInputNotNullOutputNotNull99930ca98c6e2466659() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.needHead(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerConverterInputNotNullOutputNotNull9993c9c6e8e96ab58c7() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.registerConverter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerWriteHandlerInputNotNullOutputNotNull999068b3c51eb0144aa() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final LoopMergeStrategy arg0 = new LoopMergeStrategy(1, 1);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.registerWriteHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void relativeHeadRowIndexInputNotNullOutputNotNull9996edc1ba947dca987() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.relativeHeadRowIndex(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetNameInputNotNullOutputNotNull999b8165d5a0bc1176e() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final String arg0 = "Must use 'EasyExcelFactory.write().sheet()' to call this method";

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheetName(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sheetNoInputNotNullOutputNotNull999bdcfea34ff5e599b() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterSheetBuilder actual = thisObj.sheetNo(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void tableOutputNotNull999786f4778d75586cc() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();

    // Act
    final ExcelWriterTableBuilder actual = thisObj.table();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void tableInputNotNullOutputNotNull9990c8dc6dacd09f522() {

    // Arrange
    final ExcelWriterSheetBuilder thisObj = new ExcelWriterSheetBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.table(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
