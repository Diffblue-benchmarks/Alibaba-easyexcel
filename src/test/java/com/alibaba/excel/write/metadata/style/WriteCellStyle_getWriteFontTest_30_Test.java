package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_getWriteFontTest_30_Test {
  @Test
  public void getWriteFontTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    WriteFont actual = writeCellStyle.getWriteFont();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
