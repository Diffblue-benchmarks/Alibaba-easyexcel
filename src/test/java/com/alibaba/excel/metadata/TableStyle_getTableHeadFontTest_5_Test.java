package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_getTableHeadFontTest_5_Test {
  @Test
  public void getTableHeadFontTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();

    // Act
    Font actual = tableStyle.getTableHeadFont();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
