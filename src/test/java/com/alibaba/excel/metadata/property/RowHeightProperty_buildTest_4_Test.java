package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowHeightProperty_buildTest_4_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    HeadRowHeight headRowHeight = (HeadRowHeight) null;

    // Act
    RowHeightProperty actual = RowHeightProperty.build(headRowHeight);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
