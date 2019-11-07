package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowHeightProperty_setHeightTest_3_Test {
  @Test
  public void setHeightTest() throws Exception {
    // Arrange
    RowHeightProperty rowHeightProperty = new RowHeightProperty(new Short((short) 1));
    Short height = new Short((short) 1);

    // Act
    rowHeightProperty.setHeight(height);

    // Assert
    String toStringResult = rowHeightProperty.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Short.valueOf((short) 1), rowHeightProperty.getHeight());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
