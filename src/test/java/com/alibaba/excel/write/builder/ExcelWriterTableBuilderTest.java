package com.alibaba.excel.write.builder;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ExcelWriterTableBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void buildOutputNotNull999f9bc94e9fd925d14() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();

    // Act
    final WriteTable actual = thisObj.build();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getTableNo());
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
  public void constructorOutputNotNull999d7e0e8e8c686d1ce() {

    // Act, creating object to test constructor
    final ExcelWriterTableBuilder actual = new ExcelWriterTableBuilder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99971c1a2165b380c9c() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("Must use 'EasyExcelFactory.write().sheet().table()' to call this method", null, byteArrayOutputStream);
    final ExcelWriter arg0 = new ExcelWriter(generateParam);
    final WriteSheet arg1 = new WriteSheet();

    // Act, creating object to test constructor
    final ExcelWriterTableBuilder actual = new ExcelWriterTableBuilder(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doWriteInputNotNullOutputExcelGenerateException999afb1151ab8bf15c1() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");

    // Act
    thrown.expect(ExcelGenerateException.class);
    thisObj.doWrite(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNullOutputNotNull999bbeb5eed3c3cb3f4() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final Class arg0 = null;

    // Act
    final ExcelWriterTableBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void headInputNotNullOutputNotNull999ca6f08631f6cb5bc() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final ArrayList<List<String>> arg0 = new ArrayList<List<String>>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");
    arg0.add(arrayList);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.head(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void needHeadInputNotNullOutputNotNull9997d3fdcf9d6e85d98() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final Boolean arg0 = new Boolean(true);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.needHead(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerConverterInputNotNullOutputNotNull9999881767391ddef0f() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final AutoConverter arg0 = new AutoConverter();

    // Act
    final ExcelWriterTableBuilder actual = thisObj.registerConverter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registerWriteHandlerInputNotNullOutputNotNull9990e4414ee28995c33() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final LoopMergeStrategy arg0 = new LoopMergeStrategy(1, 1);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.registerWriteHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void relativeHeadRowIndexInputNotNullOutputNotNull999b8f0086f05955583() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.relativeHeadRowIndex(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void tableNoInputNotNullOutputNotNull999b6a8e78a4cd9b3d7() {

    // Arrange
    final ExcelWriterTableBuilder thisObj = new ExcelWriterTableBuilder();
    final Integer arg0 = new Integer(1);

    // Act
    final ExcelWriterTableBuilder actual = thisObj.tableNo(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
