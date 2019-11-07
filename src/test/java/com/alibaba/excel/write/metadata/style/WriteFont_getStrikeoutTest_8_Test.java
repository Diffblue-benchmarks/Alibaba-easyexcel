package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_getStrikeoutTest_8_Test {
  @Test
  public void getStrikeoutTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    Boolean actual = writeFont.getStrikeout();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
