package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_setTableContentFontTest_2_Test {
  @Test
  public void setTableContentFontTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();
    Font font = new Font();

    // Act
    tableStyle.setTableContentFont(font);

    // Assert
    String toStringResult = font.toString();
    String fontName = font.getFontName();
    boolean isBoldResult = font.isBold();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals((short) 0, font.getFontHeightInPoints());
    Assert.assertFalse(isBoldResult);
    Assert.assertEquals(null, fontName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
