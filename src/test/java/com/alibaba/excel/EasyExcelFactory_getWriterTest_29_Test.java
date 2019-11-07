package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_getWriterTest_29_Test {
  @Test
  public void getWriterTest() throws Exception {
    // Arrange
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    // Act
    ExcelWriter actual = EasyExcelFactory.getWriter(outputStream);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
