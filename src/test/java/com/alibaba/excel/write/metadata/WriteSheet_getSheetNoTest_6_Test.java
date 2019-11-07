package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_getSheetNoTest_6_Test {
  @Test
  public void getSheetNoTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    Integer actual = writeSheet.getSheetNo();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
