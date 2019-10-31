package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;



public class GenerateParamTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNullNotNullOutputNotNull9998be6e04b32dd28c2() {

    // Arrange
    final String arg0 = "aaaaa";
    final Class arg1 = null;
    final ByteArrayOutputStream arg2 = new ByteArrayOutputStream();

    // Act, creating object to test constructor
    final GenerateParam actual = new GenerateParam(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isNeedHead());
    Assert.assertNull(actual.getClazz());
    Assert.assertNotNull(actual.getOutputStream());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(actual.getOutputStream(), "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) actual.getOutputStream()).size());
    Assert.assertEquals("aaaaa", actual.getSheetName());
    Assert.assertNull(actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getClazzOutputVoid99996d0c8d9be637f79() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act
    final Class actual = thisObj.getClazz();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputStreamOutputNotNull999603823c5e76b8fa4() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act
    final OutputStream actual = thisObj.getOutputStream();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(actual, "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) actual).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSheetNameOutputNotNull99937a13cf73b5d8d9d() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act
    final String actual = thisObj.getSheetName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputVoid999502789aad2a5c582() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act
    final ExcelTypeEnum actual = thisObj.getType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isNeedHeadOutputTrue999a589aaa05273910e() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);

    // Act
    final boolean actual = thisObj.isNeedHead();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setClazzInputNullOutputVoid999ba50c92ece1c3de6() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final Class arg0 = null;

    // Act
    thisObj.setClazz(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNeedHeadInputTrueOutputVoid999b4bf15f369220f53() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final boolean arg0 = true;

    // Act
    thisObj.setNeedHead(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setOutputStreamInputNotNullOutputVoid99959f53e6fc19a16dd() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    thisObj.setOutputStream(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSheetNameInputNotNullOutputVoid9997e95235fb7612a26() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSheetName(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeInputXlsOutputVoid99917bbe44677ab00a3() {

    // Arrange
    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final GenerateParam thisObj = new GenerateParam("aaaaa", null, byteArrayOutputStream);
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    thisObj.setType(arg0);

    // Assert side effects
    Assert.assertEquals(ExcelTypeEnum.XLS, thisObj.getType());

  }
}
