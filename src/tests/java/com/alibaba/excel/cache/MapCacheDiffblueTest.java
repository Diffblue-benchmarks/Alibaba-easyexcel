package com.alibaba.excel.cache;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MapCacheDiffblueTest {
  @Test(timeout=10000)
  public void getTest2() {
    // Arrange, Act and Assert
    assertNull((new MapCache()).get(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new MapCache()).get(Integer.valueOf(-1)));
  }
}

