package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_getDataFormatTest_13_Test {
  @Test
  public void getDataFormatTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    Short actual = writeCellStyle.getDataFormat();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
