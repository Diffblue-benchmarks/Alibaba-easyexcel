package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class NumberFormatProperty_buildTest_4_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    NumberFormat numberFormat = (NumberFormat) null;

    // Act
    NumberFormatProperty actual = NumberFormatProperty.build(numberFormat);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
