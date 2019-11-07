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

public class WriteCellStyle_setDataFormatTest_42_Test {
  @Test
  public void setDataFormatTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();
    Short dataFormat = new Short((short) 1);

    // Act
    writeCellStyle.setDataFormat(dataFormat);

    // Assert
    WriteFont writeFont = writeCellStyle.getWriteFont();
    BorderStyle borderTop = writeCellStyle.getBorderTop();
    String toStringResult = writeCellStyle.toString();
    Short rightBorderColor = writeCellStyle.getRightBorderColor();
    Short rotation = writeCellStyle.getRotation();
    BorderStyle borderLeft = writeCellStyle.getBorderLeft();
    Short leftBorderColor = writeCellStyle.getLeftBorderColor();
    Short dataFormat1 = writeCellStyle.getDataFormat();
    Boolean hidden = writeCellStyle.getHidden();
    Short indent = writeCellStyle.getIndent();
    Short fillForegroundColor = writeCellStyle.getFillForegroundColor();
    BorderStyle borderRight = writeCellStyle.getBorderRight();
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
    Assert.assertEquals(null, borderRight);
    Assert.assertEquals(null, fillForegroundColor);
    Assert.assertEquals(null, indent);
    Assert.assertEquals(null, hidden);
    Assert.assertEquals(Short.valueOf((short) 1), dataFormat1);
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
