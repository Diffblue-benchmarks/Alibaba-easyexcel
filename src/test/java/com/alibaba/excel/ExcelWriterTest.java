package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class ExcelWriterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9993d62fbc97578c212() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam arg0 = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act, creating object to test constructor
    final ExcelWriter actual = new ExcelWriter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9996b219e42dc96d049() {

    // Arrange
    final WriteWorkbook arg0 = new WriteWorkbook();

    // Act, creating object to test constructor
    final ExcelWriter actual = new ExcelWriter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullXlsNotNullNotNullOutputExcelGenerateException999b1729127330aacee() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ByteArrayOutputStream arg1 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg2 = ExcelTypeEnum.XLS;
    final Boolean arg3 = new Boolean(true);
    final LoopMergeStrategy arg4 = new LoopMergeStrategy(1, 1);
    try {

      // Act, creating object to test constructor
      thrown.expect(ExcelGenerateException.class);
      new ExcelWriter(arg0, arg1, arg2, arg3, arg4);
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
  public void constructorInputNotNullNotNullXlsNotNullOutputExcelGenerateException9992e2c20daadf90111() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ByteArrayOutputStream arg1 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg2 = ExcelTypeEnum.XLS;
    final Boolean arg3 = new Boolean(true);
    try {

      // Act, creating object to test constructor
      thrown.expect(ExcelGenerateException.class);
      new ExcelWriter(arg0, arg1, arg2, arg3);
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
  public void constructorInputNotNullXlsTrueOutputNotNull9997b21f644f0cba3b2() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final ExcelWriter actual = new ExcelWriter(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullXlsOutputNotNull9994a64dbccc16ea72d() {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;

    // Act, creating object to test constructor
    final ExcelWriter actual = new ExcelWriter(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void finishOutputVoid9991da1fdbc62aff306() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);

    // Act
    thisObj.finish();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInputPositivePositivePositivePositiveOutputNullPointerException999673cedbe3ed18f5e() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final int arg0 = 1;
    final int arg1 = 1;
    final int arg2 = 1;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void write0InputNotNullNotNullNotNullOutputNotNull999cf45c16d571dbe85() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);
    final Integer integer = new Integer(1);
    final Table arg2 = new Table(integer);

    // Act
    final ExcelWriter actual = thisObj.write0(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void write0InputNotNullNotNullOutputNotNull9999975c27346395ebd() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);

    // Act
    final ExcelWriter actual = thisObj.write0(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNotNullNotNullOutputNotNull9994bfc8491b7200926() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);
    final Integer integer = new Integer(1);
    final Table arg2 = new Table(integer);

    // Act
    final ExcelWriter actual = thisObj.write(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void write1InputNotNullNotNullNotNullOutputNotNull999bb50bffbc9af84bb() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);
    final Integer integer = new Integer(1);
    final Table arg2 = new Table(integer);

    // Act
    final ExcelWriter actual = thisObj.write1(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void write1InputNotNullNotNullOutputNotNull999001aa8b5f64ea825() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);

    // Act
    final ExcelWriter actual = thisObj.write1(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNotNullOutputNotNull999eece346f1e653d7e() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final Sheet arg1 = new Sheet(1);

    // Act
    final ExcelWriter actual = thisObj.write(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNotNullNotNullOutputNotNull99925bac6db47e2bd31() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final WriteSheet arg1 = new WriteSheet();
    final WriteTable arg2 = new WriteTable();

    // Act
    final ExcelWriter actual = thisObj.write(arg0, arg1, arg2);

    // Assert side effects
    Assert.assertNotNull(arg2);
    Assert.assertNotNull(arg2.getTableNo());
    Assert.assertNull(arg2.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, arg2.getCustomWriteHandlerList());
    Assert.assertNull(arg2.getNeedHead());
    Assert.assertNull(arg2.getRelativeHeadRowIndex());
    Assert.assertNull(arg2.getClazz());
    Assert.assertNull(arg2.getAutoTrim());
    Assert.assertNull(arg2.getCustomConverterList());
    Assert.assertNull(arg2.getHead());
    Assert.assertNull(arg2.getUse1904windowing());
    Assert.assertNotNull(arg1);
    Assert.assertNull(arg1.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, arg1.getColumnWidthMap());
    Assert.assertNotNull(arg1.getSheetNo());
    Assert.assertNull(arg1.getTableStyle());
    final ArrayList<WriteHandler> arrayList1 = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList1, arg1.getCustomWriteHandlerList());
    Assert.assertNull(arg1.getNeedHead());
    Assert.assertNull(arg1.getRelativeHeadRowIndex());
    Assert.assertNull(arg1.getClazz());
    Assert.assertNull(arg1.getAutoTrim());
    Assert.assertNull(arg1.getCustomConverterList());
    Assert.assertNull(arg1.getHead());
    Assert.assertNull(arg1.getUse1904windowing());

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullNotNullOutputNotNull9990e52f4b140988890() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaak");
    final WriteSheet arg1 = new WriteSheet();

    // Act
    final ExcelWriter actual = thisObj.write(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertNull(arg1.getSheetName());
    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    Assert.assertEquals(hashMap, arg1.getColumnWidthMap());
    Assert.assertNotNull(arg1.getSheetNo());
    Assert.assertNull(arg1.getTableStyle());
    final ArrayList<WriteHandler> arrayList = new ArrayList<WriteHandler>();
    Assert.assertEquals(arrayList, arg1.getCustomWriteHandlerList());
    Assert.assertNull(arg1.getNeedHead());
    Assert.assertNull(arg1.getRelativeHeadRowIndex());
    Assert.assertNull(arg1.getClazz());
    Assert.assertNull(arg1.getAutoTrim());
    Assert.assertNull(arg1.getCustomConverterList());
    Assert.assertNull(arg1.getHead());
    Assert.assertNull(arg1.getUse1904windowing());

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeContextOutputNotNull999972e9c4f9c1dc2cb() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam generateParam = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelWriter thisObj = new ExcelWriter(generateParam);

    // Act
    final WriteContext actual = thisObj.writeContext();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
