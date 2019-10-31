package com.alibaba.excel.enums;

import com.alibaba.excel.enums.HeadKindEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class HeadKindEnumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputClass99925a51de773457528() {

    // Arrange
    final String arg0 = "CLASS";

    // Act
    final HeadKindEnum actual = HeadKindEnum.valueOf(arg0);

    // Assert result
    Assert.assertEquals(HeadKindEnum.CLASS, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput399993d98eaffe5975a0() {

    // Act
    final HeadKindEnum[] actual = HeadKindEnum.values();

    // Assert result
    Assert.assertArrayEquals(new HeadKindEnum[]{ HeadKindEnum.NONE, HeadKindEnum.CLASS, HeadKindEnum.STRING }, actual);

  }
}
