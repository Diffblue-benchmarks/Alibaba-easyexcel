package com.alibaba.excel.util;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.NumberUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberUtils_formatTest_5_Test {
  @Test
  public void formatTest() throws Exception {
    // Arrange
    Integer num = new Integer(1);
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act
    String actual = NumberUtils.format(num, contentProperty);

    // Assert
    Assert.assertEquals("1", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
