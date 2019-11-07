package com.alibaba.excel.util;

import com.alibaba.excel.util.DateUtils;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateUtils_formatTest_2_Test {
  @Test
  public void formatTest() throws Exception {
    // Arrange
    Date date = new Date(1L);
    String dateFormat = "";

    // Act
    String actual = DateUtils.format(date, dateFormat);

    // Assert
    Assert.assertEquals("1970-01-01 01:00:00", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
