package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_fileTest_22_Test {
  @Test
  public void fileTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.file(outputStream);

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
