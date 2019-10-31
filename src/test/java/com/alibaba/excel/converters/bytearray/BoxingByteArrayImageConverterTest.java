package com.alibaba.excel.converters.bytearray;

import com.alibaba.excel.converters.bytearray.BoxingByteArrayImageConverter;
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



public class BoxingByteArrayImageConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d7363b23195b2dea() {

    // Act, creating object to test constructor
    final BoxingByteArrayImageConverter actual = new BoxingByteArrayImageConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void convertToExcelDataInput3NotNullNotNullOutputNotNull999fd34950ffd68f094() {
//
//    // Arrange
//    final BoxingByteArrayImageConverter thisObj = new BoxingByteArrayImageConverter();
//    final Byte byte1 = new Byte((short) 0);
//    final Byte byte2 = new Byte((short) 0);
//    final Byte byte3 = new Byte((short) 0);
//    final Byte[] arg0 = { byte1, byte2, byte3 };
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
//    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0 }, actual.getImageValue());
//    Assert.assertNull(actual.getDataFormat());
//    Assert.assertNull(actual.getDataFormatString());
//    Assert.assertNull(actual.getStringValue());
//    Assert.assertNull(actual.getBooleanValue());
//    Assert.assertNull(actual.getNumberValue());
//    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual.getType());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputUnsupportedOperationException9990a5b533d2d15cd76() {

    // Arrange
    final BoxingByteArrayImageConverter thisObj = new BoxingByteArrayImageConverter();
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
  public void supportExcelTypeKeyOutputImage999b64bd31d38802fe0() {

    // Arrange
    final BoxingByteArrayImageConverter thisObj = new BoxingByteArrayImageConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.IMAGE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid999bf7418af3523448d() {

    // Arrange
    final BoxingByteArrayImageConverter thisObj = new BoxingByteArrayImageConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
