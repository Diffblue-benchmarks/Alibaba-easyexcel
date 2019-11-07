package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getHeadLineMunTest_11_Test {
  @Test
  public void getHeadLineMunTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    int actual = sheet.getHeadLineMun();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
