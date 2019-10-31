package com.alibaba.excel.enums;

import com.alibaba.excel.enums.CellDataTypeEnum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class CellDataTypeEnumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildFromCellTypeInputNotNullOutputVoid999b3e0f30f8cafc622() {

    // Arrange
    final String arg0 = "BOOLEAN";

    // Act
    final CellDataTypeEnum actual = CellDataTypeEnum.buildFromCellType(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputBoolean999d47f324a5ade963a() {

    // Arrange
    final String arg0 = "BOOLEAN";

    // Act
    final CellDataTypeEnum actual = CellDataTypeEnum.valueOf(arg0);

    // Assert result
    Assert.assertEquals(CellDataTypeEnum.BOOLEAN, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput79991a2f289586e074aa() {

    // Act
    final CellDataTypeEnum[] actual = CellDataTypeEnum.values();

    // Assert result
    Assert.assertArrayEquals(new CellDataTypeEnum[]{ CellDataTypeEnum.STRING, CellDataTypeEnum.DIRECT_STRING, CellDataTypeEnum.NUMBER, CellDataTypeEnum.BOOLEAN, CellDataTypeEnum.EMPTY, CellDataTypeEnum.ERROR, CellDataTypeEnum.IMAGE }, actual);

  }
}
