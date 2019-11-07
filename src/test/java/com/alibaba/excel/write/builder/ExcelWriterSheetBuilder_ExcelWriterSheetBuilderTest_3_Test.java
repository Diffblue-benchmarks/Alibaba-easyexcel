package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_ExcelWriterSheetBuilderTest_3_Test {
  @Test
  public void ExcelWriterSheetBuilderTest() throws Exception {
    // Arrange and Act
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();

    // Assert
    String toStringResult = excelWriterSheetBuilder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((excelWriterSheetBuilder.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
