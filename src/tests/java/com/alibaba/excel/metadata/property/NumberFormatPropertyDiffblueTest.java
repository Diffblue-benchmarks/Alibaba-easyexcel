package com.alibaba.excel.metadata.property;

import static org.junit.Assert.assertEquals;
import java.math.RoundingMode;
import org.junit.Test;

public class NumberFormatPropertyDiffblueTest {
  @Test(timeout=10000)
  public void getRoundingModeTest() {
    // Arrange, Act and Assert
    assertEquals(RoundingMode.UP, (new NumberFormatProperty("foo", RoundingMode.UP)).getRoundingMode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NumberFormatProperty actualNumberFormatProperty = new NumberFormatProperty("foo", RoundingMode.UP);

    // Assert
    String actualFormat = actualNumberFormatProperty.getFormat();
    assertEquals("foo", actualFormat);
    assertEquals(RoundingMode.UP, actualNumberFormatProperty.getRoundingMode());
  }

  @Test(timeout=10000)
  public void setFormatTest() {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("foo", RoundingMode.UP);

    // Act
    numberFormatProperty.setFormat("foo");

    // Assert
    assertEquals("foo", numberFormatProperty.getFormat());
  }

  @Test(timeout=10000)
  public void getFormatTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NumberFormatProperty("foo", RoundingMode.UP)).getFormat());
  }

  @Test(timeout=10000)
  public void setRoundingModeTest() {
    // Arrange
    NumberFormatProperty numberFormatProperty = new NumberFormatProperty("foo", RoundingMode.UP);

    // Act
    numberFormatProperty.setRoundingMode(RoundingMode.UP);

    // Assert
    assertEquals(RoundingMode.UP, numberFormatProperty.getRoundingMode());
  }
}

