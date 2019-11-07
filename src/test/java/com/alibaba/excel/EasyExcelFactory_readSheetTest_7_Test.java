package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readSheetTest_7_Test {
  @Test
  public void readSheetTest() throws Exception {
    // Arrange
    Integer sheetNo = new Integer(0);
    String sheetName = "aaaaa";

    // Act
    ExcelReaderSheetBuilder actual = EasyExcelFactory.readSheet(sheetNo, sheetName);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
