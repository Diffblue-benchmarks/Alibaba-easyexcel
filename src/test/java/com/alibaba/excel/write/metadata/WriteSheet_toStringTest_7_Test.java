package com.alibaba.excel.write.metadata;

import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteSheet_toStringTest_7_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    WriteSheet writeSheet = new WriteSheet();

    // Act
    String actual = writeSheet.toString();

    // Assert
    Assert.assertNotNull(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
