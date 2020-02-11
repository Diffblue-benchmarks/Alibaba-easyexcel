package com.alibaba.excel.util;

import static org.junit.Assert.assertTrue;
import java.util.Collection;
import java.util.Map;
import org.junit.Test;

public class CollectionUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest2() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty((Map<?, ?>) null));
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty((Collection<?>) null));
  }
}

