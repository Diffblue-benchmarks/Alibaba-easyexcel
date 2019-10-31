package com.alibaba.excel.util;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.NumberUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.text.ParseException;



public class NumberUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void formatInputNotNullNotNullOutputNotNull99974ab28182ae2a28d() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    final String actual = NumberUtils.format(arg0, arg1);

    // Assert result
    Assert.assertEquals("1", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatToCellDataInputNotNullNotNullOutputNotNull99943883566b1306064() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    final CellData actual = NumberUtils.formatToCellData(arg0, arg1);

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
  public void parseBigDecimalInputNotNullNotNullOutputNumberFormatException999638b6de01e62a949() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseByteInputNotNullNotNullOutputNumberFormatException999aa5eaccd1655fa3f() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseDoubleInputNotNullNotNullOutputNumberFormatException999cded14634b2024ce() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseFloatInputNotNullNotNullOutputNumberFormatException999d6a16bea8eb14a15() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseIntegerInputNotNullNotNullOutputNumberFormatException999af1db55fc132604c() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseInteger(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseLongInputNotNullNotNullOutputNumberFormatException9996ec5edf3f560c5d4() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseShortInputNotNullNotNullOutputNumberFormatException999be996f0a1da6d97f() throws ParseException {

    // Arrange
    final String arg0 = "aaaaa";
    final ExcelContentProperty arg1 = new ExcelContentProperty();

    // Act
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
