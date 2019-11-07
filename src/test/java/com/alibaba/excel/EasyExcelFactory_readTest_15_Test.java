package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readTest_15_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    String pathName = "aaaaa";
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderBuilder actual = EasyExcelFactory.read(pathName, readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
