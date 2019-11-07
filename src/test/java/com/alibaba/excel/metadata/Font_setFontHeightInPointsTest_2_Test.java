package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_setFontHeightInPointsTest_2_Test {
  @Test
  public void setFontHeightInPointsTest() throws Exception {
    // Arrange
    Font font = new Font();
    short fontHeightInPoints = (short) 1;

    // Act
    font.setFontHeightInPoints(fontHeightInPoints);

    // Assert
    String toStringResult = font.toString();
    String fontName = font.getFontName();
    boolean isBoldResult = font.isBold();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 1, font.getFontHeightInPoints());
    Assert.assertFalse(isBoldResult);
    Assert.assertEquals(null, fontName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
