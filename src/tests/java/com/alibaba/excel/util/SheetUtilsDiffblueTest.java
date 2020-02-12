package com.alibaba.excel.util;

import static org.junit.Assert.assertSame;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SheetUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void matchTest2() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act and Assert
    assertSame(readSheet, SheetUtils.match(readSheet, null, Boolean.valueOf(true), new GlobalConfiguration()));
  }
  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    ReadSheet readSheet = new ReadSheet();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    SheetUtils.match(readSheet, null, Boolean.valueOf(false), new GlobalConfiguration());
  }
}

