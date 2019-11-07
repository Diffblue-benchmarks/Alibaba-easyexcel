package com.alibaba.excel.metadata.property;

import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.metadata.property.RowHeightProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowHeightProperty_buildTest_1_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    ContentRowHeight contentRowHeight = (ContentRowHeight) null;

    // Act
    RowHeightProperty actual = RowHeightProperty.build(contentRowHeight);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
