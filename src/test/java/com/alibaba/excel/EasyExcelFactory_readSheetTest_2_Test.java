package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readSheetTest_2_Test {
  @Test
  public void readSheetTest() throws Exception {
    // Arrange
    String sheetName = "aaaaa";

    // Act
    ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet(sheetName);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
