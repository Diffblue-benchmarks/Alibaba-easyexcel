package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getStartRowTest_9_Test {
  @Test
  public void getStartRowTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    int actual = sheet.getStartRow();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
