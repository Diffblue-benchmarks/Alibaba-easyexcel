package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_setRoundingModeTest_6_Test {
  @Test
  public void setRoundingModeTest() throws Exception {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("aaaaa", RoundingMode.UP);
    RoundingMode roundingMode = RoundingMode.UP;

    // Act
    numberFormatProperty.setRoundingMode(roundingMode);

    // Assert
    String toStringResult = numberFormatProperty.toString();
    String format = numberFormatProperty.getFormat();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(RoundingMode.UP, numberFormatProperty.getRoundingMode());
    Assert.assertEquals("aaaaa", format);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
