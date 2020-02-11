package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FontDiffblueTest {
  @Test(timeout=10000)
  public void getFontHeightInPointsTest() {
    // Arrange, Act and Assert
    assertEquals((short) 0, (new Font()).getFontHeightInPoints());
  }

  @Test(timeout=10000)
  public void isBoldTest() {
    // Arrange, Act and Assert
    assertFalse((new Font()).isBold());
  }

  @Test(timeout=10000)
  public void getFontNameTest() {
    // Arrange, Act and Assert
    assertNull((new Font()).getFontName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Font actualFont = new Font();

    // Assert
    String actualFontName = actualFont.getFontName();
    boolean actualIsBoldResult = actualFont.isBold();
    assertNull(actualFontName);
    assertEquals((short) 0, actualFont.getFontHeightInPoints());
    assertFalse(actualIsBoldResult);
  }

  @Test(timeout=10000)
  public void setFontHeightInPointsTest() {
    // Arrange
    Font font = new Font();

    // Act
    font.setFontHeightInPoints((short) 1);

    // Assert
    assertEquals((short) 1, font.getFontHeightInPoints());
  }

  @Test(timeout=10000)
  public void setBoldTest() {
    // Arrange
    Font font = new Font();

    // Act
    font.setBold(true);

    // Assert
    assertTrue(font.isBold());
  }

  @Test(timeout=10000)
  public void setFontNameTest() {
    // Arrange
    Font font = new Font();

    // Act
    font.setFontName("name");

    // Assert
    assertEquals("name", font.getFontName());
  }
}

