package com.alibaba.excel.write.style;

import static org.junit.Assert.assertFalse;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import java.util.List;
import org.junit.Test;

public class HorizontalCellStyleStrategyDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertFalse((new HorizontalCellStyleStrategy(new WriteCellStyle(), (List<WriteCellStyle>) null)).hasInitialized);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    WriteCellStyle headWriteCellStyle = new WriteCellStyle();

    // Act and Assert
    assertFalse((new HorizontalCellStyleStrategy(headWriteCellStyle, new WriteCellStyle())).hasInitialized);
  }
}

