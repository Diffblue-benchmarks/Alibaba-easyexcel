package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.NumberFormatProperty;
import java.math.RoundingMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_getFormatTest_5_Test {
  @Test
  public void getFormatTest() throws Exception {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("aaaaa", RoundingMode.UP);

    // Act
    String actual = numberFormatProperty.getFormat();

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
