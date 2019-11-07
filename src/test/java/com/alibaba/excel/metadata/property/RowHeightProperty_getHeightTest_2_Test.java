package com.alibaba.excel.metadata.property;

import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowHeightProperty_getHeightTest_2_Test {
  @Test
  public void getHeightTest() throws Exception {
    // Arrange
    RowHeightProperty rowHeightProperty = new RowHeightProperty(new Short((short) 1));

    // Act
    Short actual = rowHeightProperty.getHeight();

    // Assert
    Assert.assertEquals(Short.valueOf((short) 1), actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
