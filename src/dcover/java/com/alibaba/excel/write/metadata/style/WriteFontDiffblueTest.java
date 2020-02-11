package com.alibaba.excel.write.metadata.style;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class WriteFontDiffblueTest {
  @Test(timeout=10000)
  public void getColorTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getColor());
  }

  @Test(timeout=10000)
  public void setTypeOffsetTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setTypeOffset(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeFont.getTypeOffset());
  }

  @Test(timeout=10000)
  public void getStrikeoutTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getStrikeout());
  }

  @Test(timeout=10000)
  public void setUnderlineTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setUnderline(Byte.valueOf((byte) 1));

    // Assert
    assertEquals(Byte.valueOf((byte) 1), writeFont.getUnderline());
  }

  @Test(timeout=10000)
  public void setCharsetTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setCharset(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), writeFont.getCharset());
  }

  @Test(timeout=10000)
  public void setBoldTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setBold(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeFont.getBold());
  }

  @Test(timeout=10000)
  public void getItalicTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getItalic());
  }

  @Test(timeout=10000)
  public void getUnderlineTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getUnderline());
  }

  @Test(timeout=10000)
  public void getFontHeightInPointsTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getFontHeightInPoints());
  }

  @Test(timeout=10000)
  public void setFontNameTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setFontName("name");

    // Assert
    assertEquals("name", writeFont.getFontName());
  }

  @Test(timeout=10000)
  public void getCharsetTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getCharset());
  }

  @Test(timeout=10000)
  public void setFontHeightInPointsTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setFontHeightInPoints(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeFont.getFontHeightInPoints());
  }

  @Test(timeout=10000)
  public void setItalicTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setItalic(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeFont.getItalic());
  }

  @Test(timeout=10000)
  public void setStrikeoutTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setStrikeout(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), writeFont.getStrikeout());
  }

  @Test(timeout=10000)
  public void setColorTest() {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    writeFont.setColor(Short.valueOf((short) 291));

    // Assert
    assertEquals(Short.valueOf((short) 291), writeFont.getColor());
  }

  @Test(timeout=10000)
  public void getFontNameTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getFontName());
  }

  @Test(timeout=10000)
  public void getBoldTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getBold());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    WriteFont actualWriteFont = new WriteFont();

    // Assert
    Short actualFontHeightInPoints = actualWriteFont.getFontHeightInPoints();
    Byte actualUnderline = actualWriteFont.getUnderline();
    Boolean actualItalic = actualWriteFont.getItalic();
    Short actualTypeOffset = actualWriteFont.getTypeOffset();
    Boolean actualBold = actualWriteFont.getBold();
    String actualFontName = actualWriteFont.getFontName();
    Boolean actualStrikeout = actualWriteFont.getStrikeout();
    Short actualColor = actualWriteFont.getColor();
    assertNull(actualFontHeightInPoints);
    assertNull(actualWriteFont.getCharset());
    assertNull(actualColor);
    assertNull(actualStrikeout);
    assertNull(actualFontName);
    assertNull(actualBold);
    assertNull(actualTypeOffset);
    assertNull(actualItalic);
    assertNull(actualUnderline);
  }

  @Test(timeout=10000)
  public void getTypeOffsetTest() {
    // Arrange, Act and Assert
    assertNull((new WriteFont()).getTypeOffset());
  }
}

