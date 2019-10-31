package com.alibaba.excel.converters.integer;

import com.alibaba.excel.converters.integer.IntegerStringConverter;
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



public class IntegerStringConverterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99979c92e04d65c603f() {

    // Act, creating object to test constructor
    final IntegerStringConverter actual = new IntegerStringConverter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToExcelDataInputNotNullNotNullNotNullOutputNotNull9999a862e4062ce39b3() {

    // Arrange
    final IntegerStringConverter thisObj = new IntegerStringConverter();
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
    Assert.assertEquals("1", actual.getStringValue());
    Assert.assertNull(actual.getBooleanValue());
    Assert.assertNull(actual.getNumberValue());
    Assert.assertEquals(CellDataTypeEnum.STRING, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToJavaDataInputNotNullNotNullNotNullOutputNumberFormatException9993db0eed207364880() throws ParseException {

    // Arrange
    final IntegerStringConverter thisObj = new IntegerStringConverter();
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
  public void supportExcelTypeKeyOutputString999366ff0422e8a93c4() {

    // Arrange
    final IntegerStringConverter thisObj = new IntegerStringConverter();

    // Act
    final CellDataTypeEnum actual = thisObj.supportExcelTypeKey();

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.STRING, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void supportJavaTypeKeyOutputVoid999b328d6478f37035b() {

    // Arrange
    final IntegerStringConverter thisObj = new IntegerStringConverter();

    // Act
    final Class actual = thisObj.supportJavaTypeKey();

    // The method returns void, testing that no exception is thrown

  }
}
