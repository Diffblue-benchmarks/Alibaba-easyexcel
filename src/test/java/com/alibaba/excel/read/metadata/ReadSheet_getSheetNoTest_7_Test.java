package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadSheet_getSheetNoTest_7_Test {
  @Test
  public void getSheetNoTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act
    Integer actual = readSheet.getSheetNo();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
