package com.alibaba.excel.util;

import com.alibaba.excel.util.StyleUtil;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StyleUtil_buildDefaultCellStyleTest_2_Test {
//failed_compile   @Test
//  public void buildDefaultCellStyleTest() throws Exception {
//    // Arrange
//    HSSFWorkbook workbook = new HSSFWorkbook();
//
//    // Act
//    CellStyle actual = StyleUtil.buildDefaultCellStyle(workbook);
//
//    // Assert
//    Assert.assertTrue(actual instanceof HSSFCellStyle);
//    BorderStyle borderLeftEnum = actual.getBorderLeftEnum();
//    short bottomBorderColor = actual.getBottomBorderColor();
//    BorderStyle borderRightEnum = actual.getBorderRightEnum();
//    HorizontalAlignment alignmentEnum = actual.getAlignmentEnum();
//    boolean locked = actual.getLocked();
//    short borderTop = actual.getBorderTop();
//    short rotation = actual.getRotation();
//    short borderRight = actual.getBorderRight();
//    short topBorderColor = actual.getTopBorderColor();
//    BorderStyle borderTopEnum = actual.getBorderTopEnum();
//    boolean quotePrefixed = actual.getQuotePrefixed();
//    short leftBorderColor = actual.getLeftBorderColor();
//    String userStyleName = ((HSSFCellStyle) actual).getUserStyleName();
//    short indention = actual.getIndention();
//    short fontIndex = actual.getFontIndex();
//    short index = actual.getIndex();
//    short rightBorderColor = actual.getRightBorderColor();
//    HSSFCellStyle parentStyle = ((HSSFCellStyle) actual).getParentStyle();
//    HSSFColor fillBackgroundColorColor = actual.getFillBackgroundColorColor();
//    short borderBottom = actual.getBorderBottom();
//    boolean wrapText = actual.getWrapText();
//    String toStringResult = ((HSSFCellStyle) actual).toString();
//    BorderStyle borderBottomEnum = actual.getBorderBottomEnum();
//    boolean hidden = actual.getHidden();
//    short verticalAlignment = actual.getVerticalAlignment();
//    short borderLeft = actual.getBorderLeft();
//    short dataFormat = actual.getDataFormat();
//    VerticalAlignment verticalAlignmentEnum = actual.getVerticalAlignmentEnum();
//    String dataFormatString = actual.getDataFormatString();
//    short fillForegroundColor = actual.getFillForegroundColor();
//    short alignment = actual.getAlignment();
//    FillPatternType fillPatternEnum = actual.getFillPatternEnum();
//    short readingOrder = ((HSSFCellStyle) actual).getReadingOrder();
//    boolean shrinkToFit = actual.getShrinkToFit();
//    short fillPattern = actual.getFillPattern();
//    short fillBackgroundColor = actual.getFillBackgroundColor();
//    HSSFColor fillBackgroundColorColor1 = actual.getFillBackgroundColorColor();
//    Assert.assertEquals(BorderStyle.THIN, borderLeftEnum);
//    String toStringResult1 = fillBackgroundColorColor1.toString();
//    short index1 = fillBackgroundColorColor1.getIndex();
//    String hexString = fillBackgroundColorColor1.getHexString();
//    short index2 = fillBackgroundColorColor1.getIndex2();
//    short[] triplet = fillBackgroundColorColor1.getTriplet();
//    Assert.assertEquals((short) 64, fillBackgroundColor);
//    Assert.assertEquals((short) 8, bottomBorderColor);
//    Assert.assertEquals(HorizontalAlignment.CENTER, alignmentEnum);
//    Assert.assertEquals((short) 1, borderRight);
//    Assert.assertEquals((short) 21, index);
//    Assert.assertEquals(FillPatternType.SOLID_FOREGROUND, fillPatternEnum);
//    Assert.assertEquals((short) 0, readingOrder);
//    Assert.assertEquals((short) 8, rightBorderColor);
//    Assert.assertFalse(shrinkToFit);
//    Assert.assertEquals((short) 1, fillPattern);
//    Assert.assertEquals((short) 2, alignment);
//    Assert.assertEquals((short) 22, fillForegroundColor);
//    Assert.assertEquals("General", dataFormatString);
//    Assert.assertEquals(VerticalAlignment.CENTER, verticalAlignmentEnum);
//    Assert.assertEquals((short) 0, dataFormat);
//    Assert.assertEquals((short) 1, borderLeft);
//    Assert.assertEquals((short) 1, verticalAlignment);
//    Assert.assertFalse(hidden);
//    Assert.assertEquals(BorderStyle.THIN, borderBottomEnum);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertTrue(wrapText);
//    Assert.assertEquals((short) 1, borderBottom);
//    Assert.assertEquals((short) 8, topBorderColor);
//    Assert.assertEquals(null, parentStyle);
//    String toStringResult2 = fillBackgroundColorColor.toString();
//    short index3 = fillBackgroundColorColor.getIndex();
//    String hexString1 = fillBackgroundColorColor.getHexString();
//    short index21 = fillBackgroundColorColor.getIndex2();
//    short[] triplet1 = fillBackgroundColorColor.getTriplet();
//    Assert.assertTrue(locked);
//    Assert.assertEquals(BorderStyle.THIN, borderTopEnum);
//    Assert.assertFalse(quotePrefixed);
//    Assert.assertEquals(BorderStyle.THIN, borderRightEnum);
//    Assert.assertEquals((short) 1, borderTop);
//    Assert.assertEquals((short) 8, leftBorderColor);
//    Assert.assertEquals((short) 0, fontIndex);
//    Assert.assertEquals((short) 0, indention);
//    Assert.assertEquals(null, userStyleName);
//    Assert.assertEquals((short) 0, rotation);
//    Assert.assertEquals("0:0:0", hexString);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(3, triplet.length);
//    Assert.assertArrayEquals(new short[]{0, 0, 0}, triplet);
//    Assert.assertEquals((short) 64, index1);
//    Assert.assertEquals((short) 64, index3);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertEquals(3, triplet1.length);
//    Assert.assertArrayEquals(new short[]{0, 0, 0}, triplet1);
//    Assert.assertEquals((short) -1, index2);
//    Assert.assertEquals("0:0:0", hexString1);
//    Assert.assertEquals((short) -1, index21);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
