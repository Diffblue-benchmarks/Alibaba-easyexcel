package com.alibaba.excel.read.builder;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_ExcelReaderBuilderTest_18_Test {
  @Test
  public void ExcelReaderBuilderTest() throws Exception {
    // Arrange and Act
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();

    // Assert
    Assert.assertNotNull(excelReaderBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
