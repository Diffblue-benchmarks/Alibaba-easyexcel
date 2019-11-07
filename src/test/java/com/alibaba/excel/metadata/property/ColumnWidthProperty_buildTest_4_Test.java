package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnWidthProperty_buildTest_4_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    ColumnWidth columnWidth = (ColumnWidth) null;

    // Act
    ColumnWidthProperty actual = ColumnWidthProperty.build(columnWidth);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
