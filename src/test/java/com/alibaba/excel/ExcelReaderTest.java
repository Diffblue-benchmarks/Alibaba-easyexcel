package com.alibaba.excel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.parameter.AnalysisParam;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;



public class ExcelReaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputExcelAnalysisException999411b1ba6f0a3067c() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myByteArray);
    final AnalysisParam arg0 = new AnalysisParam(byteArrayInputStream, ExcelTypeEnum.XLS, "Can not use a finished reader.");
    final SyncReadListener arg1 = new SyncReadListener();
    try {

      // Act, creating object to test constructor
      thrown.expect(ExcelAnalysisException.class);
      new ExcelReader(arg0, arg1);
    } catch (ExcelAnalysisException ex) {

      // Assert side effects
      Assert.assertNotNull(arg0);
      Assert.assertEquals(ExcelTypeEnum.XLS, arg0.getExcelTypeEnum());
      Assert.assertEquals("Can not use a finished reader.", arg0.getCustomContent());
      Assert.assertNotNull(arg0.getIn());
      Assert.assertEquals(24, Reflector.getInstanceField(arg0.getIn(), "count"));
      Assert.assertEquals(0, Reflector.getInstanceField(arg0.getIn(), "mark"));
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 }, ((byte[]) Reflector.getInstanceField(arg0.getIn(), "buf")));
      Assert.assertEquals(24, Reflector.getInstanceField(arg0.getIn(), "pos"));
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputExcelAnalysisException999f4f3c83afb3fe2ab() {

    // Arrange
    final ReadWorkbook arg0 = new ReadWorkbook();

    // Act, creating object to test constructor
    thrown.expect(ExcelAnalysisException.class);
    new ExcelReader(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullXlsNotNullNotNullTrueOutputExcelAnalysisException999e3e82a786f6402df() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;
    final Object arg2 = "Can not use a finished reader.";
    final SyncReadListener arg3 = new SyncReadListener();
    final boolean arg4 = true;
    try {

      // Act, creating object to test constructor
      thrown.expect(ExcelAnalysisException.class);
      new ExcelReader(arg0, arg1, arg2, arg3, arg4);
    } catch (ExcelAnalysisException ex) {

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
  public void constructorInputNotNullXlsNotNullNotNullOutputExcelAnalysisException999dbb551a7c5e628e5() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final ExcelTypeEnum arg1 = ExcelTypeEnum.XLS;
    final Object arg2 = "Can not use a finished reader.";
    final SyncReadListener arg3 = new SyncReadListener();
    try {

      // Act, creating object to test constructor
      thrown.expect(ExcelAnalysisException.class);
      new ExcelReader(arg0, arg1, arg2, arg3);
    } catch (ExcelAnalysisException ex) {

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
  public void constructorInputNotNullNullNotNullTrueOutputExcelCommonException99971cd85f8ffb4a95b() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final Object arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();
    final boolean arg3 = true;

    // Act, creating object to test constructor
    thrown.expect(ExcelCommonException.class);
    new ExcelReader(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNullNotNullOutputExcelCommonException999af7256bd1495cd2f() {

    // Arrange
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final Object arg1 = null;
    final SyncReadListener arg2 = new SyncReadListener();

    // Act, creating object to test constructor
    thrown.expect(ExcelCommonException.class);
    new ExcelReader(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
