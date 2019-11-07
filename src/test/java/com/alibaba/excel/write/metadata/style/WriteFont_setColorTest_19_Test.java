package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_setColorTest_19_Test {
  @Test
  public void setColorTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();
    Short color = new Short((short) 1);

    // Act
    writeFont.setColor(color);

    // Assert
    Short fontHeightInPoints = writeFont.getFontHeightInPoints();
    Byte underline = writeFont.getUnderline();
    Boolean italic = writeFont.getItalic();
    String toStringResult = writeFont.toString();
    Short typeOffset = writeFont.getTypeOffset();
    Boolean bold = writeFont.getBold();
    String fontName = writeFont.getFontName();
    Boolean strikeout = writeFont.getStrikeout();
    Short color1 = writeFont.getColor();
    Assert.assertEquals(null, fontHeightInPoints);
    Assert.assertEquals(null, writeFont.getCharset());
    Assert.assertEquals(Short.valueOf((short) 1), color1);
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
