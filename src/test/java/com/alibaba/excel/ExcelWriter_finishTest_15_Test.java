package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.parameter.GenerateParam;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_finishTest_15_Test {
  @Test
  public void finishTest() throws Exception {
    // Arrange
    ExcelWriter excelWriter = new ExcelWriter(new GenerateParam("aaaaa", null, new ByteArrayOutputStream()));

    // Act
    excelWriter.finish();

    // Assert
    Assert.assertNotNull(excelWriter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
