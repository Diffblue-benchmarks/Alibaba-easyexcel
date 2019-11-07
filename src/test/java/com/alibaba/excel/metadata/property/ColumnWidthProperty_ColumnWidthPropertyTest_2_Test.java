package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnWidthProperty_ColumnWidthPropertyTest_2_Test {
  @Test
  public void ColumnWidthPropertyTest() throws Exception {
    // Arrange
    Integer width = new Integer(1);

    // Act
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(width);

    // Assert
    Integer width1 = columnWidthProperty.getWidth();
    Assert.assertEquals(Integer.valueOf(1), width1);
    Assert.assertNotNull(columnWidthProperty.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
