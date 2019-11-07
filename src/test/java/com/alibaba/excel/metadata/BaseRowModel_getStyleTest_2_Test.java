package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BaseRowModel_getStyleTest_2_Test {
  @Test
  public void getStyleTest() throws Exception {
    // Arrange
    BaseRowModel baseRowModel = new BaseRowModel();
    Integer row = new Integer(1);

    // Act
    CellStyle actual = baseRowModel.getStyle(row);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
