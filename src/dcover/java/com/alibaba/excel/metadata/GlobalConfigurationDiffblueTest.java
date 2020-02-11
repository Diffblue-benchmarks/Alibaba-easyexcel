package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GlobalConfigurationDiffblueTest {
  @Test(timeout=10000)
  public void setAutoTrimTest() {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    globalConfiguration.setAutoTrim(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), globalConfiguration.getAutoTrim());
  }

  @Test(timeout=10000)
  public void getUse1904windowingTest() {
    // Arrange, Act and Assert
    assertNull((new GlobalConfiguration()).getUse1904windowing());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GlobalConfiguration actualGlobalConfiguration = new GlobalConfiguration();

    // Assert
    Boolean actualAutoTrim = actualGlobalConfiguration.getAutoTrim();
    assertNull(actualAutoTrim);
    assertNull(actualGlobalConfiguration.getUse1904windowing());
  }

  @Test(timeout=10000)
  public void getAutoTrimTest() {
    // Arrange, Act and Assert
    assertNull((new GlobalConfiguration()).getAutoTrim());
  }

  @Test(timeout=10000)
  public void setUse1904windowingTest() {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    globalConfiguration.setUse1904windowing(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), globalConfiguration.getUse1904windowing());
  }
}

