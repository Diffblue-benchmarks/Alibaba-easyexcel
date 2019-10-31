package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.byteconverter.ByteNumberConverter;
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



public class ByteNumberConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999786be799c0e57da4() {

    // Act, creating object to test constructor
    final ByteNumberConverter actual = new ByteNumberConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void convertToExcelDataInputNotNullNotNullNotNullOutputNotNull999092c7704016847a4() {
//
//    // Arrange
//    final ByteNumberConverter thisObj = new ByteNumberConverter();
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
//    Assert.assertNull(actual.getBooleanValue());
//    Assert.assertNotNull(actual.getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual.getType());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNullPointerException999b01b63f944b869a3() {

    // Arrange
    final ByteNumberConverter thisObj = new ByteNumberConverter();
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
  public void supportExcelTypeKeyOutputNumber999a254fae6175f7a31() {

    // Arrange
    final ByteNumberConverter thisObj = new ByteNumberConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid999101ffa5c5b9831f9() {

    // Arrange
    final ByteNumberConverter thisObj = new ByteNumberConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
