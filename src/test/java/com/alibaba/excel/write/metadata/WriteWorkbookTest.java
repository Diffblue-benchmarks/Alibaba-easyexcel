package com.alibaba.excel.write.metadata;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class WriteWorkbookTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999403b66205613123a() {

    // Act, creating object to test constructor
    final WriteWorkbook actual = new WriteWorkbook();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOutputStream());
    Assert.assertNull(actual.getFile());
    Assert.assertNull(actual.getExcelType());
    Assert.assertNull(actual.getTemplateFile());
    Assert.assertNull(actual.getMandatoryUseInputStream());
    Assert.assertNull(actual.getConvertAllFiled());
    Assert.assertNull(actual.getAutoCloseStream());
    Assert.assertNull(actual.getTemplateInputStream());
    Assert.assertNull(actual.getWriteHandler());
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
  public void getAutoCloseStreamOutputVoid9992b4168f4faf17b5c() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final Boolean actual = thisObj.getAutoCloseStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConvertAllFiledOutputVoid9994ec898899e04a8b0() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final Boolean actual = thisObj.getConvertAllFiled();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getExcelTypeOutputVoid999aab85b3191808400() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final ExcelTypeEnum actual = thisObj.getExcelType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileOutputVoid9997eeb3a794e19ee52() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final File actual = thisObj.getFile();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMandatoryUseInputStreamOutputVoid9996b11455f4140e707() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final Boolean actual = thisObj.getMandatoryUseInputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputStreamOutputVoid9997d813221bb056424() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final OutputStream actual = thisObj.getOutputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTemplateFileOutputVoid999706a0d7444ee0c2d() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final File actual = thisObj.getTemplateFile();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTemplateInputStreamOutputVoid9995d697200ced8ac04() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final InputStream actual = thisObj.getTemplateInputStream();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWriteHandlerOutputVoid999ff2e4ee88a05843e() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();

    // Act
    final com.alibaba.excel.event.WriteHandler actual = thisObj.getWriteHandler();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoCloseStreamInputNotNullOutputVoid999572c132ff41e7f19() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setAutoCloseStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAutoCloseStream());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConvertAllFiledInputNotNullOutputVoid999bb20701c60339cc2() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setConvertAllFiled(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getConvertAllFiled());

  }

  // Test written by Diffblue Cover
  @Test
  public void setExcelTypeInputXlsOutputVoid99918ba3fb0b4e3b3f2() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final ExcelTypeEnum arg0 = ExcelTypeEnum.XLS;

    // Act
    thisObj.setExcelType(arg0);

    // Assert side effects
    Assert.assertEquals(ExcelTypeEnum.XLS, thisObj.getExcelType());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileInputNotNullOutputVoid999e218dd41e8e3917f() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final File arg0 = new File("aaaaa");

    // Act
    thisObj.setFile(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFile());
    Assert.assertEquals("aaaaa", thisObj.getFile().getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMandatoryUseInputStreamInputNotNullOutputVoid999320358f1ecc38994() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setMandatoryUseInputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getMandatoryUseInputStream());

  }

  // Test written by Diffblue Cover
  @Test
  public void setOutputStreamInputNotNullOutputVoid999c126762f6e986db7() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();

    // Act
    thisObj.setOutputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getOutputStream());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(thisObj.getOutputStream(), "buf")));
    Assert.assertEquals(0, ((ByteArrayOutputStream) thisObj.getOutputStream()).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTemplateFileInputNotNullOutputVoid999ad2a21db8827ebf9() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final File arg0 = new File("aaaaa");

    // Act
    thisObj.setTemplateFile(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTemplateFile());
    Assert.assertEquals("aaaaa", thisObj.getTemplateFile().getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTemplateInputStreamInputNotNullOutputVoid999d913f01690de8b72() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    thisObj.setTemplateInputStream(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getTemplateInputStream());
    Assert.assertEquals(24, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0 }, ((byte[]) Reflector.getInstanceField(thisObj.getTemplateInputStream(), "buf")));
    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getTemplateInputStream(), "pos"));

  }

  // Test written by Diffblue Cover
  @Test
  public void setWriteHandlerInputNullOutputVoid9991f39fd2470520c51() {

    // Arrange
    final WriteWorkbook thisObj = new WriteWorkbook();
    final com.alibaba.excel.event.WriteHandler arg0 = null;

    // Act
    thisObj.setWriteHandler(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
