package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_setWriteFontTest_15_Test {
  @Test
  public void setWriteFontTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();
    WriteFont writeFont = new WriteFont();

    // Act
    writeCellStyle.setWriteFont(writeFont);

    // Assert
    Short fontHeightInPoints = writeFont.getFontHeightInPoints();
    Byte underline = writeFont.getUnderline();
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
    Assert.assertEquals(null, underline);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
