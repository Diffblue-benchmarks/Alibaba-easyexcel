package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_registerWriteHandlerTest_8_Test {
  @Test
  public void registerWriteHandlerTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
    LoopMergeStrategy writeHandler = new LoopMergeStrategy(1, 1);

    // Act
    ExcelWriterTableBuilder actual = excelWriterTableBuilder.registerWriteHandler(writeHandler);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
