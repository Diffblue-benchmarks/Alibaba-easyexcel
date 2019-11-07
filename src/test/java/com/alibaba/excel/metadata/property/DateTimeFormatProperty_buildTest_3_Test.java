package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DateTimeFormatProperty_buildTest_3_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    DateTimeFormat dateTimeFormat = (DateTimeFormat) null;

    // Act
    DateTimeFormatProperty actual = DateTimeFormatProperty.build(dateTimeFormat);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
