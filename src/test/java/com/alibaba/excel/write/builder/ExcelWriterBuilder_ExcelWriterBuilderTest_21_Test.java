package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_ExcelWriterBuilderTest_21_Test {
  @Test
  public void ExcelWriterBuilderTest() throws Exception {
    // Arrange and Act
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();

    // Assert
    ExcelWriterSheetBuilder sheetResult = excelWriterBuilder.sheet();
    String toStringResult = excelWriterBuilder.toString();
    String toStringResult1 = sheetResult.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull((sheetResult.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
