package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_getFontNameTest_13_Test {
  @Test
  public void getFontNameTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    String actual = writeFont.getFontName();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
