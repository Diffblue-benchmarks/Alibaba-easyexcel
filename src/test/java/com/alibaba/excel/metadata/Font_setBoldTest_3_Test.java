package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Font_setBoldTest_3_Test {
  @Test
  public void setBoldTest() throws Exception {
    // Arrange
    Font font = new Font();
    boolean bold = true;

    // Act
    font.setBold(bold);

    // Assert
    String toStringResult = font.toString();
    String fontName = font.getFontName();
    boolean isBoldResult = font.isBold();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 0, font.getFontHeightInPoints());
    Assert.assertTrue(isBoldResult);
    Assert.assertEquals(null, fontName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
