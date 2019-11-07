package com.alibaba.excel.util;

import com.alibaba.excel.exception.ExcelDataConvertException;
import com.alibaba.excel.util.DateUtils;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DateUtils_parseDateTest_1_Test {
  @Test
  public void parseDateTest() throws Exception {
    // Arrange
    String dateString = "";

    // Act and Assert
    thrown.expect(ExcelDataConvertException.class);
    DateUtils.parseDate(dateString);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
