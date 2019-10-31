package com.alibaba.excel.util;

import com.alibaba.excel.util.PositionUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PositionUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getColInputNotNullOutputPositive99990632813b49ee940() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final int actual = PositionUtils.getCol(arg0);

    // Assert result
    Assert.assertEquals(15683414, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowByRowTagtInputNotNullOutputNumberFormatException99974f61b68eff9473e() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NumberFormatException.class);
    PositionUtils.getRowByRowTagt(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowInputNotNullOutputNumberFormatException999c98c71bae1ceb82a() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NumberFormatException.class);
    PositionUtils.getRow(arg0);

    // The method is not expected to return due to exception thrown

  }
}
