package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_ExcelWriterTableBuilderTest_4_Test {
  @Test
  public void ExcelWriterTableBuilderTest() throws Exception {
    // Arrange and Act
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();

    // Assert
    Assert.assertNotNull(excelWriterTableBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
