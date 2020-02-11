package com.alibaba.excel.write.style.column;

import static org.junit.Assert.assertEquals;
import com.alibaba.excel.metadata.Head;
import org.junit.Test;

public class SimpleColumnWidthStyleStrategyDiffblueTest {
  @Test(timeout=10000)
  public void columnWidthTest() {
    // Arrange
    SimpleColumnWidthStyleStrategy simpleColumnWidthStyleStrategy = new SimpleColumnWidthStyleStrategy(
        Integer.valueOf(1));

    // Act and Assert
    assertEquals(Integer.valueOf(1), simpleColumnWidthStyleStrategy
        .columnWidth(new Head(Integer.valueOf(1), "name", null, Boolean.valueOf(true), Boolean.valueOf(true))));
  }
}

