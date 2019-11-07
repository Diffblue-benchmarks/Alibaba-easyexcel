package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_setBorderRightTest_5_Test {
  @Test
  public void setBorderRightTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();
    BorderStyle borderRight = BorderStyle.NONE;

    // Act
    writeCellStyle.setBorderRight(borderRight);

    // Assert
    WriteFont writeFont = writeCellStyle.getWriteFont();
    BorderStyle borderTop = writeCellStyle.getBorderTop();
    String toStringResult = writeCellStyle.toString();
    Short rightBorderColor = writeCellStyle.getRightBorderColor();
    Short rotation = writeCellStyle.getRotation();
    BorderStyle borderLeft = writeCellStyle.getBorderLeft();
    Short leftBorderColor = writeCellStyle.getLeftBorderColor();
    Short dataFormat = writeCellStyle.getDataFormat();
    Boolean hidden = writeCellStyle.getHidden();
    Short indent = writeCellStyle.getIndent();
    Short fillForegroundColor = writeCellStyle.getFillForegroundColor();
    BorderStyle borderRight1 = writeCellStyle.getBorderRight();
    Boolean quotePrefix = writeCellStyle.getQuotePrefix();
    Short topBorderColor = writeCellStyle.getTopBorderColor();
    BorderStyle borderBottom = writeCellStyle.getBorderBottom();
    Boolean locked = writeCellStyle.getLocked();
    VerticalAlignment verticalAlignment = writeCellStyle.getVerticalAlignment();
    Short bottomBorderColor = writeCellStyle.getBottomBorderColor();
    HorizontalAlignment horizontalAlignment = writeCellStyle.getHorizontalAlignment();
    Boolean shrinkToFit = writeCellStyle.getShrinkToFit();
    FillPatternType fillPatternType = writeCellStyle.getFillPatternType();
    Boolean wrapped = writeCellStyle.getWrapped();
    Assert.assertEquals(null, writeFont);
    Assert.assertEquals(null, writeCellStyle.getFillBackgroundColor());
    Assert.assertEquals(null, wrapped);
    Assert.assertEquals(null, fillPatternType);
    Assert.assertEquals(null, shrinkToFit);
    Assert.assertEquals(null, horizontalAlignment);
    Assert.assertEquals(null, bottomBorderColor);
    Assert.assertEquals(null, verticalAlignment);
    Assert.assertEquals(null, locked);
    Assert.assertEquals(null, borderBottom);
    Assert.assertEquals(null, topBorderColor);
    Assert.assertEquals(null, quotePrefix);
    Assert.assertEquals(BorderStyle.NONE, borderRight1);
    Assert.assertEquals(null, fillForegroundColor);
    Assert.assertEquals(null, indent);
    Assert.assertEquals(null, hidden);
    Assert.assertEquals(null, dataFormat);
    Assert.assertEquals(null, leftBorderColor);
    Assert.assertEquals(null, borderLeft);
    Assert.assertEquals(null, rotation);
    Assert.assertEquals(null, rightBorderColor);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, borderTop);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
