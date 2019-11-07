package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_getFontNameTest_4_Test {
  @Test
  public void getFontNameTest() throws Exception {
    // Arrange
    Font font = new Font();

    // Act
    String actual = font.getFontName();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
