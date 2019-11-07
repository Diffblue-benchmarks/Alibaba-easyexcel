package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_ExcelWriterTest_9_Test {
  @Test
  public void ExcelWriterTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    ExcelWriter excelWriter = new ExcelWriter(writeWorkbook);

    // Assert
    Assert.assertNotNull(excelWriter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
