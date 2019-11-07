package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_tableTest_7_Test {
  @Test
  public void tableTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Act
    excelWriterSheetBuilder.table();

    // Assert
    String toStringResult = excelWriterSheetBuilder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((excelWriterSheetBuilder.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
