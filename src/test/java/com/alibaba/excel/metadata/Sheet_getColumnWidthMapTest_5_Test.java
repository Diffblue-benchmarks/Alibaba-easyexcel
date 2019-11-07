package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getColumnWidthMapTest_5_Test {
  @Test
  public void getColumnWidthMapTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    Map<Integer, Integer> actual = sheet.getColumnWidthMap();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
