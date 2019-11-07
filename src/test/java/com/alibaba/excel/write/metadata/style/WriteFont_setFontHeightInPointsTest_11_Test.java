package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_setFontHeightInPointsTest_11_Test {
  @Test
  public void setFontHeightInPointsTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();
    Short fontHeightInPoints = new Short((short) 1);

    // Act
    writeFont.setFontHeightInPoints(fontHeightInPoints);

    // Assert
    Short fontHeightInPoints1 = writeFont.getFontHeightInPoints();
    Byte underline = writeFont.getUnderline();
    Boolean italic = writeFont.getItalic();
    String toStringResult = writeFont.toString();
    Short typeOffset = writeFont.getTypeOffset();
    Boolean bold = writeFont.getBold();
    String fontName = writeFont.getFontName();
    Boolean strikeout = writeFont.getStrikeout();
    Short color = writeFont.getColor();
    Assert.assertEquals(Short.valueOf((short) 1), fontHeightInPoints1);
    Assert.assertEquals(null, writeFont.getCharset());
    Assert.assertEquals(null, color);
    Assert.assertEquals(null, strikeout);
    Assert.assertEquals(null, fontName);
    Assert.assertEquals(null, bold);
    Assert.assertEquals(null, typeOffset);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, italic);
    Assert.assertEquals(null, underline);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
