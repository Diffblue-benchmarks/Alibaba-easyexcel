package com.alibaba.excel.util;

import com.alibaba.excel.util.PositionUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PositionUtils_getRowByRowTagtTest_3_Test {
  @Test
  public void getRowByRowTagtTest() throws Exception {
    // Arrange
    String rowTagt = "aaaaa";

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    PositionUtils.getRowByRowTagt(rowTagt);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
