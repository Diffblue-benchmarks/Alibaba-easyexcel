package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteStringConverter;
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
import java.text.ParseException;



public class ByteStringConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999682adee616dd3c12() {

    // Act, creating object to test constructor
    final ByteStringConverter actual = new ByteStringConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void convertToExcelDataInputNotNullNotNullNotNullOutputNotNull9997183520ea9322b4d() {
//
//    // Arrange
//    final ByteStringConverter thisObj = new ByteStringConverter();
//    final Byte arg0 = new Byte((short) 0);
//    final ExcelContentProperty arg1 = new ExcelContentProperty();
//    final GlobalConfiguration arg2 = new GlobalConfiguration();
//
//    // Act
//    final CellData actual = thisObj.convertToExcelData(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getFormula());
//    Assert.assertNull(actual.getFormulaValue());
//    Assert.assertNull(actual.getImageValue());
//    Assert.assertNull(actual.getDataFormat());
//    Assert.assertNull(actual.getDataFormatString());
//    Assert.assertEquals("0", actual.getStringValue());
//    Assert.assertNull(actual.getBooleanValue());
//    Assert.assertNull(actual.getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.STRING, actual.getType());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNumberFormatException9993616c5f0a0c76c93() throws ParseException {

    // Arrange
    final ByteStringConverter thisObj = new ByteStringConverter();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final CellData arg0 = new CellData(myByteArray);
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.convertToJavaData(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportExcelTypeKeyOutputString99973a90ec75670c232() {

    // Arrange
    final ByteStringConverter thisObj = new ByteStringConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid9999546791ed46c803b() {

    // Arrange
    final ByteStringConverter thisObj = new ByteStringConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
