package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_getFontHeightInPointsTest_5_Test {
  @Test
  public void getFontHeightInPointsTest() throws Exception {
    // Arrange
    Font font = new Font();

    // Act
    short actual = font.getFontHeightInPoints();

    // Assert
    Assert.assertEquals((short) 0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
