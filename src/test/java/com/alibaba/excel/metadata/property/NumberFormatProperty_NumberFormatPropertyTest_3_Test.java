package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_NumberFormatPropertyTest_3_Test {
  @Test
  public void NumberFormatPropertyTest() throws Exception {
    // Arrange
    String format = "aaaaa";
    RoundingMode roundingMode = RoundingMode.UP;

    // Act
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty(format, roundingMode);

    // Assert
    String toStringResult = numberFormatProperty.toString();
    String format1 = numberFormatProperty.getFormat();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(RoundingMode.UP, numberFormatProperty.getRoundingMode());
    Assert.assertEquals("aaaaa", format1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
