package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadSheet_toStringTest_5_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act
    String actual = readSheet.toString();

    // Assert
    Assert.assertNotNull(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
