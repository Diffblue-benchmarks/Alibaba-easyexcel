package com.alibaba.excel.write.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HorizontalCellStyleStrategy_HorizontalCellStyleStrategyTest_3_Test {
  @Test
  public void HorizontalCellStyleStrategyTest() throws Exception {
    // Arrange
    WriteCellStyle headWriteCellStyle = new WriteCellStyle();
    WriteCellStyle contentWriteCellStyle = new WriteCellStyle();

    // Act
    HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle,
        contentWriteCellStyle);

    // Assert
    Assert.assertNotNull(horizontalCellStyleStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
