package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_setBoldTest_15_Test {
  @Test
  public void setBoldTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();
    Boolean bold = new Boolean(true);

    // Act
    writeFont.setBold(bold);

    // Assert
    Byte underline = writeFont.getUnderline();
    Boolean italic = writeFont.getItalic();
    String toStringResult = writeFont.toString();
    Short typeOffset = writeFont.getTypeOffset();
    Boolean bold1 = writeFont.getBold();
    String fontName = writeFont.getFontName();
    Boolean strikeout = writeFont.getStrikeout();
    Short color = writeFont.getColor();
    Assert.assertEquals(null, underline);
    Assert.assertEquals(null, writeFont.getCharset());
    Assert.assertEquals(null, color);
    Assert.assertEquals(null, strikeout);
    Assert.assertEquals(null, fontName);
    Assert.assertEquals(Boolean.valueOf(true), bold1);
    Assert.assertEquals(null, typeOffset);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, italic);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
