package com.alibaba.excel.metadata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Test;

public class BaseRowModelDiffblueTest {
  @Test(timeout=10000)
  public void getStyleTest() {
    // Arrange, Act and Assert
    assertNull((new BaseRowModel()).getStyle(Integer.valueOf(1)));
  }

  @Test(timeout=10000)
  public void getCellStyleMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new BaseRowModel()).getCellStyleMap().size());
  }

  @Test(timeout=10000)
  public void setCellStyleMapTest() {
    // Arrange
    BaseRowModel baseRowModel = new BaseRowModel();

    // Act
    baseRowModel.setCellStyleMap(null);

    // Assert
    assertNull(baseRowModel.getCellStyleMap());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    Map<Integer, CellStyle> cellStyleMap = (new BaseRowModel()).getCellStyleMap();
    assertTrue(cellStyleMap instanceof java.util.HashMap);
    assertEquals(0, cellStyleMap.size());
  }
}

