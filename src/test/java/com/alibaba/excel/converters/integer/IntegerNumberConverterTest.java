package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerNumberConverter;
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



public class IntegerNumberConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999634cd727e81613df() {

    // Act, creating object to test constructor
    final IntegerNumberConverter actual = new IntegerNumberConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToExcelDataInputNotNullNotNullNotNullOutputNotNull999f294beef090dec75() {

    // Arrange
    final IntegerNumberConverter thisObj = new IntegerNumberConverter();
    final Integer arg0 = new Integer(1);
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    final CellData actual = thisObj.convertToExcelData(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertNull(actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNotNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNullPointerException99921dd2d332f5e2ae1() {

    // Arrange
    final IntegerNumberConverter thisObj = new IntegerNumberConverter();
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
  public void supportExcelTypeKeyOutputNumber9994d2568e93d678b1f() {

    // Arrange
    final IntegerNumberConverter thisObj = new IntegerNumberConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.NUMBER, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid999b9581677b9c17263() {

    // Arrange
    final IntegerNumberConverter thisObj = new IntegerNumberConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
