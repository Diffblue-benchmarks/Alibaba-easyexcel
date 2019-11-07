package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_setItalicTest_4_Test {
  @Test
  public void setItalicTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();
    Boolean italic = new Boolean(true);

    // Act
    writeFont.setItalic(italic);

    // Assert
    Short fontHeightInPoints = writeFont.getFontHeightInPoints();
    Byte underline = writeFont.getUnderline();
    Boolean italic1 = writeFont.getItalic();
    String toStringResult = writeFont.toString();
    Short typeOffset = writeFont.getTypeOffset();
    Boolean bold = writeFont.getBold();
    String fontName = writeFont.getFontName();
    Boolean strikeout = writeFont.getStrikeout();
    Short color = writeFont.getColor();
    Assert.assertEquals(null, fontHeightInPoints);
    Assert.assertEquals(null, writeFont.getCharset());
    Assert.assertEquals(null, color);
    Assert.assertEquals(null, strikeout);
    Assert.assertEquals(null, fontName);
    Assert.assertEquals(null, bold);
    Assert.assertEquals(null, typeOffset);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Boolean.valueOf(true), italic1);
    Assert.assertEquals(null, underline);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
