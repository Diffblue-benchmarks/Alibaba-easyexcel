package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteBooleanConverter;
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



public class ByteBooleanConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995cb7c0b1607259ec() {

    // Act, creating object to test constructor
    final ByteBooleanConverter actual = new ByteBooleanConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void convertToExcelDataInputNotNullNotNullNotNullOutputNotNull99968b28f4013f89bbd() {
//
//    // Arrange
//    final ByteBooleanConverter thisObj = new ByteBooleanConverter();
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
//    Assert.assertNull(actual.getStringValue());
//    Assert.assertNotNull(actual.getBooleanValue());
//    Assert.assertNull(actual.getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual.getType());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNullPointerException999f95334f01f00c669() {

    // Arrange
    final ByteBooleanConverter thisObj = new ByteBooleanConverter();
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
  public void supportExcelTypeKeyOutputBoolean99930c5c6436a47b49d() {

    // Arrange
    final ByteBooleanConverter thisObj = new ByteBooleanConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid9994a05711c97338dc7() {

    // Arrange
    final ByteBooleanConverter thisObj = new ByteBooleanConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
