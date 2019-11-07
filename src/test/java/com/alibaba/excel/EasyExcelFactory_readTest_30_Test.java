package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readTest_30_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    File file = new File("aaaaa");
    Class head = (Class) null;
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderBuilder actual = EasyExcelFactory.read(file, head, readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
