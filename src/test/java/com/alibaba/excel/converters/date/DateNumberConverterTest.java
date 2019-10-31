package com.alibaba.excel.converters.date;

import com.alibaba.excel.converters.date.DateNumberConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.Date;



public class DateNumberConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f2b4df57d0e9aebf() {

    // Act, creating object to test constructor
    final DateNumberConverter actual = new DateNumberConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToExcelDataInputNotNullNotNullNotNullOutputNullPointerException9994dcc7d5dc6524d19() {

    // Arrange
    final DateNumberConverter thisObj = new DateNumberConverter();
    final Date arg0 = new Date(1L);
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.convertToExcelData(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNullPointerException999237ae6a9570f9a3f() {

    // Arrange
    final DateNumberConverter thisObj = new DateNumberConverter();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final CellData arg0 = new CellData(myByteArray);
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.convertToJavaData(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportExcelTypeKeyOutputNumber999358d3a49958c9706() {

    // Arrange
    final DateNumberConverter thisObj = new DateNumberConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid9995da87a104d4d19d3() {

    // Arrange
    final DateNumberConverter thisObj = new DateNumberConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
