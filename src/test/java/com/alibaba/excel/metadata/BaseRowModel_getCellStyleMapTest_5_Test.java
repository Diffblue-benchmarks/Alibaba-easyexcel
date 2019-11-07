package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import java.util.Map;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BaseRowModel_getCellStyleMapTest_5_Test {
  @Test
  public void getCellStyleMapTest() throws Exception {
    // Arrange
    BaseRowModel baseRowModel = new BaseRowModel();

    // Act
    Map<Integer, CellStyle> actual = baseRowModel.getCellStyleMap();

    // Assert
    Assert.assertTrue(actual instanceof java.util.HashMap);
    Assert.assertEquals(0, actual.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
