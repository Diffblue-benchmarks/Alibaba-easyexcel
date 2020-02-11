package com.alibaba.excel.util;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PositionUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void getColTest() {
    // Arrange, Act and Assert
    assertEquals(26956, PositionUtils.getCol("foo"));
  }
  @Test(timeout=10000)
  public void getRowTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    PositionUtils.getRow("foo");
  }
  @Test(timeout=10000)
  public void getRowByRowTagtTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    PositionUtils.getRowByRowTagt("foo");
  }
}

