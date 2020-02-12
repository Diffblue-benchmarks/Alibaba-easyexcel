package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.exception.ExcelDataConvertException;
import java.text.ParseException;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void parseDateTest3() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtils.parseDate("foo", "foo");
  }
  @Test(timeout=10000)
  public void parseDateTest2() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(ExcelDataConvertException.class);
    DateUtils.parseDate("foo", "");
  }
  @Test(timeout=10000)
  public void formatTest2() {
    // Arrange, Act and Assert
    assertEquals("1970-01-01 00:00:00", DateUtils.format(new Date(1L)));
  }
  @Test(timeout=10000)
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtils.format(new Date(1L), "foo");
  }
  @Test(timeout=10000)
  public void parseDateTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(ExcelDataConvertException.class);
    DateUtils.parseDate("foo");
  }
}

