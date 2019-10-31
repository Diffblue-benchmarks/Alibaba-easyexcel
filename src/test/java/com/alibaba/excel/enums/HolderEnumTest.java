package com.alibaba.excel.enums;

import com.alibaba.excel.enums.HolderEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class HolderEnumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputRow99963b2b105d6b812f9() {

    // Arrange
    final String arg0 = "ROW";

    // Act
    final HolderEnum actual = HolderEnum.valueOf(arg0);

    // Assert result
    Assert.assertEquals(HolderEnum.ROW, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput499934d4972a370f31d1() {

    // Act
    final HolderEnum[] actual = HolderEnum.values();

    // Assert result
    Assert.assertArrayEquals(new HolderEnum[]{ HolderEnum.WORKBOOK, HolderEnum.SHEET, HolderEnum.TABLE, HolderEnum.ROW }, actual);

  }
}
