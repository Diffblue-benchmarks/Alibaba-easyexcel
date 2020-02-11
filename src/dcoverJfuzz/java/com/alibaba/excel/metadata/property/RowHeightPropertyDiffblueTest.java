package com.alibaba.excel.metadata.property;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RowHeightPropertyDiffblueTest {
  @Test(timeout=10000)
  public void getHeightTest() {
    // Arrange, Act and Assert
    assertEquals(Short.valueOf((short) 1), (new RowHeightProperty(Short.valueOf((short) 1))).getHeight());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(Short.valueOf((short) 1), (new RowHeightProperty(Short.valueOf((short) 1))).getHeight());
  }

  @Test(timeout=10000)
  public void setHeightTest() {
    // Arrange
    RowHeightProperty rowHeightProperty = new RowHeightProperty(Short.valueOf((short) 1));

    // Act
    rowHeightProperty.setHeight(Short.valueOf((short) 1));

    // Assert
    assertEquals(Short.valueOf((short) 1), rowHeightProperty.getHeight());
  }
}

