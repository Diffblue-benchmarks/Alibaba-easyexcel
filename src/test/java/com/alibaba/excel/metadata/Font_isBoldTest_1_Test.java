package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_isBoldTest_1_Test {
  @Test
  public void isBoldTest() throws Exception {
    // Arrange
    Font font = new Font();

    // Act
    boolean actual = font.isBold();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
