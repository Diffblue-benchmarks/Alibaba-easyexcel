package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_setFormatTest_1_Test {
  @Test
  public void setFormatTest() throws Exception {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("aaaaa", RoundingMode.UP);
    String format = "aaaaa";

    // Act
    numberFormatProperty.setFormat(format);

    // Assert
    String format1 = numberFormatProperty.getFormat();
    Assert.assertEquals("aaaaa", format1);
    Assert.assertEquals(RoundingMode.UP, numberFormatProperty.getRoundingMode());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
