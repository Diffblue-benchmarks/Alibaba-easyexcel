package com.alibaba.excel.parameter;

import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;



public class AnalysisParamTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullXlsNotNullOutputNotNull9999ae5343cd9c49c30() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;
    final Object arg2 = "aaaaa";

    // Act, creating object to test constructor
    final AnalysisParam actual = new AnalysisParam(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(ExcelTypeEnum.XLS, actual.getExcelTypeEnum());
    Assert.assertEquals("aaaaa", actual.getCustomContent());
    Assert.assertNotNull(actual.getIn());
    Assert.assertEquals(24, Reflector.getInstanceField(actual.getIn(), "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual.getIn(), "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(actual.getIn(), "buf")));
    Assert.assertEquals(0, Reflector.getInstanceField(actual.getIn(), "pos"));

  }

  // Test written by Diffblue Cover
  @Test
  public void getCustomContentOutputNotNull9995b30d7dab008b6dd() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");

    // Act
    final Object actual = thisObj.getCustomContent();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getExcelTypeEnumOutputXls99986fd6c269e79c354() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");

    // Act
    final ExcelTypeEnum actual = thisObj.getExcelTypeEnum();

    // Assert result
    Assert.assertEquals(ExcelTypeEnum.XLS, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInOutputNotNull99920626a356b4d239d() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");

    // Act
    final InputStream actual = thisObj.getIn();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(24, Reflector.getInstanceField(actual, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(actual, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 }, ((byte[]) Reflector.getInstanceField(actual, "buf")));
    Assert.assertEquals(0, Reflector.getInstanceField(actual, "pos"));

  }

  // Test written by Diffblue Cover
  @Test
  public void setCustomContentInputNotNullOutputVoid99940451923a8581067() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");
    final Object arg0 = "aaaaa";

    // Act
    thisObj.setCustomContent(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setExcelTypeEnumInputXlsOutputVoid999fbfa0b7a67be7cd1() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    thisObj.setExcelTypeEnum(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setInInputNotNullOutputVoid99990eda2be8a788082() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam thisObj = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "aaaaa");
    final InputStream arg0 = byteArrayInputStream;

    // Act
    thisObj.setIn(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
