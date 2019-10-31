package com.alibaba.excel.util;

import com.alibaba.excel.exception.ExcelDataConvertException;
import com.alibaba.excel.util.DateUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.text.ParseException;
import java.util.Date;



public class DateUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void formatInputNotNullNotNullOutputNotNull999b47891898704457c() {

    // Arrange
    final Date arg0 = new Date(1L);
    final String arg1 = "";

    // Act
    final String actual = DateUtils.format(arg0, arg1);

    // Assert result
    Assert.assertEquals("1970-01-01 01:00:00", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatInputNotNullOutputNotNull999e6b10c01e2df68e1() {

    // Arrange
    final Date arg0 = new Date(1L);

    // Act
    final String actual = DateUtils.format(arg0);

    // Assert result
    Assert.assertEquals("1970-01-01 01:00:00", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseDateInputNotNullNotNullOutputExcelDataConvertException9991368baa5792acf51() throws ParseException {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";

    // Act
    thrown.expect(ExcelDataConvertException.class);
    DateUtils.parseDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseDateInputNotNullOutputExcelDataConvertException9997f0ebd09f531c08e() throws ParseException {

    // Arrange
    final String arg0 = "";

    // Act
    thrown.expect(ExcelDataConvertException.class);
    DateUtils.parseDate(arg0);

    // The method is not expected to return due to exception thrown

  }
}
