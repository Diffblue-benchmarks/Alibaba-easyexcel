package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowHeightProperty_RowHeightPropertyTest_5_Test {
  @Test
  public void RowHeightPropertyTest() throws Exception {
    // Arrange
    Short height = new Short((short) 1);

    // Act
    RowHeightProperty rowHeightProperty = new RowHeightProperty(height);

    // Assert
    String toStringResult = rowHeightProperty.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(Short.valueOf((short) 1), rowHeightProperty.getHeight());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
