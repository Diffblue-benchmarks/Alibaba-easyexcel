package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_setUnderlineTest_5_Test {
  @Test
  public void setUnderlineTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();
    Byte underline = new Byte((byte) 0);

    // Act
    writeFont.setUnderline(underline);

    // Assert
    Short fontHeightInPoints = writeFont.getFontHeightInPoints();
    Byte underline1 = writeFont.getUnderline();
    Boolean italic = writeFont.getItalic();
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
    Assert.assertEquals(null, italic);
    Assert.assertEquals(Byte.valueOf((byte) 0), underline1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
