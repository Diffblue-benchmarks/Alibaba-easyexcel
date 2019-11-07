package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_headTest_9_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
    Class resultClass = (Class) null;

    // Act
    excelWriterTableBuilder.head(resultClass);

    // Assert
    Assert.assertEquals(null, resultClass);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
