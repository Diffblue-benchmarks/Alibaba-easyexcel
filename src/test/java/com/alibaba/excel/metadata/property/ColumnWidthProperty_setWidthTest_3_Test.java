package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnWidthProperty_setWidthTest_3_Test {
  @Test
  public void setWidthTest() throws Exception {
    // Arrange
    ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(new Integer(1));
    Integer width = new Integer(1);

    // Act
    columnWidthProperty.setWidth(width);

    // Assert
    Integer width1 = columnWidthProperty.getWidth();
    Assert.assertEquals(Integer.valueOf(1), width1);
    Assert.assertNotNull(columnWidthProperty.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
