package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_sheetNameTest_8_Test {
  @Test
  public void sheetNameTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    String sheetName = "Must use 'EasyExcelFactory.write().sheet()' to call this method";

    // Act
    ExcelWriterSheetBuilder actual = excelWriterSheetBuilder.sheetName(sheetName);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
