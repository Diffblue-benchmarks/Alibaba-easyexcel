package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_getTypeOffsetTest_17_Test {
  @Test
  public void getTypeOffsetTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    Short actual = writeFont.getTypeOffset();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
