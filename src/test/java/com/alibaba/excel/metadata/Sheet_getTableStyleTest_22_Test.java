package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getTableStyleTest_22_Test {
  @Test
  public void getTableStyleTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    TableStyle actual = sheet.getTableStyle();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
