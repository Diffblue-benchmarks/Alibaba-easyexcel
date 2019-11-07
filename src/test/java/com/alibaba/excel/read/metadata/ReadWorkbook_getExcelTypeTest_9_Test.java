package com.alibaba.excel.read.metadata;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReadWorkbook_getExcelTypeTest_9_Test {
  @Test
  public void getExcelTypeTest() throws Exception {
    // Arrange
    ReadWorkbook readWorkbook = new ReadWorkbook();

    // Act
    ExcelTypeEnum actual = readWorkbook.getExcelType();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
