package com.alibaba.excel.write.builder;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterSheetBuilder_ExcelWriterSheetBuilderTest_11_Test {
  @Test
  public void ExcelWriterSheetBuilderTest() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam(
        "Must use 'EasyExcelFactory.write().sheet()' to call this method", null, new ByteArrayOutputStream()));

    // Act
    ExcelWriterSheetBuilder excelWriterSheetBuilder = new ExcelWriterSheetBuilder(excelWriter);

    // Assert
    String toStringResult = excelWriterSheetBuilder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull((excelWriterSheetBuilder.table()).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
