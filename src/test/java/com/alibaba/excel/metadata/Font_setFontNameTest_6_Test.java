package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_setFontNameTest_6_Test {
  @Test
  public void setFontNameTest() throws Exception {
    // Arrange
    Font font = new Font();
    String fontName = "aaaaa";

    // Act
    font.setFontName(fontName);

    // Assert
    String toStringResult = font.toString();
    String fontName1 = font.getFontName();
    boolean isBoldResult = font.isBold();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 0, font.getFontHeightInPoints());
    Assert.assertFalse(isBoldResult);
    Assert.assertEquals("aaaaa", fontName1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
