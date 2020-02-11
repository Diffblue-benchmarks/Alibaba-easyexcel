package com.alibaba.excel.util;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Test;

public class SheetUtilsDiffblueTest {
  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act and Assert
    assertSame(readSheet, SheetUtils.match(readSheet, null, Boolean.valueOf(true), new GlobalConfiguration()));
  }
}

