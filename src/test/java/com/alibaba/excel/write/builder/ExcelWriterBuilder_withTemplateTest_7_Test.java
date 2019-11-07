package com.alibaba.excel.write.builder;

import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriterBuilder_withTemplateTest_7_Test {
  @Test
  public void withTemplateTest() throws Exception {
    // Arrange
    ExcelWriterBuilder excelWriterBuilder = new ExcelWriterBuilder();
    ByteArrayInputStream templateInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0});

    // Act
    ExcelWriterBuilder actual = excelWriterBuilder.withTemplate(templateInputStream);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
