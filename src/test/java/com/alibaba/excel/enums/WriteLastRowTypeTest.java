package com.alibaba.excel.enums;

import com.alibaba.excel.enums.WriteLastRowType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class WriteLastRowTypeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputCommon_empty999f19cd8b34fde3605() {

    // Arrange
    final String arg0 = "COMMON_EMPTY";

    // Act
    final WriteLastRowType actual = WriteLastRowType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(WriteLastRowType.COMMON_EMPTY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput39991b0281ab04866d0f() {

    // Act
    final WriteLastRowType[] actual = WriteLastRowType.values();

    // Assert result
    Assert.assertArrayEquals(new WriteLastRowType[]{ WriteLastRowType.COMMON_EMPTY, WriteLastRowType.TEMPLATE_EMPTY, WriteLastRowType.HAS_DATA }, actual);

  }
}
