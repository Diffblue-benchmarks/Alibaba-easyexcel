package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_relativeHeadRowIndexTest_20_Test {
  @Test
  public void relativeHeadRowIndexTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    Integer relativeHeadRowIndex = new Integer(1);

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.relativeHeadRowIndex(relativeHeadRowIndex);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
