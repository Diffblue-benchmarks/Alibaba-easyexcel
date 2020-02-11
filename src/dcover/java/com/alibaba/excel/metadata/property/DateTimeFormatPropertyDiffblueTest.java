package com.alibaba.excel.metadata.property;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateTimeFormatPropertyDiffblueTest {
  @Test(timeout=10000)
  public void getUse1904windowingTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true),
        (new DateTimeFormatProperty("foo", Boolean.valueOf(true))).getUse1904windowing());
  }

  @Test(timeout=10000)
  public void setFormatTest() {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("foo", Boolean.valueOf(true));

    // Act
    dateTimeFormatProperty.setFormat("foo");

    // Assert
    assertEquals("foo", dateTimeFormatProperty.getFormat());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DateTimeFormatProperty actualDateTimeFormatProperty = new DateTimeFormatProperty("foo", Boolean.valueOf(true));

    // Assert
    String actualFormat = actualDateTimeFormatProperty.getFormat();
    assertEquals("foo", actualFormat);
    assertEquals(Boolean.valueOf(true), actualDateTimeFormatProperty.getUse1904windowing());
  }

  @Test(timeout=10000)
  public void getFormatTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DateTimeFormatProperty("foo", Boolean.valueOf(true))).getFormat());
  }

  @Test(timeout=10000)
  public void setUse1904windowingTest() {
    // Arrange
    DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("foo", Boolean.valueOf(true));

    // Act
    dateTimeFormatProperty.setUse1904windowing(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), dateTimeFormatProperty.getUse1904windowing());
  }
}

