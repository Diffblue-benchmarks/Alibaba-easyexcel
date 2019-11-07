package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_needHeadTest_12_Test {
  @Test
  public void needHeadTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    Boolean needHead = new Boolean(true);

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.needHead(needHead);

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
