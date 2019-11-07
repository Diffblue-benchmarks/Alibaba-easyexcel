package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_headTest_13_Test {
  @Test
  public void headTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    Class clazz = (Class) null;

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.head(clazz);

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
