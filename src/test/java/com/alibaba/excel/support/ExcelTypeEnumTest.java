package com.alibaba.excel.support;

import com.alibaba.excel.exception.ExcelCommonException;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Array;



public class ExcelTypeEnumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getValueOutputNotNull9991a8c57ee26d773e3() {

    // Arrange
    final ExcelTypeEnum thisObj = ExcelTypeEnum.XLS;

    // Act
    final String actual = thisObj.getValue();

    // Assert result
    Assert.assertEquals(".xls", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setValueInputNotNullOutputVoid999e90dd4e5f3ed6bba() {

    // Arrange
    final ExcelTypeEnum thisObj = ExcelTypeEnum.XLS;
    final String arg0 = ".xls";

    // Act
    thisObj.setValue(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullNotNullOutputExcelCommonException9998937a16211c42a0a() {

    // Arrange
    final File arg0 = new File(".xls");
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(ExcelCommonException.class);
    ExcelTypeEnum.valueOf(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException99999afa9e36d978cc2() {

    // Arrange
    final String arg0 = ".xls";

    // Act
    thrown.expect(IllegalArgumentException.class);
    ExcelTypeEnum.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput299903f625b7dfe6e9fa() {

    // Act
    final ExcelTypeEnum[] actual = ExcelTypeEnum.values();

    // Assert result
    Assert.assertArrayEquals(new ExcelTypeEnum[]{ ExcelTypeEnum.XLS, ExcelTypeEnum.XLSX }, actual);

  }
}
