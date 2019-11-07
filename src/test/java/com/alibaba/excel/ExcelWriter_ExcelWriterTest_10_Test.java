package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_ExcelWriterTest_10_Test {
  @Test
  public void ExcelWriterTest() throws Exception {
    // Arrange
    GenerateParam generateParam = new GenerateParam("aaaaa", null, new ByteArrayOutputStream());

    // Act
    ExcelWriter excelWriter = new ExcelWriter(generateParam);

    // Assert
    Assert.assertNotNull(excelWriter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
