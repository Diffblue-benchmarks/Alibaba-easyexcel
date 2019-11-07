package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_relativeHeadRowIndexTest_11_Test {
  @Test
  public void relativeHeadRowIndexTest() throws Exception {
    // Arrange
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder();
    Integer relativeHeadRowIndex = new Integer(1);

    // Act
    ExcelWriterTableBuilder actual = excelWriterTableBuilder.relativeHeadRowIndex(relativeHeadRowIndex);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
