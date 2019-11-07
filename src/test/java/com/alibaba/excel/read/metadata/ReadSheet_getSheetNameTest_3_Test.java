package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadSheet_getSheetNameTest_3_Test {
  @Test
  public void getSheetNameTest() throws Exception {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act
    String actual = readSheet.getSheetName();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
