package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_getRoundingModeTest_2_Test {
  @Test
  public void getRoundingModeTest() throws Exception {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    RoundingMode actual = numberFormatProperty.getRoundingMode();

    // Assert
    Assert.assertEquals(RoundingMode.UP, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
