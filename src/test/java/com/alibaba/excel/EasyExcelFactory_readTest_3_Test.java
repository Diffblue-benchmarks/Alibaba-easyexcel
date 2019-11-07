package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readTest_3_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    String pathName = "aaaaa";
    Class head = (Class) null;
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderBuilder actual = EasyExcelFactory.read(pathName, head, readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
