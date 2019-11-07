package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_getTopBorderColorTest_39_Test {
  @Test
  public void getTopBorderColorTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    Short actual = writeCellStyle.getTopBorderColor();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
