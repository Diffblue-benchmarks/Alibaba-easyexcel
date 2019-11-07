package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getAutoWidthTest_7_Test {
  @Test
  public void getAutoWidthTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    Boolean actual = sheet.getAutoWidth();

    // Assert
    Assert.assertEquals(Boolean.valueOf(false), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
