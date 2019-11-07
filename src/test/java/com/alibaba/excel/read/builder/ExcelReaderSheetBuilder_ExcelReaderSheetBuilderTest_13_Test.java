package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_ExcelReaderSheetBuilderTest_13_Test {
  @Test
  public void ExcelReaderSheetBuilderTest() throws Exception {
    // Arrange and Act
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();

    // Assert
    Assert.assertNotNull(excelReaderSheetBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
