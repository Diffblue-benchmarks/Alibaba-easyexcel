package com.alibaba.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelWriter_ExcelWriterTest_2_Test {
  @Test
  public void ExcelWriterTest() throws Exception {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ExcelTypeEnum typeEnum = ExcelTypeEnum.XLS;
    boolean needHead = true;

    // Act
    ExcelWriter excelWriter = new ExcelWriter(outputStream, typeEnum, needHead);

    // Assert
    Assert.assertNotNull(excelWriter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
