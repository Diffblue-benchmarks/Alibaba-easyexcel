package com.alibaba.excel.write.builder;

import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_registerWriteHandlerTest_8_Test {
  @Test
  public void registerWriteHandlerTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    WriteHandler writeHandler = (WriteHandler) null;

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.registerWriteHandler(writeHandler);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
