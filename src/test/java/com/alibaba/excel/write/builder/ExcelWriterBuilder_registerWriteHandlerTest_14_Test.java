package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_registerWriteHandlerTest_14_Test {
  @Test
  public void registerWriteHandlerTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    LoopMergeStrategy writeHandler = new LoopMergeStrategy(1, 1);

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.registerWriteHandler(writeHandler);

    // Assert
    ExcelWriterSheetBuilder sheetResult = actual.sheet();
    String toStringResult = actual.toString();
    String toStringResult1 = sheetResult.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull((sheetResult.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
