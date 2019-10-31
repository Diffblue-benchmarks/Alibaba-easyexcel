package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
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



public class ByteArrayImageConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a7fa016d21600c02() {

    // Act, creating object to test constructor
    final ByteArrayImageConverter actual = new ByteArrayImageConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToExcelDataInput24NotNullNotNullOutputNotNull9992ca84be6ad21db66() {

    // Arrange
    final ByteArrayImageConverter thisObj = new ByteArrayImageConverter();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    final CellData actual = thisObj.convertToExcelData(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFormula());
    Assert.assertNull(actual.getFormulaValue());
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, actual.getImageValue());
    Assert.assertNull(actual.getDataFormat());
    Assert.assertNull(actual.getDataFormatString());
    Assert.assertNull(actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputUnsupportedOperationException999947854d513f9a496() {

    // Arrange
    final ByteArrayImageConverter thisObj = new ByteArrayImageConverter();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10 };
    final CellData arg0 = new CellData(myByteArray);
    final ExcelContentProperty arg1 = new ExcelContentProperty();
    final GlobalConfiguration arg2 = new GlobalConfiguration();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.convertToJavaData(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportExcelTypeKeyOutputImage9991ec78720036c0cd0() {

    // Arrange
    final ByteArrayImageConverter thisObj = new ByteArrayImageConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid999c2b1a2a7b2299db5() {

    // Arrange
    final ByteArrayImageConverter thisObj = new ByteArrayImageConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
