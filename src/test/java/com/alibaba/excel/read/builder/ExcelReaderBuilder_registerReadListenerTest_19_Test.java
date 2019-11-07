package com.alibaba.excel.read.builder;

import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderBuilder_registerReadListenerTest_19_Test {
  @Test
  public void registerReadListenerTest() throws Exception {
    // Arrange
    ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderBuilder actual = excelReaderBuilder.registerReadListener(readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
