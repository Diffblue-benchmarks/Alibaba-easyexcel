package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteFont_getColorTest_3_Test {
  @Test
  public void getColorTest() throws Exception {
    // Arrange
    WriteFont writeFont = new WriteFont();

    // Act
    Short actual = writeFont.getColor();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
