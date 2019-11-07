package com.alibaba.excel.write.style;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HorizontalCellStyleStrategy_HorizontalCellStyleStrategyTest_1_Test {
  @Test
  public void HorizontalCellStyleStrategyTest() throws Exception {
    // Arrange
    WriteCellStyle headWriteCellStyle = new WriteCellStyle();
    ArrayList<WriteCellStyle> arrayList = new ArrayList<WriteCellStyle>();
    arrayList.add(new WriteCellStyle());

    // Act
    HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle,
        arrayList);

    // Assert
    Assert.assertNotNull(horizontalCellStyleStrategy.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
