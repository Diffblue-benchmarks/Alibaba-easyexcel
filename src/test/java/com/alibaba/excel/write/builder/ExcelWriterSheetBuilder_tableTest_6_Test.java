package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_tableTest_6_Test {
  @Test
  public void tableTest() throws Exception {
    // Arrange
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder();
    Integer tableNo = new Integer(1);

    // Act
    ExcelWriterTableBuilder actual = excelWriterSheetBuilder.table(tableNo);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
