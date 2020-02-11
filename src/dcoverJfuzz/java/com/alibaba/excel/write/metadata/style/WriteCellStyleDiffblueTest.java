package com.alibaba.excel.write.metadata.style;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Test;

public class WriteCellStyleDiffblueTest {
  @Test(timeout=10000)
  public void getFillBackgroundColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getFillBackgroundColor());
  }

  @Test(timeout=10000)
  public void setLockedTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setLocked(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeCellStyle.getLocked());
  }

  @Test(timeout=10000)
  public void getFillPatternTypeTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getFillPatternType());
  }

  @Test(timeout=10000)
  public void setFillForegroundColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setFillForegroundColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getFillForegroundColor());
  }

  @Test(timeout=10000)
  public void setBorderBottomTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setBorderBottom(BorderStyle.NONE);

    // Assert
    assertEquals(BorderStyle.NONE, writeCellStyle.getBorderBottom());
  }

  @Test(timeout=10000)
  public void setFillPatternTypeTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setFillPatternType(FillPatternType.NO_FILL);

    // Assert
    assertEquals(FillPatternType.NO_FILL, writeCellStyle.getFillPatternType());
  }

  @Test(timeout=10000)
  public void getBottomBorderColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getBottomBorderColor());
  }

  @Test(timeout=10000)
  public void setVerticalAlignmentTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setVerticalAlignment(VerticalAlignment.TOP);

    // Assert
    assertEquals(VerticalAlignment.TOP, writeCellStyle.getVerticalAlignment());
  }

  @Test(timeout=10000)
  public void getVerticalAlignmentTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getVerticalAlignment());
  }

  @Test(timeout=10000)
  public void setQuotePrefixTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setQuotePrefix(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeCellStyle.getQuotePrefix());
  }

  @Test(timeout=10000)
  public void setBottomBorderColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setBottomBorderColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getBottomBorderColor());
  }

  @Test(timeout=10000)
  public void getBorderBottomTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getBorderBottom());
  }

  @Test(timeout=10000)
  public void setDataFormatTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setDataFormat(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getDataFormat());
  }

  @Test(timeout=10000)
  public void getTopBorderColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getTopBorderColor());
  }

  @Test(timeout=10000)
  public void getFillForegroundColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getFillForegroundColor());
  }

  @Test(timeout=10000)
  public void setBorderRightTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setBorderRight(BorderStyle.NONE);

    // Assert
    assertEquals(BorderStyle.NONE, writeCellStyle.getBorderRight());
  }

  @Test(timeout=10000)
  public void getLeftBorderColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getLeftBorderColor());
  }

  @Test(timeout=10000)
  public void getBorderLeftTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getBorderLeft());
  }

  @Test(timeout=10000)
  public void setWriteFontTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();
    WriteFont writeFont = new WriteFont();

    // Act
    writeCellStyle.setWriteFont(writeFont);

    // Assert
    assertSame(writeFont, writeCellStyle.getWriteFont());
  }

  @Test(timeout=10000)
  public void getRotationTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getRotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    WriteCellStyle actualWriteCellStyle = new WriteCellStyle();

    // Assert
    WriteFont actualWriteFont = actualWriteCellStyle.getWriteFont();
    BorderStyle actualBorderTop = actualWriteCellStyle.getBorderTop();
    Short actualRightBorderColor = actualWriteCellStyle.getRightBorderColor();
    Short actualRotation = actualWriteCellStyle.getRotation();
    BorderStyle actualBorderLeft = actualWriteCellStyle.getBorderLeft();
    Short actualLeftBorderColor = actualWriteCellStyle.getLeftBorderColor();
    Short actualDataFormat = actualWriteCellStyle.getDataFormat();
    Boolean actualHidden = actualWriteCellStyle.getHidden();
    Short actualIndent = actualWriteCellStyle.getIndent();
    Short actualFillForegroundColor = actualWriteCellStyle.getFillForegroundColor();
    BorderStyle actualBorderRight = actualWriteCellStyle.getBorderRight();
    Boolean actualQuotePrefix = actualWriteCellStyle.getQuotePrefix();
    Short actualTopBorderColor = actualWriteCellStyle.getTopBorderColor();
    BorderStyle actualBorderBottom = actualWriteCellStyle.getBorderBottom();
    Boolean actualLocked = actualWriteCellStyle.getLocked();
    VerticalAlignment actualVerticalAlignment = actualWriteCellStyle.getVerticalAlignment();
    Short actualBottomBorderColor = actualWriteCellStyle.getBottomBorderColor();
    HorizontalAlignment actualHorizontalAlignment = actualWriteCellStyle.getHorizontalAlignment();
    Boolean actualShrinkToFit = actualWriteCellStyle.getShrinkToFit();
    FillPatternType actualFillPatternType = actualWriteCellStyle.getFillPatternType();
    Boolean actualWrapped = actualWriteCellStyle.getWrapped();
    assertNull(actualWriteFont);
    assertNull(actualWriteCellStyle.getFillBackgroundColor());
    assertNull(actualWrapped);
    assertNull(actualFillPatternType);
    assertNull(actualShrinkToFit);
    assertNull(actualHorizontalAlignment);
    assertNull(actualBottomBorderColor);
    assertNull(actualVerticalAlignment);
    assertNull(actualLocked);
    assertNull(actualBorderBottom);
    assertNull(actualTopBorderColor);
    assertNull(actualQuotePrefix);
    assertNull(actualBorderRight);
    assertNull(actualFillForegroundColor);
    assertNull(actualIndent);
    assertNull(actualHidden);
    assertNull(actualDataFormat);
    assertNull(actualLeftBorderColor);
    assertNull(actualBorderLeft);
    assertNull(actualRotation);
    assertNull(actualRightBorderColor);
    assertNull(actualBorderTop);
  }

  @Test(timeout=10000)
  public void setRightBorderColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setRightBorderColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getRightBorderColor());
  }

  @Test(timeout=10000)
  public void setShrinkToFitTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setShrinkToFit(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeCellStyle.getShrinkToFit());
  }

  @Test(timeout=10000)
  public void setLeftBorderColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setLeftBorderColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getLeftBorderColor());
  }

  @Test(timeout=10000)
  public void setBorderLeftTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setBorderLeft(BorderStyle.NONE);

    // Assert
    assertEquals(BorderStyle.NONE, writeCellStyle.getBorderLeft());
  }

  @Test(timeout=10000)
  public void setWrappedTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setWrapped(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeCellStyle.getWrapped());
  }

  @Test(timeout=10000)
  public void getWrappedTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getWrapped());
  }

  @Test(timeout=10000)
  public void getShrinkToFitTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getShrinkToFit());
  }

  @Test(timeout=10000)
  public void getHorizontalAlignmentTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getHorizontalAlignment());
  }

  @Test(timeout=10000)
  public void getLockedTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getLocked());
  }

  @Test(timeout=10000)
  public void getQuotePrefixTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getQuotePrefix());
  }

  @Test(timeout=10000)
  public void getBorderRightTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getBorderRight());
  }

  @Test(timeout=10000)
  public void setFillBackgroundColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setFillBackgroundColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getFillBackgroundColor());
  }

  @Test(timeout=10000)
  public void setTopBorderColorTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setTopBorderColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getTopBorderColor());
  }

  @Test(timeout=10000)
  public void getIndentTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getIndent());
  }

  @Test(timeout=10000)
  public void getHiddenTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getHidden());
  }

  @Test(timeout=10000)
  public void getDataFormatTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getDataFormat());
  }

  @Test(timeout=10000)
  public void setRotationTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setRotation(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getRotation());
  }

  @Test(timeout=10000)
  public void setHorizontalAlignmentTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setHorizontalAlignment(HorizontalAlignment.GENERAL);

    // Assert
    assertEquals(HorizontalAlignment.GENERAL, writeCellStyle.getHorizontalAlignment());
  }

  @Test(timeout=10000)
  public void setHiddenTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setHidden(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeCellStyle.getHidden());
  }

  @Test(timeout=10000)
  public void getRightBorderColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getRightBorderColor());
  }

  @Test(timeout=10000)
  public void getBorderTopTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getBorderTop());
  }

  @Test(timeout=10000)
  public void getWriteFontTest() {
    // Arrange, Act and Assert
    assertNull((new WriteCellStyle()).getWriteFont());
  }

  @Test(timeout=10000)
  public void setIndentTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setIndent(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeCellStyle.getIndent());
  }

  @Test(timeout=10000)
  public void setBorderTopTest() {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    writeCellStyle.setBorderTop(BorderStyle.NONE);

    // Assert
    assertEquals(BorderStyle.NONE, writeCellStyle.getBorderTop());
  }
}

