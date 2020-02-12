package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CellRangeDiffblueTest {
  @Test(timeout=10000)
  public void setFirstColTest() {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    cellRange.setFirstCol(1);

    // Assert
    assertEquals(1, cellRange.getFirstCol());
  }

  @Test(timeout=10000)
  public void getFirstColTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new CellRange(1, 1, 1, 1)).getFirstCol());
  }

  @Test(timeout=10000)
  public void setLastColTest() {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    cellRange.setLastCol(1);

    // Assert
    assertEquals(1, cellRange.getLastCol());
  }

  @Test(timeout=10000)
  public void getLastRowTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new CellRange(1, 1, 1, 1)).getLastRow());
  }

  @Test(timeout=10000)
  public void setLastRowTest() {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    cellRange.setLastRow(1);

    // Assert
    assertEquals(1, cellRange.getLastRow());
  }

  @Test(timeout=10000)
  public void getLastColTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new CellRange(1, 1, 1, 1)).getLastCol());
  }

  @Test(timeout=10000)
  public void setFirstRowTest() {
    // Arrange
    CellRange cellRange = new CellRange(1, 1, 1, 1);

    // Act
    cellRange.setFirstRow(1);

    // Assert
    assertEquals(1, cellRange.getFirstRow());
  }

  @Test(timeout=10000)
  public void getFirstRowTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new CellRange(1, 1, 1, 1)).getFirstRow());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    CellRange actualCellRange = new CellRange(1, 1, 1, 1);

    // Assert
    int actualFirstRow = actualCellRange.getFirstRow();
    int actualLastCol = actualCellRange.getLastCol();
    int actualLastRow = actualCellRange.getLastRow();
    assertEquals(1, actualFirstRow);
    assertEquals(1, actualCellRange.getFirstCol());
    assertEquals(1, actualLastRow);
    assertEquals(1, actualLastCol);
  }
}

