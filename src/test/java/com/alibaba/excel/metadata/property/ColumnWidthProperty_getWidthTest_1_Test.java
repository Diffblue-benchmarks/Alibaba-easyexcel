package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnWidthProperty_getWidthTest_1_Test {
  @Test
  public void getWidthTest() throws Exception {
    // Arrange
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(new Integer(1));

    // Act
    Integer actual = columnWidthProperty.getWidth();

    // Assert
    Assert.assertEquals(Integer.valueOf(1), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
