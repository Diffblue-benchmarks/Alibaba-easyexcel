package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Test;

public class TableStyleDiffblueTest {
  @Test(timeout=10000)
  public void getTableContentBackGroundColorTest() {
    // Arrange, Act and Assert
    assertNull((new TableStyle()).getTableContentBackGroundColor());
  }

  @Test(timeout=10000)
  public void setTableContentFontTest() {
    // Arrange
    TableStyle tableStyle = new TableStyle();
    Font font = new Font();

    // Act
    tableStyle.setTableContentFont(font);

    // Assert
    assertSame(font, tableStyle.getTableContentFont());
  }

  @Test(timeout=10000)
  public void setTableHeadBackGroundColorTest() {
    // Arrange
    TableStyle tableStyle = new TableStyle();

    // Act
    tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);

    // Assert
    assertEquals(IndexedColors.BLACK1, tableStyle.getTableHeadBackGroundColor());
  }

  @Test(timeout=10000)
  public void setTableContentBackGroundColorTest() {
    // Arrange
    TableStyle tableStyle = new TableStyle();

    // Act
    tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);

    // Assert
    assertEquals(IndexedColors.BLACK1, tableStyle.getTableContentBackGroundColor());
  }

  @Test(timeout=10000)
  public void getTableHeadFontTest() {
    // Arrange, Act and Assert
    assertNull((new TableStyle()).getTableHeadFont());
  }

  @Test(timeout=10000)
  public void getTableContentFontTest() {
    // Arrange, Act and Assert
    assertNull((new TableStyle()).getTableContentFont());
  }

  @Test(timeout=10000)
  public void getTableHeadBackGroundColorTest() {
    // Arrange, Act and Assert
    assertNull((new TableStyle()).getTableHeadBackGroundColor());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TableStyle actualTableStyle = new TableStyle();

    // Assert
    IndexedColors actualTableHeadBackGroundColor = actualTableStyle.getTableHeadBackGroundColor();
    Font actualTableContentFont = actualTableStyle.getTableContentFont();
    Font actualTableHeadFont = actualTableStyle.getTableHeadFont();
    assertNull(actualTableHeadBackGroundColor);
    assertNull(actualTableStyle.getTableContentBackGroundColor());
    assertNull(actualTableHeadFont);
    assertNull(actualTableContentFont);
  }

  @Test(timeout=10000)
  public void setTableHeadFontTest() {
    // Arrange
    TableStyle tableStyle = new TableStyle();
    Font font = new Font();

    // Act
    tableStyle.setTableHeadFont(font);

    // Assert
    assertSame(font, tableStyle.getTableHeadFont());
  }
}

