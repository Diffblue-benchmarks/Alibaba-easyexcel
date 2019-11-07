package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_registerWriteHandlerTest_4_Test {
  @Test
  public void registerWriteHandlerTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    LoopMergeStrategy writeHandler = new LoopMergeStrategy(1, 1);

    // Act
    ExcelWriterSheetBuilder actual = excelWriterSheetBuilder.registerWriteHandler(writeHandler);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
