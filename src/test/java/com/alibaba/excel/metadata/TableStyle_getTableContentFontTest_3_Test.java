package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_getTableContentFontTest_3_Test {
  @Test
  public void getTableContentFontTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();

    // Act
    Font actual = tableStyle.getTableContentFont();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
