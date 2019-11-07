package com.alibaba.excel.write.metadata;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbook_getExcelTypeTest_14_Test {
  @Test
  public void getExcelTypeTest() throws Exception {
    // Arrange
    WriteWorkbook writeWorkbook = new WriteWorkbook();

    // Act
    ExcelTypeEnum actual = writeWorkbook.getExcelType();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
