package com.alibaba.excel.read.builder;

import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExcelReaderSheetBuilder_registerReadListenerTest_5_Test {
  @Test
  public void registerReadListenerTest() throws Exception {
    // Arrange
    ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderSheetBuilder actual = excelReaderSheetBuilder.registerReadListener(readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
