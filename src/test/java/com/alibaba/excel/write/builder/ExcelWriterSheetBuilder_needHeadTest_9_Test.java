package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_needHeadTest_9_Test {
  @Test
  public void needHeadTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    Boolean needHead = new Boolean(true);

    // Act
    ExcelWriterSheetBuilder actual = excelWriterSheetBuilder.needHead(needHead);

    // Assert
    Assert.assertNotNull((actual.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
