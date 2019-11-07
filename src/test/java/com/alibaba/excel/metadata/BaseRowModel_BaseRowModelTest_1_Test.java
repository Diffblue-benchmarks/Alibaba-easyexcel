package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import java.util.Map;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BaseRowModel_BaseRowModelTest_1_Test {
  @Test
  public void BaseRowModelTest() throws Exception {
    // Arrange and Act
    BaseRowModel baseRowModel = new BaseRowModel();

    // Assert
    String toStringResult = baseRowModel.toString();
    Map<Integer, CellStyle> cellStyleMap = baseRowModel.getCellStyleMap();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(cellStyleMap instanceof java.util.HashMap);
    Assert.assertEquals(0, cellStyleMap.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
