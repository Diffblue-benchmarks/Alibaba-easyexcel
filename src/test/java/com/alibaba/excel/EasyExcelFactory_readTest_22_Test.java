package com.alibaba.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.event.SyncReadListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EasyExcelFactory_readTest_22_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    Class head = (Class) null;
    SyncReadListener readListener = new SyncReadListener();

    // Act
    ExcelReaderBuilder actual = EasyExcelFactory.read(inputStream, head, readListener);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
