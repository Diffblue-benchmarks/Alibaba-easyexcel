package com.alibaba.excel.write.metadata.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteCellStyle_getBorderRightTest_28_Test {
  @Test
  public void getBorderRightTest() throws Exception {
    // Arrange
    WriteCellStyle writeCellStyle = new WriteCellStyle();

    // Act
    BorderStyle actual = writeCellStyle.getBorderRight();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
