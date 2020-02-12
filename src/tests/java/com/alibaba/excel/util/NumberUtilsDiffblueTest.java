package com.alibaba.excel.util;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import java.text.ParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void parseByteTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseByte("foo", new ExcelContentProperty());
  }
  @Test(timeout=10000)
  public void parseShortTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseShort("foo", new ExcelContentProperty());
  }
  @Test(timeout=10000)
  public void parseDoubleTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseDouble("foo", new ExcelContentProperty());
  }
  @Test(timeout=10000)
  public void parseFloatTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseFloat("foo", new ExcelContentProperty());
  }
  @Test(timeout=10000)
  public void parseIntegerTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseInteger("foo", new ExcelContentProperty());
  }
  @Test(timeout=10000)
  public void parseLongTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseLong("foo", new ExcelContentProperty());
  }
}

