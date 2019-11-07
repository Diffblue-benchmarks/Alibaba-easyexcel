package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_FontTest_7_Test {
  @Test
  public void FontTest() throws Exception {
    // Arrange and Act
    Font font = new Font();

    // Assert
    String fontName = font.getFontName();
    boolean isBoldResult = font.isBold();
    Assert.assertEquals(null, fontName);
    Assert.assertEquals((short) 0, font.getFontHeightInPoints());
    Assert.assertFalse(isBoldResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
