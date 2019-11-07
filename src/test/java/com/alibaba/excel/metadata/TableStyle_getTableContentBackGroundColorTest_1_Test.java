package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.TableStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TableStyle_getTableContentBackGroundColorTest_1_Test {
  @Test
  public void getTableContentBackGroundColorTest() throws Exception {
    // Arrange
    TableStyle tableStyle = new TableStyle();

    // Act
    IndexedColors actual = tableStyle.getTableContentBackGroundColor();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
