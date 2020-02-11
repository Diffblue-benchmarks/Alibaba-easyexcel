package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class TableDiffblueTest {
  @Test(timeout=10000)
  public void setClazzTest() {
    // Arrange
    Table table = new Table(Integer.valueOf(1));

    // Act
    table.setClazz(null);

    // Assert
    assertNull(table.getClazz());
  }

  @Test(timeout=10000)
  public void setTableStyleTest() {
    // Arrange
    Table table = new Table(Integer.valueOf(1));
    TableStyle tableStyle = new TableStyle();

    // Act
    table.setTableStyle(tableStyle);

    // Assert
    assertSame(tableStyle, table.getTableStyle());
  }

  @Test(timeout=10000)
  public void getTableNoTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Table(Integer.valueOf(1))).getTableNo());
  }

  @Test(timeout=10000)
  public void getTableStyleTest() {
    // Arrange, Act and Assert
    assertNull((new Table(Integer.valueOf(1))).getTableStyle());
  }

  @Test(timeout=10000)
  public void setHeadTest() {
    // Arrange
    Table table = new Table(Integer.valueOf(1));

    // Act
    table.setHead(null);

    // Assert
    assertNull(table.getHead());
  }

  @Test(timeout=10000)
  public void setTableNoTest() {
    // Arrange
    Table table = new Table(Integer.valueOf(1));

    // Act
    table.setTableNo(1);

    // Assert
    assertEquals(1, table.getTableNo());
  }

  @Test(timeout=10000)
  public void getHeadTest() {
    // Arrange, Act and Assert
    assertNull((new Table(Integer.valueOf(1))).getHead());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Table(Integer.valueOf(1))).getTableNo());
  }

  @Test(timeout=10000)
  public void getClazzTest() {
    // Arrange, Act and Assert
    assertNull((new Table(Integer.valueOf(1))).getClazz());
  }
}

