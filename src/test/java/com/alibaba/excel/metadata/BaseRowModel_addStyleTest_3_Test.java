package com.alibaba.excel.metadata;

import com.alibaba.excel.metadata.BaseRowModel;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BaseRowModel_addStyleTest_3_Test {
  @Test
  public void addStyleTest() throws Exception {
    // Arrange
    BaseRowModel baseRowModel = new BaseRowModel();
    Integer row = new Integer(1);
    HSSFCellStyle hSSFCellStyle = (HSSFCellStyle) null;

    // Act
    baseRowModel.addStyle(row, hSSFCellStyle);

    // Assert
    Assert.assertEquals(null, hSSFCellStyle);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
