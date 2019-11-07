package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_getItalicTest_16_Test {
  @Test
  public void getItalicTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    Boolean actual = writeFont.getItalic();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
