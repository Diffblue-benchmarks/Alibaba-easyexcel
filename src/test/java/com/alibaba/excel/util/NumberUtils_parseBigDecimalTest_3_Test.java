package com.alibaba.excel.util;

import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.NumberUtils;
import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class NumberUtils_parseBigDecimalTest_3_Test {
  @Test
  public void parseBigDecimalTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    ExcelContentProperty contentProperty = new ExcelContentProperty();

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    NumberUtils.parseBigDecimal(string, contentProperty);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
