package com.alibaba.excel.converters;

import com.alibaba.excel.converters.AutoConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AutoConverter_supportJavaTypeKeyTest_4_Test {
  @Test
  public void supportJavaTypeKeyTest() throws Exception {
    // Arrange
    AutoConverter autoConverter = new AutoConverter();

    // Act
    Class actual = autoConverter.supportJavaTypeKey();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
