package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Sheet_getSheetNameTest_23_Test {
  @Test
  public void getSheetNameTest() throws Exception {
    // Arrange
    Sheet sheet = new Sheet(0);

    // Act
    String actual = sheet.getSheetName();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
