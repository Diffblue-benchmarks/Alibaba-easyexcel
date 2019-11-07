package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_sheetTest_6_Test {
  @Test
  public void sheetTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    String sheetName = "aaaaa";

    // Act
    ExcelWriterSheetBuilder actual = excelWriterBuilder.sheet(sheetName);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
