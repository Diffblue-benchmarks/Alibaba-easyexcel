package com.alibaba.excel.write.builder;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.write.builder.ExcelWriterTableBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterTableBuilder_ExcelWriterTableBuilderTest_2_Test {
  @Test
  public void ExcelWriterTableBuilderTest() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam(
        "Must use 'EasyExcelFactory.write().sheet().table()' to call this method", null, new ByteArrayOutputStream()));
    WriteSheet writeSheet = new WriteSheet();

    // Act
    ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder(excelWriter, writeSheet);

    // Assert
    Assert.assertNotNull(excelWriterTableBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
