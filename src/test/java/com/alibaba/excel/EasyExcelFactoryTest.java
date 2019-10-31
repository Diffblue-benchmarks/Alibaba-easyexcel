package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Array;



public class EasyExcelFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b71c575f5325ba0c() {

    // Act, creating object to test constructor
    final EasyExcelFactory actual = new EasyExcelFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReaderInputNotNullNotNullOutputExcelCommonException9995099cb5eea6d9162() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final SyncReadListener arg1 = new SyncReadListener();

    // Act
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.getReader(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriterInputNotNullXlsTrueOutputNotNull99917ce246e7b009b77() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;
    final boolean arg2 = true;

    // Act
    final ExcelWriter actual = EasyExcelFactory.getWriter(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriterInputNotNullOutputNotNull99982661c6f39b7f1aa() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    final ExcelWriter actual = EasyExcelFactory.getWriter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriterWithTempAndHandlerInputNotNullNotNullXlsTrueNullOutputExcelGenerateException999b41d1fc67e5a7e0d() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ByteArrayOutputStream arg1 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg2 = ExcelTypeEnum.XLS;
    final boolean arg3 = true;
    final WriteHandler arg4 = null;
    try {

      // Act
      thrown.expect(ExcelGenerateException.class);
      EasyExcelFactory.getWriterWithTempAndHandler(arg0, arg1, arg2, arg3, arg4);
    } catch (ExcelGenerateException ex) {

      // Assert side effects
      Assert.assertNotNull(arg0);
      Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
      Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
      Assert.assertEquals(24, Reflector.getInstanceField(arg0, "pos"));
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriterWithTempInputNotNullNotNullXlsTrueOutputExcelGenerateException999a7b5290376771a8a() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ByteArrayOutputStream arg1 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg2 = ExcelTypeEnum.XLS;
    final boolean arg3 = true;
    try {

      // Act
      thrown.expect(ExcelGenerateException.class);
      EasyExcelFactory.getWriterWithTemp(arg0, arg1, arg2, arg3);
    } catch (ExcelGenerateException ex) {

      // Assert side effects
      Assert.assertNotNull(arg0);
      Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
      Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
      Assert.assertEquals(24, Reflector.getInstanceField(arg0, "pos"));
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void readOutputNotNull999d2ba8b79bcf2f9ff() {

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullOutputNotNull999eea588641bf74b5d() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNullNotNullOutputNotNull9990e9f58a51d665991() {

    // Arrange
    final File arg0 = new File("aaaaa");
    final Class arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNotNullOutputNotNull9995d909022b3c9d60e() {

    // Arrange
    final File arg0 = new File("aaaaa");
    final SyncReadListener arg1 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullOutputNotNull999985d74d9211af4cd() {

    // Arrange
    final File arg0 = new File("aaaaa");

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNullOutputExcelCommonException9999adfeec95cc046b3() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final Sheet arg1 = null;

    // Act
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.read(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNullNotNullOutputNotNull999bdca775adbc96836() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final Class arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNotNullOutputNotNull999c126f996a7100a51() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final SyncReadListener arg1 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullOutputNotNull999a76200c28d929f3a() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNullNotNullOutputNotNull999663e0897d3020ba8() {

    // Arrange
    final String arg0 = "aaaaa";
    final Class arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullNotNullOutputNotNull999226a93b334101666() {

    // Arrange
    final String arg0 = "aaaaa";
    final SyncReadListener arg1 = new SyncReadListener();

    // Act
    final ExcelReaderBuilder actual = EasyExcelFactory.read(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readBySaxInputNotNullNullNotNullOutputExcelCommonException999b1ffe31d03cda38b() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final Sheet arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();

    // Act
    thrown.expect(ExcelCommonException.class);
    EasyExcelFactory.readBySax(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readSheetOutputNotNull9991e6fd7c716e4680f() {

    // Act
    final ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readSheetInputNotNullNotNullOutputNotNull9993f2d957f9f3b4a01() {

    // Arrange
    final Integer arg0 = new Integer(0);
    final String arg1 = "aaaaa";

    // Act
    final ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readSheetInputNotNullOutputNotNull99940f9eccd9dc54654() {

    // Arrange
    final Integer arg0 = new Integer(0);

    // Act
    final ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readSheetInputNotNullOutputNotNull9993070b9e127221433() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeOutputNotNull99917a14fb3d68616c6() {

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNullOutputNotNull999c883fbaf97ec9a0a() {

    // Arrange
    final File arg0 = new File("aaaaa");
    final Class arg1 = null;

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullOutputNotNull99922c551acd4ecb619() {

    // Arrange
    final File arg0 = new File("aaaaa");

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNullOutputNotNull9998293939a8f482680() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final Class arg1 = null;

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullOutputNotNull99925b8c0e3fbf25186() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNullOutputNotNull999cf12da344fb11fbb() {

    // Arrange
    final String arg0 = "aaaaa";
    final Class arg1 = null;

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullOutputNotNull999bb862658f157b1eb() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final ExcelWriterBuilder actual = EasyExcelFactory.write(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerSheetOutputNotNull99989c115824bdc2fcb() {

    // Act
    final ExcelWriterSheetBuilder actual = EasyExcelFactory.writerSheet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerSheetInputNotNullNotNullOutputNotNull999a658289655d25e84() {

    // Arrange
    final Integer arg0 = new Integer(0);
    final String arg1 = "aaaaa";

    // Act
    final ExcelWriterSheetBuilder actual = EasyExcelFactory.writerSheet(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerSheetInputNotNullOutputNotNull999bd0f49180b7ec279() {

    // Arrange
    final Integer arg0 = new Integer(0);

    // Act
    final ExcelWriterSheetBuilder actual = EasyExcelFactory.writerSheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerSheetInputNotNullOutputNotNull99938eba587a7bccded() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final ExcelWriterSheetBuilder actual = EasyExcelFactory.writerSheet(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerTableOutputNotNull999458a11657dceda39() {

    // Act
    final ExcelWriterTableBuilder actual = EasyExcelFactory.writerTable();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writerTableInputNotNullOutputNotNull9997fccb5955a1ad4c5() {

    // Arrange
    final Integer arg0 = new Integer(0);

    // Act
    final ExcelWriterTableBuilder actual = EasyExcelFactory.writerTable(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
