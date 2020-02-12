package com.alibaba.excel.metadata.property;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ColumnWidthPropertyDiffblueTest {
  @Test(timeout=10000)
  public void setWidthTest() {
    // Arrange
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(Integer.valueOf(1));

    // Act
    columnWidthProperty.setWidth(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), columnWidthProperty.getWidth());
  }

  @Test(timeout=10000)
  public void getWidthTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1), (new ColumnWidthProperty(Integer.valueOf(1))).getWidth());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1), (new ColumnWidthProperty(Integer.valueOf(1))).getWidth());
  }
}

